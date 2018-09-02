package com.example.shadow.exercise_listview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] names = {"yasan", "sadegh", "yasan", "sadegh", "yasan", "sadegh", "yasan", "sadegh", "yasan", "sadegh",};
    ListView list = findViewById(R.id.listView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> ad = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, names);
        list.setAdapter(ad);
    }
}
