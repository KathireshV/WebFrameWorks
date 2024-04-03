package com.example.backend1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobiles {
    
    @Id
    private int mid;
    private String mname;
    private String mdesc;
    private double price;
    
    public Mobiles() {
    }
    public Mobiles(int mid, String mname, String mdesc, double price) {
        this.mid = mid;
        this.mname = mname;
        this.mdesc = mdesc;
        this.price = price;
    }
    public int getMid() {
        return mid;
    }
    public void setMid(int mid) {
        this.mid = mid;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getMdesc() {
        return mdesc;
    }
    public void setMdesc(String mdesc) {
        this.mdesc = mdesc;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    

}
