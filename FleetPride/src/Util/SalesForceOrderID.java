package Util;

import java.io.IOException;

import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

import Configuration.ActionKeyword;
import Configuration.Constant;

public class SalesForceOrderID {

static final String USERNAME = "dgoel@fleetpride.com.uat";
static final String PASSWORD = "Fleet@4321l3wQncg7oR8zuptbIhlZUYuF";
static PartnerConnection connection;

 public static void query2fetchorderID(String attribute,String query) throws IOException {
	 
	 

	 ConnectorConfig config = new ConnectorConfig();
       config.setUsername(USERNAME);
       config.setPassword(PASSWORD);
       
       try {
           
            	  connection =com.sforce.soap.partner.Connector.newConnection(config);

           // run the different examples
         
       } catch (ConnectionException e1) {
           e1.printStackTrace();
       }

	
	
try {
	        
	       	com.sforce.soap.partner.QueryResult queryResults = connection.query(query);
	        	       	
	       // try {
	 	       
		    	//com.sforce.soap.partner.QueryResult queryResults = connection.query("select ccrz__OrderId__c from Ccrz__E_Order__c where Name='O-0000001111'");
		    	
		    	com.sforce.soap.partner.sobject.SObject c = (com.sforce.soap.partner.sobject.SObject) queryResults.getRecords()[0];
		          //System.out.println(" Order Id: " + c.getField(attribute)) ;
		    	System.out.println(c.getField(attribute));
		    
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    }   
	  }
 
}
