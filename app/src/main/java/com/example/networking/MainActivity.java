package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private RecyclerViewAdapter adapter;
    private Gson gson;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    private ArrayList <RecyclerViewItem> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gson = new Gson();

        //new JsonFile(this, this).execute(JSON_FILE);
        //new JsonTask(this).execute(JSON_URL);

       /* items = new ArrayList<>(Arrays.asList(
                new RecyclerViewItem("mountain1"),
                new RecyclerViewItem("mountain2"),
                new RecyclerViewItem("mountain3")));

        */

        //String json = gson.toJson(items);

        /*for(int i = 0; i< items.size(); i++) {
            Log.d("potato", items.get(i).getTitle());
        }

         */

        adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {

            @Override
            public void onClick(RecyclerViewItem item) {
                Log.d("potato", "hej");
            }

        });

        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

        Log.d("potato", "Has run");

        new JsonTask(this).execute(JSON_URL);

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        Type type = new TypeToken<ArrayList<RecyclerViewItem>>(){}.getType();

        items = gson.fromJson(json, type);

        /*for(RecyclerViewItem r : items){

            String hello = getTitle().toString();
        }*/


        // Mountain mountain = gson.fromJson(json, Mountain.class);

        adapter.UpdateData(items);

    }
}
