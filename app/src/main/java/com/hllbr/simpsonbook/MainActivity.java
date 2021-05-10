package com.hllbr.simpsonbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //Object operations
        Simpson homer = new Simpson("Homor","nuclear","58",R.drawable.homor);
        Simpson lisa = new Simpson("Lisa","Student","16",R.drawable.lisa);
        Simpson bart = new Simpson("Bart","Crazy Student","14",R.drawable.bart);

        ArrayList<Simpson> simpsonlist = new ArrayList<>();

        simpsonlist.add(homer);
        simpsonlist.add(lisa);
        simpsonlist.add(bart);
        /*
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,simpsonlist);
        Bu yapının yerine kendi adapter'imi yazıyorum artık
         */
        CustomAdapter customAdapter = new CustomAdapter(simpsonlist,MainActivity.this);
        listView.setAdapter(customAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("selectedSimpson",simpsonlist.get(position));
                startActivity(intent);
            }
        });
    }


}