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

    private Spinner napsSpinner;
    private Spinner sportsSpinner;
    private Spinner spicyFoodSpinner;
    private Spinner readingSpinner;
    private Spinner travelSpinner;
    private Spinner coldWeatherSpinner;
    private Spinner driveOrFlySpinner;
    private Spinner cashSpinner;
    private ArrayAdapter mAdapter;
    private Button runTestButton;
    private int napsRating;
    private int sportsRating;
    private int spicyFoodRating;
    private int readingRating;
    private int travelRating;
    private int coldWeatherRating;
    private int driveOrFlyRating;
    private int cashRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeSpinners();
        setupAdapter();
        setupSpinners();
        setSpinnerListeners();
        submitResponse();
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

    private void setSpinnerListeners() {
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

        sportsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                sportsRating = Integer.valueOf(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spicyFoodSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                spicyFoodRating = Integer.valueOf(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        readingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                readingRating = Integer.valueOf(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        travelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                travelRating = Integer.valueOf(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        coldWeatherSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                coldWeatherRating = Integer.valueOf(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        driveOrFlySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                driveOrFlyRating = Integer.valueOf(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        cashSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                cashRating = Integer.valueOf(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void submitResponse() {
        runTestButton = (Button) findViewById(R.id.runTestButton);

        runTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntent();
            }
        });
    }


    private void startIntent() {
        Intent intent = new Intent(MainActivity.this,TestActivity.class);
        intent.putExtra("napsRating", napsRating);
        intent.putExtra("sportsRating",sportsRating);
        intent.putExtra("spicyFoodRating",spicyFoodRating);
        intent.putExtra("readingRating", readingRating);
        intent.putExtra("travelRating",travelRating);
        intent.putExtra("coldWeatherRating",coldWeatherRating);
        intent.putExtra("driveOrFlyRating",driveOrFlyRating);
        intent.putExtra("cashRating",cashRating);
        startActivity(intent);
    }
}
