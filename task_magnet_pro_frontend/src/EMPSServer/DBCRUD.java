package EMPSServer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class DBCRUD {
	static Connection connect = SQLiteconnection.dbConnector(); //connecting to the database
	
	public static boolean authenticateUN(String name, String pass)throws Exception //user authentication
 {
		String txtUname = name;
		String txtUpass = pass;
		boolean result = false ;
		try {
			String query = "SELECT * FROM users WHERE uName=? AND uPass=?";
			PreparedStatement pst= connect.prepareStatement(query);
			pst.setString(1, txtUname);
			pst.setString(2, txtUpass);
			ResultSet rs= pst.executeQuery();
			
			
			int count = 0;
			while(rs.next()) {
				count +=1;						
			}
				if(count==1) {
				result = true;
				}else {
				result=false;
				}
			rs.close();
			pst.close();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return result;
	}

	public static String getUserList()throws Exception //get the list of users and respective user types from the DB
	 {
			
			String result = "User\t\tUser Type\r\n-----------------------------------------------------------------------------------\r\n" ;
			try {
				String query = "SELECT * FROM users";
				PreparedStatement pst= connect.prepareStatement(query);
				ResultSet rs= pst.executeQuery();
			
				while(rs.next()) {
					//count +=1;	
					result +=rs.getString("uName")+"\t\t"+rs.getString("uType")+"\r\n";					
				}
					
				rs.close();
				pst.close();
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
			return result;
		}

	
	public static boolean dataWrite(String feedback) throws Exception //write received feedback data into DB
	{
	      boolean result = false;
		  String sampleString = feedback;
		  System.out.println(sampleString);
	      String[] stringArray = sampleString.split(",");
	      int[] intArray = new int[7];
	      for (int i = 0; i < 7; i++) {
	         String numberAsString = stringArray[i];
	         intArray[i] = Integer.parseInt(numberAsString);
	      }
	      System.out.println(Arrays.toString(intArray));
	      
	      try {
	    	  	String query = "INSERT INTO record VALUES(null,?,?,?,?,?,?,?);";//sql query preperation
				PreparedStatement pst= connect.prepareStatement(query);
			
			  pst.setString(1, stringArray[0]); 
			  pst.setString(2, stringArray[1]);
			  pst.setString(3, stringArray[2]); 
			  pst.setString(4, stringArray[3]);
			  pst.setString(5, stringArray[4]); 
			  pst.setString(6, stringArray[5]);
			  pst.setString(7, stringArray[6]); 
			//  pst.setString(8,stringArray[7]);
			//  pst.setString(9, stringArray[8]);
			  //pst.setString(10, stringArray[9]);
				
				pst.executeUpdate();
				pst.close();
				System.out.println("Data Successfully Written into DB!");
				result = true;
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
				result =false;
			}

		return result;
	}

	public static boolean addUser(String name, String pass, String type) throws Exception //insert new user 
	{
	      boolean result = false;
		  String u_name = name;
		  String u_type = type;
		  String u_pass = pass;
	      
	      
	      try {
	    	  	String query = "INSERT INTO users (uName,uPass,uType) VALUES('"+u_name+"','"+u_pass+"','"+u_type+"');";//sql query preparation
				PreparedStatement pst= connect.prepareStatement(query);
			
				pst.executeUpdate();
				pst.close();
				System.out.println("New User Succesfully Added !");
				result = true;
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
				result =false;
			}

		return result;
	}
	
	public static String getRecordByID(int id)throws Exception//get feedback record by ID
	{
		String result=null;
		try {
			String query = "SELECT * FROM record WHERE recID=?";
			PreparedStatement pst= connect.prepareStatement(query);
			pst.setString(1, Integer.toString(id));
			ResultSet rs= pst.executeQuery();
		
			//following creates the return string for the corresponding rating values from the db for the .
			result = 
			  rs.getString("q1Rating")+","
			+ rs.getString("q2Rating")+","
			+ rs.getString("q3Rating")+","
			+ rs.getString("q4Rating")+","
			+ rs.getString("q5Rating")+","
			+ rs.getString("q6Rating")+","
			+ rs.getString("q7Rating");
			//+rs.getString(" q8Rating")+","
			//+rs.getString(" q9Rating")+","
			//+rs.getString(" q10Rating");
			rs.close();
			pst.close();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return result;
	}
	
	
	public static int recCount()throws Exception//get record count
	{
		int result = 0;
		try {
			String query = "SELECT COUNT(*) FROM record";
			PreparedStatement pst= connect.prepareStatement(query);
			ResultSet rs= pst.executeQuery();
			
			result = rs.getInt(1);
			rs.close();
			pst.close();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return result;
	}
	
	public static int[] qStarCount(int qNo)throws Exception//get rating count for given question number
	{
		int result = 0;
		int[] stars = new int[10];
		String j = null;
		String q = null;
		try {
			for(int i=0; i<10;i++) {
			
			j =Integer.toString(i+1);
			q = "q"+Integer.toString(qNo)+"Rating";
			
			String query = "SELECT COUNT(*) FROM record WHERE "+q+" = ?";
			PreparedStatement pst= connect.prepareStatement(query);
			
			pst.setString(1,j);			
			
			
			ResultSet rs= pst.executeQuery();
			stars[i] = rs.getInt(1);			
			result = rs.getInt(1);
			rs.close();
			pst.close();
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return (stars);
	}
}


