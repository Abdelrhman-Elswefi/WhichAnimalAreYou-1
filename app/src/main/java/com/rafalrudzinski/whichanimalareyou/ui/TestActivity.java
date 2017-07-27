package com.rafalrudzinski.whichanimalareyou.ui;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.rafalrudzinski.whichanimalareyou.R;

public class TestActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent intent = getIntent();
        int ratingOne = intent.getIntExtra("rating1",0);

        Toast.makeText(TestActivity.this, "rating 1 = " + ratingOne ,Toast.LENGTH_SHORT).show();
    }
}
