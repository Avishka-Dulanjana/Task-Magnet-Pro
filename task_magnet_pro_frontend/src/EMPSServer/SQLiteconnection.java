package EMPSServer;
import java.sql.*;
import javax.swing.*;

public class SQLiteconnection {
	Connection conn = null;
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:userFeedbackDB.db");
			//JOptionPane.showMessageDialog(null, "DB Connection Successful. !");
			System.out.println("DB connection Successful!");
			return conn;
		}catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
		return null;
		}
	}

}
