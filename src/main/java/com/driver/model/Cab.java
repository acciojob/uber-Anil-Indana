package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public class Cab{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private int perKmRate;

    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Cab() {
    }

    public Cab(int id, int perKmRate, boolean isAvailable, Driver driver) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.isAvailable = isAvailable;
        this.driver = driver;
    }

    @OneToOne
    @JoinColumn
    Driver driver;
}