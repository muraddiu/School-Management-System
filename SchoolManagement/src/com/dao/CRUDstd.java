package com.dao;

import com.model.Student;
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
import javax.swing.JOptionPane;

public class CRUDstd {

//************For Data Insert********************
    public static int inserData(Student std) {
        Connection con = DBConnection.getConnection();
        int stutus = 0;
        try {

            InputStream is = new FileInputStream(new File(std.getImage()));
            PreparedStatement pst = con.prepareStatement("insert into std_table values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, std.getfName());
            pst.setString(2, std.getlName());
            pst.setString(3, std.getFatherName());
            pst.setString(4, std.getMotherName());
            pst.setString(5, std.getMobile());
            pst.setString(6, std.geteMail());
            pst.setString(7, std.getBirthDate());
            pst.setString(8, std.getSex());
            pst.setString(9, std.getsClass());
            pst.setString(10, std.getRoll());
            pst.setBlob(11, is);
            stutus = pst.executeUpdate();
            pst.close();
            pst.cancel();
        } catch (SQLException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return stutus;
    }

    //***********For Table Query**************
    public static List<Student> readData() throws SQLException {
        Connection con = DBConnection.getConnection();
        List<Student> list = new ArrayList<Student>();
        try {
            PreparedStatement pst = con.prepareStatement("select * from std_table");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Student std = new Student();
                std.setRoll(rs.getString("roll"));
                std.setfName(rs.getString("fname"));
                std.setlName(rs.getString("lname"));
                std.setFatherName(rs.getString("mothern"));
                std.setMotherName(rs.getString("fathern"));
                std.setMobile(rs.getString("mobile"));
                std.seteMail(rs.getString("email"));
                std.setSex(rs.getString("sex"));
                std.setBirthDate(rs.getString("birthdate"));
                std.setsClass(rs.getString("class"));
                
               
                list.add(std);
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
    
    //*****************For Select Data*****************
    public static Student fetchDataById(int id) {
        Connection con = DBConnection.getConnection();
        Student std = null;
        try {
            PreparedStatement pst = con.prepareStatement("select * from std_table where roll = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                std = new Student();
                std.setRoll(rs.getString("roll"));
                std.setfName(rs.getString("fname"));
                std.setlName(rs.getString("lname"));
                std.setFatherName(rs.getString("mothern"));
                std.setMotherName(rs.getString("fathern"));
                std.setMobile(rs.getString("mobile"));
                std.seteMail(rs.getString("email"));
                std.setSex(rs.getString("sex"));
                std.setBirthDate(rs.getString("birthdate"));
                std.setsClass(rs.getString("class"));
              
              
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return std;
 
    }
    
    //*********For Update********************
    public static int updateData(Student std) {
        Connection con = DBConnection.getConnection();
        int stutus = 0;
        try {
            PreparedStatement pst = con.prepareStatement("UPDATE std_table SET fname=?,lname=?,fathern= ?, mothern =? ,mobile= ?,email=?,birthdate=?,sex=,class= ?,image=? WHERE roll");

            pst.setString(1, std.getfName());
            pst.setString(2, std.getlName());
            pst.setString(3, std.getFatherName());
            pst.setString(4, std.getRoll());
            stutus = pst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return stutus;
    }
}

    

    

