package ie.gmit.sw;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import ie.gmit.models.CustOrder;

public interface DatabaseServer extends Remote{
	
	public List<CustOrder> read() throws RemoteException, SQLException;
	
	public String update(String s) throws RemoteException;
	
	public String create(String s) throws RemoteException;
	
	public String delete(String s) throws RemoteException;
}
