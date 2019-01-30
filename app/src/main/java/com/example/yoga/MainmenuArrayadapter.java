package com.example.yoga;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainmenuArrayadapter extends BaseAdapter {

    private LayoutInflater inflater;
    private String[] menu_list;

    MainmenuArrayadapter(Context context,String[] menu_list){
        this.menu_list=menu_list;
        inflater=(LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return menu_list.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.activity_list,null);
        TextView menulist= convertView.findViewById(R.id.menu_text);
        menulist.setText(menu_list[position]);
        return convertView;
    }
}
