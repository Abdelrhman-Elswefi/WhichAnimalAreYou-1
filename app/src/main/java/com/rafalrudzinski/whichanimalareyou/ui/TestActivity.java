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
        int napsRating = intent.getIntExtra("napsRating",0);
        int sportsRating = intent.getIntExtra("sportsRating",0);
        int spicyFoodRating = intent.getIntExtra("spicyFoodRating",0);
        int readingRating = intent.getIntExtra("readingRating",0);
        int travelRating = intent.getIntExtra("travelRating",0);
        int coldWeatherRating = intent.getIntExtra("coldWeatherRating",0);
        int driveOrFlyRating = intent.getIntExtra("driveOrFlyRating",0);
        int cashRating = intent.getIntExtra("cashRating",0);


        Toast.makeText(TestActivity.this, "rating 1 = " + napsRating ,Toast.LENGTH_SHORT).show();
        Toast.makeText(TestActivity.this, "rating 2 = " + sportsRating ,Toast.LENGTH_SHORT).show();
        Toast.makeText(TestActivity.this, "rating 3 = " + spicyFoodRating ,Toast.LENGTH_SHORT).show();
        Toast.makeText(TestActivity.this, "rating 4 = " + readingRating ,Toast.LENGTH_SHORT).show();
        Toast.makeText(TestActivity.this, "rating 5 = " + travelRating ,Toast.LENGTH_SHORT).show();
        Toast.makeText(TestActivity.this, "rating 6 = " + coldWeatherRating ,Toast.LENGTH_SHORT).show();
        Toast.makeText(TestActivity.this, "rating 7 = " + driveOrFlyRating ,Toast.LENGTH_SHORT).show();
        Toast.makeText(TestActivity.this, "rating 8 = " + cashRating ,Toast.LENGTH_SHORT).show();

    }
}
