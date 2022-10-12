package com.harshanand.cruddemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView tvid, tvname, tvnumber;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        //Initializing Views
        tvid = findViewById(R.id.txtid);
        tvname = findViewById(R.id.txtname);
        tvnumber = findViewById(R.id.txtnumber);


        Intent intent =getIntent();
        position = intent.getExtras().getInt("position");

        tvid.setText("ID: "+MainActivity.parkingUserArrayList.get(position).getId());
        tvname.setText("Name: "+MainActivity.parkingUserArrayList.get(position).getName());
        tvnumber.setText("Phone Number: "+MainActivity.parkingUserArrayList.get(position).getNumber());






    }
}
