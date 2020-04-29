package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.collections.MappingChange.Map;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	
    public DisplayServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.setContentType("text/html");  
	      PrintWriter out = response.getWriter();
	     
	      
	      //getting value from the query string  
	        String technology=request.getParameter("technology"); 
	       int pincode=(Integer.parseInt(request.getParameter("pincode")));
	  
	       
	     
	       //create the Hashmap
	       HashMap<Integer, String> map = new HashMap<Integer, String>();
	       map.put(110058,"Jaipur");
	       map.put(120163,"Greater Noida");
	      
	       
	       //for comparing the keys and and technology
	       
	       boolean flag=false;
	       for ( Integer key : map.keySet() ) {
	    	   
	    	  
	    	   
	    	   if(key==pincode&& technology.equalsIgnoreCase("java"))
	    	   {
	    		   out.print("technology: "+technology);
	    		   out.print("pincoe :"+pincode);
	    		   out.print("city is: "+map.get(key));
	    		   out.print("jobs are");
	    		   out.print("Java Developer");
	    		   out.print("Full Stack Developer");
	    		   out.print("Java Trainer");
	    		   flag=true;
	   			
	    	   }
	    	   
	    	   if(key==pincode&& technology.equalsIgnoreCase("javascript"))
	    	   {
	    		   out.println("technology: "+technology);
	    		   out.println("pincoe :"+pincode);
	    		   out.println("city is: "+map.get(key));
	    		   out.println("jobs are");
	    		   out.println("JavaScript Developer");
	    		   out.println("Web Developer");
	    		   flag=true;
	    		   
	    	   }
	    	   
	    	   
	    	}
	       
	       if(flag==false)
	       {
	    	   out.print("<h1>pincode or city doesn't exist</h1>");
	       }
	       
	     
		
		
	}

	
	

}
