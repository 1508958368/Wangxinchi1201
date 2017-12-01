package com.example.wxc.lianxi01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Bean.Student;

public class MainActivity extends AppCompatActivity {
    private ArrayList mlist = new ArrayList<Student>();
    private RecyclerView mRecyview;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
        initView();
    }

    private void initView() {


        mRecyview = (RecyclerView) findViewById(R.id.recyview);
        //mRecyview.setLayoutManager(new LinearLayoutManager(this));
        mRecyview.setLayoutManager(new GridLayoutManager(this,4));
        myAdapter = new MyAdapter(this,mlist);
        mRecyview.setAdapter(myAdapter);


    }

    private void initDate() {
        mlist = new ArrayList<Student>();
        for (int i = 0; i < 60; i++) {
            Student s = new Student();
            s.setUserName("汪鑫池" + i);
            mlist.add(s);

        }
    }
}
