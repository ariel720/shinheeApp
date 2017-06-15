package com.example.ariel.shinheeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mConditionRef = mDatabase.child("Restaurant").child("aaa");
    TextView tv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_main = (TextView) findViewById(R.id.tv_main);

    }

    @Override
    protected void onStart() {
        super.onStart();

        mConditionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                tv_main.setText(name);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
