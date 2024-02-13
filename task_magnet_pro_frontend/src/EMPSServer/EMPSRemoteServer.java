package EMPSServer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EMPSRemoteServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Registry createRegistry = LocateRegistry.createRegistry(1218); //DataSaved & this value must be same
			EMPSInterface ri = new EMPSImplementation();
			createRegistry.bind("BoundServer", ri);//Binding to RMI registry 
			System.out.println("Server Started!");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
