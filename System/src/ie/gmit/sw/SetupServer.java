package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SetupServer {
	public static void main(String[] args) throws Exception {
		DatabaseServer db = new ServerImplement();
		
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("DatabaseServer", db);
		
		System.out.println("Server Running");
	}

}
