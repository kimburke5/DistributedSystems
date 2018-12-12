package ie.gmit.sw;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import ie.gmit.models.CustOrder;

public class rmiClient {

	private DatabaseServer db;
	
	public rmiClient() throws MalformedURLException, RemoteException, NotBoundException{
		db = (DatabaseServer) Naming.lookup("rmi://127.0.0.1:1099/DatabaseServer");
		System.out.println("connectionRMIclient");
	}
	
	/*public void GetData() throws Exception {
		db.read();
	}*/
	public List<CustOrder> GetData() throws Exception {
		return db.read();
	}

}
