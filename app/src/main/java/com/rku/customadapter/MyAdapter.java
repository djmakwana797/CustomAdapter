package com.rku.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {

    private final Context context;
    private final ArrayList<Item> list;
    private final int[] images = {
        R.drawable.one,
        R.drawable.two,
        R.drawable.three
    };

    MyAdapter(Context context, ArrayList<Item> list) {
        super(context, R.layout.listitem,list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //1.Create inflater
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        //2.Get row view from inflater
        View rowView = layoutInflater.inflate(R.layout.listitem,parent,false);

        //3.Get two text view from the rowView
        TextView labelView = (TextView) rowView.findViewById(R.id.label);
        TextView valueView = (TextView) rowView.findViewById(R.id.value);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imageView);

        //4.Set the text for TextView
        labelView.setText(list.get(position).getTitle());
        valueView.setText(list.get(position).getDescription());
        imgView.setBackgroundResource(images[position]);

        return rowView;
    }
}
