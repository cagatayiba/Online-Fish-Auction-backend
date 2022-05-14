package com.G01.onlineFishAuction.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Auction")
public class Auction {

    @Column(name="name")
    private String name;
    @Column(name="date")
    private float date;
    @Id
    @Column(name="id")
    private String id;
    @Column(name="quota")
    private int quota;


    public Auction(String name, float date, String id, int quota) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.quota = quota;
    }
    public Auction(){

    }

    public String getName() {
        return name;
    }

    public float getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public int getQuota() {
        return quota;
    }
}
