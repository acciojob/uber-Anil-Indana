package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
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

    public List<TripBooking> getBookings() {
        return bookings;
    }

    public void setBookings(List<TripBooking> bookings) {
        this.bookings = bookings;
    }

    public Customer(int id, String mobNo, String password, List<TripBooking> bookings) {
        this.id = id;
        this.mobNo = mobNo;
        this.password = password;
        this.bookings = bookings;
    }

    public Customer() {
    }

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<TripBooking> bookings = new ArrayList<>();
}