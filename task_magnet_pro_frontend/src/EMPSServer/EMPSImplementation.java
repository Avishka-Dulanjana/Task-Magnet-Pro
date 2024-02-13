package EMPSServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class EMPSImplementation extends UnicastRemoteObject implements EMPSInterface {
	
	
	
	
	EMPSImplementation() throws RemoteException{} //remote exception for Default constructor 
	
	
	@Override
	public boolean addRecord(String feedbk)throws RemoteException {
		boolean retVal= false;
		 System.out.println(feedbk);
		try //try to send the feedback data sent by client rating app
		{
			retVal =  DBCRUD.dataWrite(feedbk);
			retVal=true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retVal;//returns boolean value saying weather the record was saved or not
	}

	@Override
	public int getRecord(int recID) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getIP() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean userAuth(String un, String pw) throws RemoteException {
		// TODO Auto-generated method stub
		boolean retVal = false;
		try {
			retVal=(DBCRUD.authenticateUN(un, pw));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}


	@Override
	public void serverUI(String uName) throws RemoteException {
		// TODO Auto-generated method stub
		ServerAdminUX.uname = uName;
		ServerAdminUX.main(null);
	}
	
	

}
