package Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

import Configuration.ActionKeyword;
import Configuration.Constant;

public class SalesForceDB {

static final String USERNAME = "dgoel@fleetpride.com.uat";
//static final String PASSWORD = "Fleet@4321l3wQncg7oR8zuptbIhlZUYuF";
static final String PASSWORD   = "Fleet@1234644XIyWXuSXH54KBTv6WFnMq4";
static PartnerConnection connection;

 public static void queryContacts(String attribute,String query) throws IOException {
	 
	 

	 ConnectorConfig config = new ConnectorConfig();
       config.setUsername(USERNAME);
       config.setPassword(PASSWORD);
       
       try {
           
            	  connection =com.sforce.soap.partner.Connector.newConnection(config);

           // run the different examples
         
       } catch (ConnectionException e1) {
           e1.printStackTrace();
       }

	
	 
	 System.out.println("-----------------------------------------------------------------------------------"); 
	 System.out.println("\n");
	 System.out.println("\n");
	 System.out.println("\n");
	 System.out.println("\n");
	 System.out.println("\n");
	 System.out.println("\n");
	 System.out.println("\n");
	 
	 String FILENAME = "C:\\Automation_Framework_Puresoftware_New\\src\\DataEngine\\config.properties";
	 
	 File FC = new File(FILENAME);
	  FC.createNewFile();
	 
	 
	  FileWriter FW = new FileWriter(FILENAME);
	  BufferedWriter BW = new BufferedWriter(FW);
	 
	  BW.write("*****************\r\n" + 
				"#Login Details:\r\n" + 
				"*****************\r\n" + 
				"\r\n" + 
				"config.username=test.auto@epdc.com\r\n" + 
				"config.password=test@1234\r\n" + 
				"config.username_CA=amit.singh@puresoftware.com\r\n" + 
				"config.password2=amitsingh1234");
	  BW.newLine();
		
		
				

	  BW.write("******************************\r\n" + 
				"#Excel File Location Details:\r\n" + 
				"******************************\r\n" + 
				"Note: Please change the Path of below Excel File according to your System Download Location, or place the Excel File in the below location,Followed by the TAB Name in the \r\n" + 
				"Excel for which Data is to be Verified. Eg. To Check Overview Page, Replace Detail Data with Rate Overview\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"config.file.sheet1=C:\\\\Automation_Framework_Puresoftware_New\\\\src\\\\DataEngine\\\\PDC_Top_100_Template.csv\r\n" + 
				"\r\n" + 
				"Note: Maximum Excel File Size Can be Upto 2-3MB.");
				
	  BW.newLine();
		
		

	  BW.write("******************"
		    		+ "#Constant Details:"
		    		+ "******************");
		  
	  
	  BW.newLine();
	  BW.write("config.orderlistname=OrderList20");
		
	
	  BW.newLine();
	  
	  BW.write("config.orderlistname=OrderList25");
	  BW.newLine();
	  BW.write("config.productname=Conspicuity Tape");
	  BW.newLine();
			  BW.write("config.dsp_productname=43152");
			  BW.newLine();
					  BW.write("config.incorrectsearchdata=dgfdgfdg");
					  BW.newLine();
							  BW.write("config.datalessthan2characters=a");
							  BW.newLine();
	          
		
try {
	        
	       	
	    	com.sforce.soap.partner.QueryResult queryResults = connection.query(query);
	        	       	
	       	if (queryResults.getSize() > 0) {

	       		
	    			 for (int i=0;i<queryResults.getRecords().length;i++) {
	   com.sforce.soap.partner.sobject.SObject result = (com.sforce.soap.partner.sobject.SObject) queryResults.getRecords()[i];;
           
	   System.out.println("\n");
	   
       System.out.println("config.partnumber3="+ 
       	result.getField(attribute));
	   
       BW.write("config.partnumber3=");
		  BW.write((String) result.getField(attribute));
		  BW.close();
       
		
       
       
       ActionKeyword.ValueCaptured.add(result.getField(attribute).toString());
		int size = ActionKeyword.ValueCaptured.size();
		size = size - 1;
		ActionKeyword.infoMessage = "value "+result.getField(attribute)+"   has been stored on index  "
				+ ActionKeyword.ValueCaptured.get(size);
     }	
	    						
}
	        
			 System.out.println(queryResults);
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("\n");
			 System.out.println("-----------------------------------------------------------------------------------"); 
	    	
	    	
	    } catch (Exception e) {
	      e.printStackTrace();
	    }   
	  }
 
}
