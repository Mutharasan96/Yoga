package com.example.yoga;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    String[] menulist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.main_menu);
        menulist=getResources().getStringArray(R.array.menu_list);
        MainmenuArrayadapter adapter = new MainmenuArrayadapter(this,menulist);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
