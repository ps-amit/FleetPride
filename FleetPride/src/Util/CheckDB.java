package Util;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckDB {
public static void main(String[] args) throws SQLException {
	
	Connection connection = null;
	try {
		Class.forName("com.ibm.as400.access.AS400JDBCDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	//Properties properties = new Properties();

	//properties.setProperty("user", Constant.DB2UserName);
	//properties.setProperty("password", Constant.DB2Password);
	//String url = "jdbc:db2://" + Constant.DB2IP + ":" + Constant.DB2Port + "/" + Constant.DB2DatabaseName;
	
	String url="jdbc:AS400://FP825DEV";
	
	String name="BA5UAT1";
	String password="testba51";
	
	connection = DriverManager.getConnection(url, name, password);

	// Verify the Connection
	DatabaseMetaData metaData = connection.getMetaData();
	System.out.println("Database Name: " + metaData.getDatabaseProductName());
	System.out.println("Database Version: " + metaData.getDatabaseProductVersion());
	
}
}
