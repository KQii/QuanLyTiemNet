/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.demodatabase;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author trung
 */
public class DemoDatabase {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost;database=Java5";
            String username = "sa";
            String password = "123456";
            Connection con = DriverManager.getConnection(connectionURL, username, password);
            
            Statement stmt = con.createStatement();
            String sql = "select * from SinhVien";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(String.format("ID: %s - Fulname: %s - Tên: %s ", 
                         rs.getString("MaSV"), rs.getString("Holot"), rs.getString("Ten")));
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
