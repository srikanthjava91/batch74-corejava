package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo14 {

	public static void main(String[] args) throws SQLException {
		System.out.println("main method started !!");

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			///		Step 1: Loading the Driver class
//		forName method : Returns the Class object associated with the class 
//		or interface with the given string name.
//		Loading or creating the Objects from Secondary Memory to Primary memory is the concept of 
//		Reflection API, Because of this Java is Dynamic.

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class Loaded into your primary location.");

			///		Step 2: Establish the Connection Between the JDBC & MYSQL
//		Attempts to establish a connection to the given database URL.
//		A connection(interface) (session) with a specific database. 
//		SQL statements are executed and results are returned within the context of a connection.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");
			System.out.println("Your Connection has been established ");

//		Step 3: Create a Statement Object
//		createStatement() -> Creates a Statement object for sending SQL statements to the database.
//		Statement(interface): The object used for executing a static SQL statement and returning the results it produces.
			stmt = con.createStatement();

			// Step 4: Create a ResultSet
//		executeQuery() -> Executes the given SQL statement, 
//		which returns a single ResultSet object.
			String sql = "select * from employee";
			rs = stmt.executeQuery(sql);

			// Step 5 : Representing the Data
			// next() --> Moves the cursor forward one row from its current position.
			while (rs.next()) {
				System.out.println("*********************");
				System.out.print(rs.getInt(1) + " | ");
				System.out.print(rs.getString(2) + " |  ");
				System.out.print(rs.getString(3) + " | ");
				System.out.print(rs.getInt(4) + " | ");
			}

		} catch (SQLException | ClassNotFoundException ex) {
			System.err.println("in catch ");
		} 
		
		
//		Step 6 : Closing all the Connection Related Objects.
		
		finally {
			con.close();
			stmt.close();
			rs.close();
		}

	}

}
