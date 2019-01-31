package com.example.yoga;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class PageActivity extends AppCompatActivity {

    ViewPager viewepager;
    ProgressBar progressBar;
    TextView page_textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        Bundle extras = getIntent().getExtras();
        viewepager=findViewById(R.id.viewPager);
        progressBar=findViewById(R.id.progressBar2);
        page_textView=findViewById(R.id.page_textView);
        String textvu;
        if (extras != null)
        {textvu = extras.getString("textid");
        page_textView.setText(textvu);}
        else {textvu = "";}

        if(textvu.equals("Priciples of Yoga")){
            viewepager.setAdapter(new PrincYogaAdapter(getSupportFragmentManager()));
        }

    }
}
