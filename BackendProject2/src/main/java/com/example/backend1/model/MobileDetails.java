package com.example.backend1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class MobileDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;

    @OneToOne
    @JsonBackReference
    private Mobiles mobile;

    public MobileDetails() {
    }
    public MobileDetails(int mid, Mobiles mobile, String mname, String camera, String processer, String battery) {
        this.mid = mid;
        this.mobile = mobile;
        this.mname = mname;
        this.camera = camera;
        this.processer = processer;
        this.battery = battery;
    }
    private String mname;
    private String camera;
    private String processer;
    private String battery;
    public int getMid() {
        return mid;
    }
    public void setMid(int mid) {
        this.mid = mid;
    }
    public Mobiles getMobile() {
        return mobile;
    }
    public void setMobile(Mobiles mobile) {
        this.mobile = mobile;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getCamera() {
        return camera;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }
    public String getProcesser() {
        return processer;
    }
    public void setProcesser(String processer) {
        this.processer = processer;
    }
    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }

    


}
