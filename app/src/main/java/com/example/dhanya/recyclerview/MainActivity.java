package com.example.dhanya.recyclerview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerviewadapter;
    RecyclerView.LayoutManager recyclerViewLayoutmanager;
    String[] subjects={"raji","mahi","suthu","hari","hema","mouni","sri","nikky"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();
        relativeLayout=(RelativeLayout) findViewById(R.id.relativelayout1);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerview1);
        recyclerViewLayoutmanager=new LinearLayoutManager(context);

        recyclerView.setLayoutManager(recyclerViewLayoutmanager);
        recyclerviewadapter=new RecyclerViewAdapter(context,subjects);
        recyclerView.setAdapter(recyclerviewadapter);

    }
}
