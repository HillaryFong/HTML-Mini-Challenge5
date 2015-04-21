package challenge.mini.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static final String url = "jdbc:mysql://localhost:3306/minichallengedb";
	static final String username = "root";
	static final String password = "p@ssword";
		public DBConnection(){}
		
		public static Connection getConnection(){
			//Create connection to db:
						
			Connection conn = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, username, password);
				
				return conn;
				
			} catch(ClassNotFoundException e){
				e.printStackTrace();
				
				
			} catch (SQLException e){
				e.printStackTrace();
			} //always need this
			return null;
		}
}
