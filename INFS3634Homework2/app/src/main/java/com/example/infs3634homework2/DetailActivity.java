package com.example.infs3634homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView detail_name = findViewById(R.id.detail_name);

        Restaurant currRest = Restaurant.currDetailRest;

        detail_name.setText(currRest.getName());

    }
}
