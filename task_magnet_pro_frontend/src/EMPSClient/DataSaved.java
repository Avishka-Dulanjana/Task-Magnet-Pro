package EMPSClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import EMPSServer.EMPSInterface;

public class DataSaved {
	public static int[] ratings = new int[10];
	public static String lookupString= "rmi://localhost:1218/BoundServer";
	
 public static void sendData() {
	
	try {
		EMPSInterface remoteInterface = (EMPSInterface)Naming.lookup(lookupString);
		//System.out.println("Survey answers : " + Arrays.toString(ratings));

	String sendData = ""; //Arrays.toString(ratings);
	for(int i = 0; i < 10; i++) {
		sendData += ratings[i]+",";
	}
	//System.out.println(sendData.substring(0, sendData.length() - 1));
	System.out.println(remoteInterface.addRecord(sendData.substring(0, sendData.length() - 1)));
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 
 public static boolean userLogin(String u, String p) {
	 boolean auth = false;
	 try {
		EMPSInterface remoteInterface = (EMPSInterface)Naming.lookup(lookupString);
		auth = (remoteInterface.userAuth(u, p));		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return auth;
	 
 }
  
 public static void serverUI(String uName) {
	 try {
			EMPSInterface remoteInterface = (EMPSInterface)Naming.lookup(lookupString);
			
		remoteInterface.serverUI(uName);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
 }
	
}
