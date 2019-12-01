/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.model;

/**
 *
 * @author Raj Sami
 */
public class BusDetails {
    private int id;
    private String bus_no;
    private String movement;
    private String bus_source;
    private String bus_dest;
    private String depart_date;
    private String depart_time;
    private String price;
    private String total_seat;

    public BusDetails() {
    }

    public BusDetails(int id, String bus_no, String movement, String bus_source, String bus_dest, String depart_time, String price, String total_seat) {
        this.id = id;
        this.bus_no = bus_no;
        this.movement = movement;
        this.bus_source = bus_source;
        this.bus_dest = bus_dest;
        this.depart_time = depart_time;
        this.price = price;
        this.total_seat = total_seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBus_no() {
        return bus_no;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getBus_source() {
        return bus_source;
    }

    public void setBus_source(String bus_source) {
        this.bus_source = bus_source;
    }

    public String getBus_dest() {
        return bus_dest;
    }

    public void setBus_dest(String bus_dest) {
        this.bus_dest = bus_dest;
    }

    public String getDepart_date() {
        return depart_date;
    }

    public void setDepart_date(String depart_date) {
        this.depart_date = depart_date;
    }

    public String getDepart_time() {
        return depart_time;
    }

    public void setDepart_time(String depart_time) {
        this.depart_time = depart_time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal_seat() {
        return total_seat;
    }

    public void setTotal_seat(String total_seat) {
        this.total_seat = total_seat;
    }

    @Override
    public String toString() {
        return "BusDetails{" + "id=" + id + ", bus_no=" + bus_no + ", movement=" + movement + ", bus_source=" + bus_source + ", bus_dest=" + bus_dest + ", depart_date=" + depart_date + ", depart_time=" + depart_time + ", price=" + price + ", total_seat=" + total_seat + '}';
    }
    
    
}
