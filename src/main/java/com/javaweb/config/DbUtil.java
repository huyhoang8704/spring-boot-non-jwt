package com.javaweb.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DbUtil {
    private static String url = "jdbc:mysql://localhost:3306/northwind?useSSL=false&autoReconnect=true";
    private static String user = "root";
    private static String password = "080704";


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return (Connection) DriverManager.getConnection(url, user, password);
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Connection con = getConnection();
        if(con != null) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Customers where CustomerID >= 10");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } else {
            System.out.println("Error!");
        }
    }
}
