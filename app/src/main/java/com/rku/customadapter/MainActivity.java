package com.rku.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lstData;
    ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData = findViewById(R.id.lstData);
        list = generateData();
        MyAdapter adapter = new MyAdapter(this,list);
        lstData.setAdapter(adapter);
    }

    private ArrayList<Item> generateData(){
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("One","First item on the list",R.drawable.one));
        list.add(new Item("Two","Second item on the list",R.drawable.two));
        list.add(new Item("Three","Third item on the list",R.drawable.three));

        return list;
    }
}