package Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectToMySQL {
    static Connection connect = null;
    static Statement statement = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;

    public static ResultSet readDataBase(String query) throws Exception {
        
            // This will load the MySQL driver, each DB has its own driver
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           // System.out.print("Working");
        }
        catch (Exception e){ System.out.println("Not working");} 
            
    	
    	
            String connectionURL = "jdbc:mysql://127.0.0.1:3306/FleetPride?autoReconnect=true&useSSL=false";
            
            
            connect = DriverManager
                    .getConnection(connectionURL,"root","root");

            
            try { 
            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            
            //resultSet = statement.executeQuery("Select * from products");
            resultSet = statement.executeQuery(query);
           /* while (resultSet.next()) { // Process Results
                System.out.println(resultSet.getString("dsp_no"));

            }*/
            
            if (!resultSet.next()) {
				System.out.println("no data");
				resultSet.beforeFirst();
			}
    	
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return resultSet;
        } 
    
    

    /*public static void main(String[] args) throws Exception
    {
    	ConnectToMySQL obj = new ConnectToMySQL();
    	obj.readDataBase();
    }*/
    
      }
