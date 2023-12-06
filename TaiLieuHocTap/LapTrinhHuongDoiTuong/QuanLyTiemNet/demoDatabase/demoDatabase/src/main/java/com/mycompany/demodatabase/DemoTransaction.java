/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.demodatabase;

import com.ptithcm.helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author trung
 */
public class DemoTransaction {

    public static void main(String[] args) {
        String sql = "insert into USERS (USERNAME, PASSWORD,ENABLED,userRole) values (?,?,?,?)";
        //String sql = "insert into brands (brand_name) values (?)";
        try (Connection con = DatabaseHelper.openConnection(); ) {
            
            try( PreparedStatement pstmt = con.prepareStatement(sql);   
                    ) {
                    con.setAutoCommit(false);
                    pstmt.setString(1, "user2");
                    pstmt.setString(2, "$2a$12$sbvlbTw991./GqyFIs5dFu12revkRxoZ7gWcgdAsATfm2Cbn8NAf6");
                    pstmt.setInt(3, 1);
                    pstmt.setString(4, "ROLE_USER");
                    pstmt.executeUpdate();
                    System.out.println("1 User inserted ;");
                    //con.commit();
                    con.rollback();
            } catch (Exception e) {
                 con.rollback();
            } finally {
                con.setAutoCommit(true);
            }
        
         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
