/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author trung
 */
public class DatabaseHelper {

    public static Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost;database=Java5";
        String username = "sa";
        String password = "123456";
        Connection con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
}
