package Util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import Configuration.Constant;

public class DatabaseUtil {

	Connection connection = null;
	Statement statement = null;
	static ResultSet resultSet = null;
	ResultSet ReturnresultSet = null;

	public DatabaseUtil() {
		connection = getConnection();
	}

	public ResultSet executeQuery(String query) {

		String schemaName = Constant.Schema;
		if (schemaName != null && schemaName.length() != 0) {
			try {
				statement = connection.createStatement();
				statement.executeUpdate("set current sqlid = " + schemaName);
				System.out.println("The schema is set successfully.");
			} catch (SQLException exception) {
				exception.printStackTrace();

			}
		}
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			resultSet = statement.executeQuery(query);

			if (!resultSet.next()) {
				System.out.println("no data");
				resultSet.beforeFirst();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultSet;

	}

	public void CloseDB() {
		try {
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			Log.error(e.getStackTrace().toString());
			ExtentLogs.error(e.getStackTrace().toString());
		}
	}

	private static Connection getConnection() {

		Connection connection = null;

		try {
			
			Class.forName("com.ibm.as400.access.AS400JDBCDriver");

			String url="jdbc:AS400://FP825DEV";
			
			String name="BA5UAT1";
			String password="testba51";
			
			connection = DriverManager.getConnection(url, name, password);

			// Verify the Connection
			DatabaseMetaData metaData = connection.getMetaData();
			//System.out.println("Database Name: " + metaData.getDatabaseProductName());
			//System.out.println("Database Version: " + metaData.getDatabaseProductVersion());
			
		} catch (ClassNotFoundException e) {
			Log.error(e.getStackTrace().toString());
			ExtentLogs.error(e.getStackTrace().toString());
		} catch (SQLException e) {
			Log.error(e.getStackTrace().toString());
			ExtentLogs.error(e.getStackTrace().toString());
		}
		return connection;
	}
}