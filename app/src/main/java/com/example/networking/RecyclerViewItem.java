package com.example.networking;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {

    @SerializedName("name")
    private String title;

    private String ID;
    private String type;
    private String company;
    private String location;
    private int size;
    private int cost;


    /* "ID": "mobilprog_kinnekulle",
            "name": "Kinnekulle",
            "type": "brom",
            "company": "",
            "location": "Skaraborg",
            "category": "",
            "size": 306,
            "cost": 1004,
            "auxdata": {
        "wiki": "https://sv.wikipedia.org/wiki/Kinnekulle",
                "img": ""

     */



    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }







    @Override
    public String toString() {
        return "RecyclerViewItem{" +
                "title='" + title + '\'' +
                '}';
    }

}
