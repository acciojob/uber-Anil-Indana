package com.driver.model;


import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int adminId;
    private String username;
    private String password;

    public Admin() {
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(int adminId, String username, String password) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
    }
}