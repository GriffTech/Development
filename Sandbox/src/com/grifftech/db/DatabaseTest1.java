package com.grifftech.db;
/*
  03/03/2015
 SQLite Database Operations Test 1
 using a test db and also operations against the MM.DB
 .open "C:\\Users\\rgriffi3\\git\\Development\\Sandbox\\test.db"
 .schema <tablename>
 select * from COMPANY;




 * 
 * Next Steps - set up connections to 
 * 	MySQL, Oracle, SQL Server, Derby(?), Firebird other popular DB's ?
 * Oracle’s Database Lite, and Microsoft’s SQL Server Express. 
 * The open source databases MySQL and Firebird both offer embedded versions as well.
 */

import java.sql.*;

public class DatabaseTest1 {
	public static void main(String[] args) {
	    try {
	      Class.forName("org.sqlite.JDBC");
	      Connection conn = null;
	      conn = DriverManager.getConnection("jdbc:sqlite:test.db");
	      //conn = DriverManager.getConnection("jdbc:sqlite:C:\\RPGDATA1\\Dev-Dev\\Perl\\mm_playlists\\Copy of MM.DB");
	        

	      //conn = DriverManager.getConnection("jdbc:sqlite:D:\\testdb.db");
	      System.out.println("Opened database successfully");
	      
	     //insertData(conn);
	     //deleteRow(conn,5);
	     //updateRow(conn,1);
	     listTable(conn);
	     // listOfTables(conn);
	     //
	      conn.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    
	}
	

	static void  insertData(Connection conn) throws SQLException {
		Statement stmt = null;
		//Connection conn;
		try {
		stmt = conn.createStatement();
	      String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
	                   "VALUES (6, 'Russ', 32, 'California', 20000.00 );"; 
	      stmt.executeUpdate(sql);
	      System.out.println("Row created successfully");
		} finally {}
	}
	
	
	static void  deleteRow(Connection conn, int rowid) throws SQLException {
		Statement stmt = null;
		try {
		stmt = conn.createStatement();
	      String sql = "DELETE FROM COMPANY WHERE ID = "+rowid+";"; 
	      stmt.executeUpdate(sql);
	      System.out.println("Row "+rowid+" deleted successfully");
		} finally {}
	}

	
	static void  updateRow(Connection conn, int rowid) throws SQLException {
		Statement stmt = null;
		try {
			//conn.setAutoCommit(false);
	
			stmt = conn.createStatement();
			String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
			stmt.executeUpdate(sql);
			//conn.commit();
		} finally {}
    
	}
    
	 static void createTable(Connection conn) throws SQLException {
		Statement stmt = null;
		try {
	      stmt = conn.createStatement();
	      String sql = "CREATE TABLE COMPANY " +
	                   "(ID INT PRIMARY KEY     NOT NULL," +
	                   " NAME           TEXT    NOT NULL, " + 
	                   " AGE            INT     NOT NULL, " + 
	                   " ADDRESS        CHAR(50), " + 
	                   " SALARY         REAL)"; 
	      stmt.executeUpdate(sql);
	      stmt.close();
		
		} finally {}
	}
	 
	 static void listOfTables(Connection conn) throws SQLException {
			Statement stmt = null;
			try {
		      stmt = conn.createStatement();     
		      ResultSet rs = stmt.executeQuery( "SELECT name FROM sqlite_master WHERE type='table'" );
		      while ( rs.next() ) {
			        // int id = rs.getInt("id");
			        // String  name = rs.getString("name");
			        // int age  = rs.getInt("age");
			         String  name = rs.getString("name");
			        // float salary = rs.getFloat("salary");
			         System.out.println( "Table: " + name );
			      }
			      rs.close();
			      
			      stmt.close();
				
				} finally {}
	 }
	 
	 	
	 static void listTable(Connection conn) throws SQLException {
		Statement stmt = null;
		try {
	      stmt = conn.createStatement();
	      String sql_select = "SELECT * from COMPANY "; 
	      
	      ResultSet rs = stmt.executeQuery( sql_select+";" );
	      while ( rs.next() ) {
	         int id = rs.getInt("id");
	         String  name = rs.getString("name");
	         int age  = rs.getInt("age");
	         String  address = rs.getString("address");
	         float salary = rs.getFloat("salary");
	         System.out.println( "ID = " + id );
	         System.out.println( "NAME = " + name );
	         System.out.println( "AGE = " + age );
	         System.out.println( "ADDRESS = " + address );
	         System.out.println( "SALARY = " + salary );
	         System.out.println();
	      }
	      rs.close();
	      
	      stmt.close();
		
		} finally {}
	}
}

