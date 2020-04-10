package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbDao.DbService;

//import com.capg.assign.dao.DatabaseConnection;

public class DbServlet extends HttpServlet {
	
    public DbServlet() {   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		out.print("<table><tr><td>TraingId</td><td>TrainingName</td><td>AvailableSeats</td></tr>");
try {
		Connection con=DbService.getDbConnect();
		out.print("connection established.....");
		out.print("connection:"+con+"<br>");
		Statement stmt=con.createStatement();
		 
		//write the sql query
		String sql="Select * from Training";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next())
		{
			
			out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td><a href='ResponseServlet?trainingName="+rs.getString(2)+"&&seat="+rs.getInt(3)+"'>Enroll</a></td>");
			
		}
		out.print("</table>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}}
