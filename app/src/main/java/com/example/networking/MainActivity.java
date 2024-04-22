package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    RecyclerViewAdapter adapter;
    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonFile(this, this).execute(JSON_FILE);

        ArrayList <RecyclerViewItem> items = new ArrayList<>(Arrays.asList(
                new RecyclerViewItem("mountain1"),
                new RecyclerViewItem("mountain2"),
                new RecyclerViewItem("mountain3")));

        for(int i = 0; i< items.size(); i++) {
            Log.d("potato", items.get(i).toString());
        }

        adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {



            @Override
            public void onClick(RecyclerViewItem item) {
                Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                Log.d("potato", "hej");
            }

        });

        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

        Log.d("potato", "Has run");

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
