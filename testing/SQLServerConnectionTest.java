package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConnectionTest {
	 public static void main(String args[]) {  
		 
		 try { 
 
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
          String connectionUrl = "jdbc:sqlserver://oxeiuqtake.database.windows.net;" + 
                                  "database = SQOOL_db;" + 
                                  "user = SQOOL_user;" + 
                                  "password = Hj34rT11"; 
          
          Connection con = DriverManager.getConnection(connectionUrl); 
          System.out.println("Connected!"); 
		 }
		 
		 catch(Exception e) {
    	 
			 e.printStackTrace();
			 System.out.println(e.getMessage()); 
			 System.exit(0);
			 
		 } 
	 } 
}
