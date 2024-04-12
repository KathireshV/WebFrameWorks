package com.example.backend1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Mobiles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;

    @OneToOne(mappedBy = "mobile",cascade = CascadeType.ALL)
    @JsonManagedReference
    private MobileDetails mobiledetails;

    private String mname;
    private String mdesc;
    private double price;
    
    public Mobiles() {
    }
    public Mobiles(int mid, MobileDetails mobiledetails, String mname, String mdesc, double price) {
        this.mid = mid;
        this.mobiledetails = mobiledetails;
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
    public MobileDetails getMobiledetails() {
        return mobiledetails;
    }
    public void setMobiledetails(MobileDetails mobiledetails) {
        this.mobiledetails = mobiledetails;
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
