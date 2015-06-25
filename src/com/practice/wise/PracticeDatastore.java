package com.practice.wise;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.*;

public class PracticeDatastore {

	// PracticeDatastore pd=new PracticeDatastore();
	
	private static final Logger log=Logger.getLogger(PracticeDatastore.class.getName());
	private static DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
	public static int totalCount=0;
	
	public int countUser(){
		Entity user;
		int count;
		Query q = new Query("User"); 
		PreparedQuery pq = datastore.prepare(q);
   	 
        for (Entity result : pq.asIterable()) {
       	 
       	//  emailId = (String) result.getProperty("Email");
        	// System.out.println("totalcount : " +totalCount);
       	}
        
		return totalCount;
	}
	
	public static int saveUser(String emailId)
	{
	
		// get user, if they don't exist create entity with default values
		Entity user;
		try
		{
			user=datastore.get(KeyFactory.createKey("User", emailId));
			
		}
		catch(EntityNotFoundException enf)
		{	
			// create an entity
			user=new Entity("User", emailId);
			// set the properties
			user.setProperty("Email", emailId);
		}
		// save the user via put operation
				datastore.put(user);
				
				// count the total no. of records
				
				Query qry = new Query("User");
				totalCount = datastore.prepare(qry).countEntities(FetchOptions.Builder.withDefaults());
				
				System.out.println(" total users in datastore are: " +totalCount);
			
				
	//	log.info(qry.toString());
	//	log.info(emailId);
		
		return totalCount;
	}
	
	
	/*  public static void main(String args[])
	{
		PracticeDatastore pd=new PracticeDatastore();
		PracticevisaServlet pvs=new PracticevisaServlet();
		
	}
		*/
	
}
