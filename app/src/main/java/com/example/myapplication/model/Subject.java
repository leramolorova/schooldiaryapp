package com.example.myapplication.model;

public class Subject {

    int id;
    String img, color, title;

    public Subject(int id, String img, String color, String title) {
        this.id = id;
        this.img = img;
        this.color = color;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
