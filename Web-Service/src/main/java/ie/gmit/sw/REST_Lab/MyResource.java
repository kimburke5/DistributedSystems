package ie.gmit.sw.REST_Lab;

import javax.ws.rs.PathParam;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.models.CustOrder;
import ie.gmit.sw.DatabaseServer;
import ie.gmit.sw.rmiClient;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws SQLException 
     */
	 /* 
	  * 
	  * @Path("/{Value}")
    	public String getIt(@PathParam("Value")String Value) throws Exception {
        System.out.println("My name is: " + Value);
    	return "Got it!";
    	System.out.println("connection");*/
    
	@GET
    //@Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	
    public List<CustOrder> getIt() throws Exception{
    	/*DatabaseServer db;
    	db = (DatabaseServer) Naming.lookup("rmi://127.0.0.1:1099/DatabaseServer");
		db.read();*/
    	rmiClient rmi = new rmiClient();
    	//List<CustOrder>dataList =rmi.GetData();
    	//String data1 = dataList.get(1).toString();
    	return rmi.GetData();
	}
    
    
    
    
}
