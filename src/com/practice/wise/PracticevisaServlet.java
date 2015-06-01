package com.practice.wise;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

import com.practice.wise.PracticeDatastore;

@SuppressWarnings("serial")
public class PracticevisaServlet extends HttpServlet {
	
	/* public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("get lost!!");
	}
	*/ 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException{
		response.setContentType("text/plain");
	//	response.getWriter().println("Hello");
		
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		
		RequestDispatcher dispatcher;
		 boolean flag;
		 
		try
		{
	         String emailId = request.getParameter("email");
	         System.out.println(" Email is :  " +emailId);
	         response.getWriter().println("Hello  " +emailId);
	         
	      /*   Entity user=new Entity("RegUser",emailId);
		 	 user.setProperty("Name", emailId);
	         
		 	 datastore.put(user);
		  */	
	        
	         flag=PracticeDatastore.saveUser(emailId);
	         System.out.println(" flag is :  " +flag);
	         if(flag)
	         {
	        	 System.out.println(" connecting to index.html  ");
	        	 response.sendRedirect("index.html");
	        	 // dispatcher=getServletContext().getRequestDispatcher("index.html");		// request can also be used instead of getServletcontext
	        	 // dispatcher.forward(request, response);
	         }
	         else
	         {
	        	 System.out.println(" Failed.. Register Again");
	        	 dispatcher=getServletContext().getRequestDispatcher("index.html");		// request can also be used instead of getServletcontext
	        	 dispatcher.forward(request, response);
	         }				
		}			
		catch(Exception e)
		{
			System.out.println("Exception found regarding the dispachment of index.html!! ");
		}
		
		// response.getWriter().println(" total users are: " +totalCount);
		
		
	}
}
