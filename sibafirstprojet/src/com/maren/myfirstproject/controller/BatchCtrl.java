package com.maren.myfirstproject.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class BatchCtrl 
{
	public static Connection getConnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
}
 
    private static String INSERT = "INSERT INTO test.student (userid, name, email, mobile) VALUES (?, ?, ?, ?)";

    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn166 = null;
        PreparedStatement pstmt166 = null;
        PreparedStatement pstmt2166 = null;
        try {
            conn166 = getConnection();
        } catch (SQLException e) {
        	e.printStackTrace();
            System.err.println("There was an error getting the connection");
        }
        try {
            conn166.setAutoCommit(false);
            System.err.println("The autocommit was disabled!");
        } catch (SQLException e) {
            System.err.println("There was an error disabling autocommit");
        }
        // Starts JDBC Transaction
        try {
            pstmt166 = conn166.prepareStatement(INSERT);
            pstmt2166 = conn166.prepareStatement(INSERT);
             
            pstmt166.setInt(1,166);
            pstmt166.setString(2, "sibasish");
            pstmt166.setString(3, "sibasish@gmail.com");
            pstmt166.setInt(4,981060);
            
            pstmt166.addBatch();
            int[] count1=pstmt166.executeBatch();
             
            pstmt2166.setInt(1,138);
            pstmt2166.setString(2, "mohanty");
            pstmt2166.setString(3, "mohanty@gmail.com");
            pstmt2166.setInt(4,936572);
           
            pstmt2166.addBatch();
            
            int[] count=pstmt2166.executeBatch();             
            conn166.commit();
            System.err.println("The transaction was successfully executed");
        } catch (SQLException e) {
            try {
                //We rollback the transaction, atomicity!
                conn166.rollback();
                System.err.println(e.getMessage());
                System.err.println("The transaction was rollback");
            } catch (SQLException e1) {
                System.err.println("There was an error making a rollback");
            }
        }
    }
}