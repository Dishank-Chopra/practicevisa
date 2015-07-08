package com.practice.wise;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.practice.wise.PracticeDatastore;
import com.google.gson.Gson;

import com.model.TotalUser;

@SuppressWarnings("serial")
public class PracticevisaServlet extends HttpServlet {
	
	 public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("In doGet!!");
	}
	 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException{
		response.setContentType("text/plain");
		PrintWriter out=response.getWriter();
		// int totalCount=0;
		 
		 try{
				
				String email=request.getParameter("email");
				PracticeDatastore count=new PracticeDatastore();
				int totalcount=count.saveUser(email);
				
				int total=count.countUser();
				 
				TotalUser usr=new TotalUser();
				usr.setTotaluser(total);
				
				String json1 = new Gson().toJson(usr);
				response.setContentType("application/json");
				response.getWriter().write(json1);
				 System.out.println("json try " +json1 );
				
				System.out.println(" total count in try "  +totalcount);
				request.setAttribute("count", totalcount);
				
				TotalUser user=new TotalUser();
				user.setTotaluser(totalcount);
				user.setEmail(email);
				
				String json = new Gson().toJson(user);
				response.setContentType("application/json");
				response.getWriter().write(json);
				
	//			response.sendRedirect("index.html");
					 
			}
		 catch(Exception e)
		 {
			 PracticeDatastore count=new PracticeDatastore();
			 System.out.println("Exception found!!");
			 int total=count.countUser();
			 
			 TotalUser usr=new TotalUser();
			 usr.setTotaluser(total);
			 
			 String json = new Gson().toJson(usr);
			 response.setContentType("application/json");
			 response.getWriter().write(json);
			 System.out.println(" json catch " +json );
			 
		 }
	}
}

			 
			 /* PracticeDatastore count=new PracticeDatastore();
		//	 System.out.println("Exception found!!");
			 int totalcount2=count.countUser();
		//	 System.out.println(".." +totalcount2);
		//     out.println("..  " +totalcount2);
		     
		     TotalUser user=new TotalUser();
		  	 user.setTotaluser(totalcount2);
			
		  	String json = new Gson().toJson(user);
			response.setContentType("application/json");
			response.getWriter().write(json);
			
	*/		// response.sendRedirect("index.html");
			
			/* String email=null;
			 if(email==null){
				 PracticeDatastore count=new PracticeDatastore();
					int totalcount=count.saveUser(email);
					System.out.println(" total count  "  +totalcount);
					//request.setAttribute("count", totalcount);
					
			 }*/
		 

		// response.getWriter().println("Hello");
		
		/* DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
	
		RequestDispatcher dispatcher;
		 boolean flag;
		 
		try
		{
	         String emailId = request.getParameter("email");
	         System.out.println(" Email is :  " +emailId);
	         out.println("Hello  " +emailId);
	         
	         Entity user=new Entity("RegUser",emailId);
		 	 user.setProperty("Name", emailId);
	         
		 	 datastore.put(user);
		  	
	        
	         flag=PracticeDatastore.saveUser(emailId);
	         System.out.println(" flag is :  " +flag);
	         out.println("flag is : " +flag);
	         if(flag)
	         {
	        	 System.out.println(" Inside Servlet  ");
	        	 out.println(" Inside Servlet ");
	        	// response.sendRedirect("index.html");
	        	 // dispatcher=getServletContext().getRequestDispatcher("index.html");		// request can also be used instead of getServletcontext
	        	 // dispatcher.forward(request, response);
	        	
	        	 // to show all the email ids present in datastore
	        	 Query q = new Query("User"); 
		         PreparedQuery pq = datastore.prepare(q);
		        	 
		         for (Entity result : pq.asIterable()) {
		        	 
		        	  emailId = (String) result.getProperty("Email");
		        	  out.println("email " +emailId);
		        	}
		        
		         // to show the total no of users on servlet that are present in datastore
		        totalCount = datastore.prepare(q).countEntities(FetchOptions.Builder.withDefaults());
	        	out.println(" total users are: " +totalCount);
	        	
	         }
	         else
	         {
	        	 System.out.println(" Failed.. Register Again");
	        	// dispatcher=getServletContext().getRequestDispatcher("index.html");		// request can also be used instead of getServletcontext
	        	// dispatcher.forward(request, response);
	         }				
		}			
		catch(Exception e)
		{
			System.out.println("Exception found ");
		}
		
		
*/	