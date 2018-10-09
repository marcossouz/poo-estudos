package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertApp {

    /**
     * Connect to the test.db database
     * @return the Connection object
     */
    private Connection connection(){

        //SQLite connection string
        String url = "jdbc:sqlite:test.db";
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        return conn;
    }

    public void insert(String name, double capacity){

        String sql = "INSERT INTO tab(name, capacity) VALUES(?,?)";

        try(Connection conn = this.connection(); PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();

            System.out.println("dado inserido");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
