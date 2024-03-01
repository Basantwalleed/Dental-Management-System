package com.example.dental_management_system.pojo;

import jakarta.persistence.*;
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private int phone;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "service")
    private String service;

         
    public Booking() {
    }


    public Booking(int id, String name, String email, int phone, String date, String time ,String service) {
        this.service=service;
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.time = time;
    }
    
    public Booking( String name, String email, int phone, String date, String time , String service) {
        this.service=service;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }



    public String toString(){

        return "Booking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", service='" + service + '\'' +
                '}';

    }
}
