package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button read, write;
    private TextView display;
    private EditText countryName, countryNationalDay, countryCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        read = findViewById(R.id.Read);
        write = findViewById(R.id.Write);
        display =findViewById(R.id.Display);
        countryName = findViewById(R.id.Country_name);
        countryNationalDay = findViewById(R.id.Country_national_day);
        countryCapital = findViewById(R.id.Country_capital);
    }
}
