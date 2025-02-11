/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posyandu;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DBaseConnect {
    final static String DBase_URL="jdbc:mysql://localhost:3307/pbo_posyandu";
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String USER ="root";
    final static String PASSWORD="";
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DBase_URL,USER,PASSWORD);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }
        return null;
    }
}


