/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.demodatabase;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author trung
 */
public class DemoCallProcedureDatabase {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost;database=Java5";
            String username = "sa";
            String password = "123456";
            Connection con = DriverManager.getConnection(connectionURL, username, password);
            
            String sql = "{call GetEmployeeName(?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            
            cstmt.setString(1, "N18DCAT023");
            cstmt.registerOutParameter(2, Types.NVARCHAR);
            cstmt.execute();
            
            String fullname= cstmt.getString(2);
            System.out.println(fullname);
            cstmt.close();
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
