package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "driver")
public class Driver {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String mobNo;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getBookings() {
        return bookings;
    }

    public void setBookings(List<TripBooking> bookings) {
        this.bookings = bookings;
    }

    public Driver(int id, String mobNo, String password, Cab cab, List<TripBooking> bookings) {
        this.id = id;
        this.mobNo = mobNo;
        this.password = password;
        this.cab = cab;
        this.bookings = bookings;
    }

    public Driver() {
    }

    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    Cab cab;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    List<TripBooking> bookings = new ArrayList<>();
}