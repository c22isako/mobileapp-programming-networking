package com.example.networking;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {

    @SerializedName("name")
    private String title;


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
