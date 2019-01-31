package com.example.yoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] menulist;
    MainmenuArrayadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.frag_main_list);
        menulist=getResources().getStringArray(R.array.menu_list);
        adapter = new MainmenuArrayadapter(this,menulist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textvu = view.findViewById(R.id.menu_text);
                String txtitle = textvu.getText().toString();
                Intent intent = new Intent(MainActivity.this,PageActivity.class);
                intent.putExtra("textid",txtitle);
                startActivity(intent);
            }
        });

    }


}
