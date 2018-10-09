package com.company;

import java.sql.*;

public class Db {

    //Connect to a sample database
    public static void conect(String filename) {
        Connection conn = null;

        try {
            //db parameters
            String url = "jdbc:sqlite:" + filename;

            //create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void createNewDatabase(String filename){

        //cria no diretorio atual
        String url = "jdbc:sqlite:" + filename;

        try (Connection conn = DriverManager.getConnection(url)) {
            if(conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The drive name is" + meta.getDriverName());

                System.out.println("A new database has been created");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTable(){

        //SQLite connection string
        String url = "jdbc:sqlite:test.db";

        //SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS tab(\n"
                + " id integer PRIMARY KEY, \n"
                + " name text NOT NULL, \n"
                + " capacity real\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()){

            //create a new table
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
