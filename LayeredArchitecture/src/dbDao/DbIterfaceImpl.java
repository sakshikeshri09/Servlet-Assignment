package dbDao;

import java.sql.Connection;
import java.sql.SQLException;

public class DbIterfaceImpl implements DbInterface{

	
	 static Connection  con;
	 public  Connection getConnection()  {
		 try {
			con=DbService.getDbConnect();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return con;
	 }
}
