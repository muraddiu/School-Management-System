package com.dao;

import com.model.Student;
import com.model.Teacher;
import com.util.DBConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDst {
    
    //************For Data Insert********************
    public static int inserData(Teacher tr) {
        Connection con = DBConnection.getConnection();
        int stutus = 0;
        try {

            InputStream is = new FileInputStream(new File(tr.getImage()));
            PreparedStatement pst = con.prepareStatement("insert into st_table values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, tr.getfName());
            pst.setString(2, tr.getlName());
            pst.setString(3, tr.getFatherName());
            pst.setString(4, tr.getMotherName());
            pst.setString(5, tr.getMobile());
            pst.setString(6, tr.geteMail());
            pst.setString(7, tr.getBirthDate());
            
            pst.setString(8, tr.getSex());
            System.out.println("image");
             pst.setString(9, tr.getJoinDate());
            pst.setBlob(10, is);
           
            stutus = pst.executeUpdate();
            pst.close();
          //  pst.cancel();
        } catch (SQLException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return stutus;
    }
    
      //***********For Table Query**************
    public static List<Teacher> readData() throws SQLException {
        Connection con = DBConnection.getConnection();
        List<Teacher> list = new ArrayList<Teacher>();
        try {
            PreparedStatement pst = con.prepareStatement("select * from st_table");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Teacher tr = new Teacher();
            
                tr.setfName(rs.getString("fname"));
                tr.setlName(rs.getString("lname"));
                tr.setFatherName(rs.getString("mothern"));
                tr.setMotherName(rs.getString("fathern"));
                tr.setMobile(rs.getString("mobile"));
                tr.seteMail(rs.getString("email"));
                tr.setSex(rs.getString("sex"));
                tr.setBirthDate(rs.getString("birthdate"));
                tr.setJoinDate(rs.getString("joindate"));
               
               
                list.add(tr);
                //{std.getRoll(),std.getfName(),std.getlName(),std.getFatherName(),
                //std.getMotherName(),std.getMobile(),std.geteMail(),std.getSex(),
                //std.getBirthDate()});
        }
            }

         catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
        
    }
}
    


