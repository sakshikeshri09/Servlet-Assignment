package com.capg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Servlet2() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
	
			String name=request.getParameter("uname");
			String pass=request.getParameter("password");
			String result="valid";
			if(name.equals("Sakshi")&& pass.equals("sakshi123"))
			{
				result="invalid";
				request.setAttribute("result", result);
				request.setAttribute("name", name);request.setAttribute("pass", pass);
				request.getRequestDispatcher("form2.html").include(request,response);
				System.out.println(" done");
			}
			else
			{
				request.setAttribute("result", result);
				request.setAttribute("name", name);
				request.setAttribute("pass", pass);
				request.getRequestDispatcher("from3.html").include(request,response);
				System.out.println("invalid");
			}
			out.print("name "+name+" "+"password "+pass);
			
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
