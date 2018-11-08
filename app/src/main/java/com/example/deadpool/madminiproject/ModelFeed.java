package com.example.deadpool.madminiproject;

/**
 * Created by karsk on 25/04/2018.
 */

public class ModelFeed {

    int id, propic, postpic;
    String name, status, date;

    public ModelFeed(int id, int propic, int postpic, String name, String status, String date) {
        this.id = id;
        this.propic = propic;
        this.postpic = postpic;
        this.name = name;
        this.status = status;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropic() {
        return propic;
    }

    public void setPropic(int propic) {
        this.propic = propic;
    }

    public int getPostpic() {
        return postpic;
    }

    public void setPostpic(int postpic) {
        this.postpic = postpic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
