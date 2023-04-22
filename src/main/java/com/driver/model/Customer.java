package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int customerId;
    private String mobile;
    private String password;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public List<TripBooking> getBookings() {
        return bookings;
    }

    public void setBookings(List<TripBooking> bookings) {
        this.bookings = bookings;
    }

    public Customer(int customerId, String mobile, String password, List<TripBooking> bookings) {
        this.customerId = customerId;
        this.mobile = mobile;
        this.password = password;
        this.bookings = bookings;
    }

    public Customer() {
    }

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<TripBooking> bookings = new ArrayList<>();
}