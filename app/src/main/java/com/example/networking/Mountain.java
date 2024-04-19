package com.example.networking;
import java.util.ArrayList;

public class Mountain {

    private String name;
    private String location;
    private int height;

    public Mountain(String name,String location,int height) {

        this.name = "no name";
        this.location = "no location";
        this.height = -1;

    }
    public Mountain(String name) {

        this.name = name;
        this.location = "unknown";
        this.height = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                '}';
    }

}
