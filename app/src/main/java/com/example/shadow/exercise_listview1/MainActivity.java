package com.example.shadow.exercise_listview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] names = {"yasan", "sadegh", "yasan", "sadegh", "yasan", "sadegh", "yasan", "sadegh", "yasan", "sadegh",};
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView);
        ArrayAdapter<String> ad = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, names);
        list.setAdapter(ad);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), ""+i, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), ""+names[i], Toast.LENGTH_LONG).show();

            }
        });
    }
}
