package EMPSServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EMPSInterface extends Remote {
		
	
		
	public boolean addRecord(String feedbk)throws RemoteException;
			
	public int getRecord(int recID )throws RemoteException;
		
	public String getIP ()throws RemoteException;
	
	boolean userAuth(String un, String pw) throws RemoteException;

	public void serverUI(String uName)throws RemoteException;	

}
