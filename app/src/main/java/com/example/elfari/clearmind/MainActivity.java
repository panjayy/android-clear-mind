package com.example.elfari.clearmind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.elfari.clearmind.Adapter.MySoundAdapter;
import com.example.elfari.clearmind.Models.MySound;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<MySound> mySounds = new ArrayList<>();
    private MySound sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycleview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        sound = new MySound(R.color.colorAccent,"Lagu Hujan");
        mySounds.add(sound);

        sound = new MySound(R.color.colorPrimary,"Lagu Laut");
        mySounds.add(sound);

        mAdapter = new MySoundAdapter(mySounds);
        mRecyclerView.setAdapter(mAdapter);

    }


}
