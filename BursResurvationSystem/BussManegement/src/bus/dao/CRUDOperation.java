/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.dao;

import bus.management.BusDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raj Sami
 */
public class CRUDOperation {
    public static List<BusDetails> readData(){
        List<BusDetails> list = new ArrayList<BusDetails>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/busm";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();
            String selectQuery = "select * from bus_details ";
            ResultSet rs = stat.executeQuery(selectQuery);
            while (rs.next()) {
                BusDetails bdt = new BusDetails();
                bdt.setId(rs.getInt("id"));
                bdt.setBusNo(rs.getString("bus_no"));
                bdt.setMovement(rs.getString("movement"));
                bdt.setBusSource(rs.getString("bus_source"));
                bdt.setBusDest(rs.getString("bus_dest"));
                bdt.setDepartDate(rs.getString("depart_date"));
                bdt.setDepartTime(rs.getString("depart_time"));
                bdt.setPrice(rs.getInt("price"));
                bdt.setTotalSeat(rs.getInt("total_seat"));
                list.add(bdt);
               
            }
//            busDetailsTbl.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
//            System.out.println(e);
            e.printStackTrace();
        }
        return list;
    }
}
