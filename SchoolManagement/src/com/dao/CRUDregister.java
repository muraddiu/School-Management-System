package com.dao;

import com.model.Register;
import com.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDregister {

    //************For Data Insert********************
    public static int inserData(Register reg) {
        String username = reg.getUsername();
        String email = reg.getEmail();
        String password = reg.getPassword();

        Connection con = DBConnection.getConnection();
        int stutus = 0;
        try {
            PreparedStatement pst = con.prepareStatement("insert into register(username,email,password) values(?,?,?)");
            
            pst.setString(1, username);
            pst.setString(2, reg.getEmail());
            pst.setString(3, reg.getPassword());
            stutus = pst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return stutus;
    }

}
