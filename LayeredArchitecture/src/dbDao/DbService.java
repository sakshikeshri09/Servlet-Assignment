package dbDao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DbService {

	static  Connection con;
	public static Connection getDbConnect() throws SQLException,ClassNotFoundException{
	
		// String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		// String user = "capgemini"; 
	    // String pass = "password";   
        //step1 load the driver class   
       
        //register driver
        //  DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
        //step2 create  the connection object  
		 //step3 create the statement object
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
         
      Connection  con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","capgemini","password");  
		
     
	  return con;
      
}
	
	
}//end of class
