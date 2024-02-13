package EMPSClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;

import EMPSServer.EMPSInterface;

public class EMPSRemoteClient {
	public static int[] dataset = new int[10];
	
	public static void main(String[] args) {
		String lookupString= "rmi://localhost:1212/BoundServer";
		try {
			EMPSInterface remoteInterface = (EMPSInterface)Naming.lookup(lookupString);
	
		String sendData = Arrays.toString(dataset);
		System.out.println(sendData);
		remoteInterface.addRecord(sendData);
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
