package com.rafalrudzinski.whichanimalareyou.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.rafalrudzinski.whichanimalareyou.R;

public class MainActivity extends AppCompatActivity {

    Spinner napsSpinner;
    Spinner sportsSpinner;
    Spinner spicyFoodSpinner;
    Spinner readingSpinner;
    Spinner travelSpinner;
    Spinner coldWeatherSpinner;
    Spinner driveOrFlySpinner;
    Spinner cashSpinner;
    ArrayAdapter mAdapter;
    Button runTestButton;
    private int napsRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeSpinners();
        setupAdapter();
        setupSpinners();

        runTestButton = (Button) findViewById(R.id.runTestButton);

        runTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTest();
            }
        });

        napsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                int id = (int) parent.getItemIdAtPosition(position);
                Toast.makeText(MainActivity.this, parent.getItemAtPosition(position) + " selected at id " + id,Toast.LENGTH_SHORT).show();
                napsRating = Integer.valueOf(parent.getItemAtPosition(position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void initializeSpinners() {
        napsSpinner = (Spinner) findViewById(R.id.questionOneSpinner);
        sportsSpinner = (Spinner) findViewById(R.id.questionTwoSpinner);
        spicyFoodSpinner = (Spinner) findViewById(R.id.questionThreeSpinner);
        readingSpinner = (Spinner) findViewById(R.id.questionFourSpinner);
        travelSpinner = (Spinner) findViewById(R.id.questionFiveSpinner);
        coldWeatherSpinner = (Spinner) findViewById(R.id.questionSixSpinner);
        driveOrFlySpinner = (Spinner) findViewById(R.id.questionSevenSpinner);
        cashSpinner = (Spinner) findViewById(R.id.questionEightSpinner);
    }

    private void setupAdapter() {
        mAdapter = ArrayAdapter.createFromResource(this, R.array.ratings,android.R.layout.simple_spinner_item);
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    private void setupSpinners() {
        napsSpinner.setAdapter(mAdapter);
        sportsSpinner.setAdapter(mAdapter);
        spicyFoodSpinner.setAdapter(mAdapter);
        readingSpinner.setAdapter(mAdapter);
        travelSpinner.setAdapter(mAdapter);
        coldWeatherSpinner.setAdapter(mAdapter);
        driveOrFlySpinner.setAdapter(mAdapter);
        cashSpinner.setAdapter(mAdapter);
    }

    private void startTest() {
        Intent intent = new Intent(MainActivity.this,TestActivity.class);
        intent.putExtra("rating1", napsRating);
        startActivity(intent);
    }
}
