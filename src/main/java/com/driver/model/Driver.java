package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "driver")
public class Driver {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int driverId;
    private String mobile;
    private String password;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public Driver(int driverId, String mobile, String password, Cab cab, List<TripBooking> bookings) {
        this.driverId = driverId;
        this.mobile = mobile;
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