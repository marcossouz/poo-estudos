package com.company;

import java.io.*;
import java.sql.*;

public class CRUD {

    private Connection conect(){

        String url = "jdbc:sqlite:data.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void insert(String user, String pass){

        String sql = "INSERT INTO users(user, pass) VALUES(?,?)";

        try(Connection conn = this.conect(); PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1,user);
            pstmt.setString(2,pass);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectAll(){

        String sql = "SELECT id, user, pass FROM users";

        try(Connection conn = this.conect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println(rs.getInt("id") + "\t" + rs.getString("user") + "\t" + rs.getString("pass"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectUser(String user){
        String sql = "SELECT id, user, pass FROM users WHERE user = ?";

        try(Connection conn = this.conect(); PreparedStatement pstmt = conn.prepareStatement(sql)){

            boolean found = false;

            //set value
            pstmt.setString(1, user);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){

                found = true;

                System.out.println(rs.getInt("id") + "\t" + rs.getString("user") + "\t" + rs.getString("pass"));
            }

            if(!found) System.out.println("Usuário não encontrado");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updatePass(String user, String pass){

        String sql = "UPDATE users SET pass = ? WHERE user = ?";

        try(Connection conn = this.conect(); PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, pass);
            pstmt.setString(2, user);

            //update
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUser(String user){

        String sql = "DELETE FROM users WHERE user = ?";

        try (Connection conn = this.conect(); PreparedStatement pstmt = conn.prepareStatement(sql)){

            //set the corresponding param
            pstmt.setString(1, user);

            //execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
