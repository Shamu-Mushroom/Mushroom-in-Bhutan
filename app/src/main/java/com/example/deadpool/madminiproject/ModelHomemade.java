package com.example.deadpool.madminiproject;

public class ModelHomemade {

    int picture;
    String mname, dzo_mname;

    public ModelHomemade(int picture, String mname, String dzo_mname) {
        this.picture = picture;
        this.mname = mname;
        this.dzo_mname = dzo_mname;
    }

    public int getPicture() {
        return picture;
    }

    public String getMname() {
        return mname;
    }

    public String getDzo_mname() {
        return dzo_mname;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setDzo_mname(String dzo_mname) {
        this.dzo_mname = dzo_mname;
    }
}
