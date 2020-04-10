package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbDao.DbService;

//import com.capg.assign.dao.DatabaseConnection;


public class ResponseServlet extends HttpServlet {
	
    public ResponseServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		int seat=Integer.parseInt(request.getParameter("seat"));
		out.print( seat);
		String tname=request.getParameter("trainingName");
	    out.print(" "+tname);
		if(seat!=0) {
			
			
		try {
			Connection con=DbService.getDbConnect();
			Statement stmt=con.createStatement();
			
			
				
				out.print("Hi you have successfully enrolled for spring training");
				String query=" UPDATE TRAINING SET AvailableSeats ='"+--seat+"' WHERE trainingName ='"+tname+"'"; 
				stmt.executeUpdate(query);
				out.print("<br>seat ="+seat);
				}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

		}else
		{
			out.print("no seats available");
		}
		
		
		
	

	
		
	}
	}
