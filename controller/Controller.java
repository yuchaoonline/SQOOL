package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

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
          
          Statement stmt = con.createStatement ();
 		 String sqlStr = "SELECT *";
 				 sqlStr += "FROM Student";
 				 ResultSet rset = stmt.executeQuery (sqlStr);
 				 
 				 while (rset.next ()) {
 					 System.out.println (rset.getString (1) + " " + 
 					 rset.getString (2) + " " + 
 					 rset.getString (3) + " " + 
 					 rset.getString(4) );
 					 }
 				 stmt.execute ("create table testtable(x varchar(10));");
		 }
		 
		 catch(Exception e) {
    	 
			 e.printStackTrace();
			 System.out.println(e.getMessage()); 
			 System.exit(0);
			 
			
			 }
		  
		 } 
	 } 
