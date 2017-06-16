package com.example.ariel.shinheeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv_main= (RecyclerView) findViewById(R.id.rv_main);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        MyAdapter adapter = new MyAdapter();

        rv_main.setAdapter(adapter);
        rv_main.setLayoutManager(manager);

    }

}
