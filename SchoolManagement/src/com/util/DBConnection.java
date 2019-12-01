
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String DB_CLASS="com.mysql.jdbc.Driver";
    private static final String DB_URL="jdbc:mysql://localhost:3306/school_management";
    private static final String DB_USER="root";
    private static final String DB_PASS="";
    
    private static Connection con=null;

  
    
    static{
        try {
            Class.forName(DB_CLASS);
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } 
        catch ( ClassNotFoundException |SQLException ex) {
            
            ex.printStackTrace();
         
        }
       
        }
     public static Connection getConnection() {
        return con;
    
}
}
