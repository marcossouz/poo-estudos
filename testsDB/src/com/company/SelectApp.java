package com.company;

import java.sql.*;

public class SelectApp {

    private Connection connect(){
        String url = "jdbc:sqlite:test.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void selectAll(){
        String sql = "SELECT id, name, capacity FROM tab";

        try(Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            //loop through the result set
            while(rs.next()){
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getCapacityGreaterThan(double capacity){
        String sql = "SELECT id, name, capacity "
                + "FROM tab WHERE capacity > ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt  = conn.prepareStatement(sql)){

            // set the value
            pstmt.setDouble(1,capacity);
            //
            ResultSet rs  = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
