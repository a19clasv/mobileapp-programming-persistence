package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button read, write;
    private TextView display;
    private EditText countryName, countryNationalDay, countryCapital;

    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;

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

        databaseHelper = new DatabaseHelper(this);
        database = databaseHelper.getWritableDatabase();

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = countryName.getText().toString();
                String nationalDay = countryNationalDay.getText().toString();
                String capital = countryCapital.getText().toString();

                ContentValues values = new ContentValues();
                values.put(DatabaseTables.Country.COLUMN_NAME_NAME, name);
                values.put(DatabaseTables.Country.COLUMN_NAME_NATIONAL_DAY, nationalDay);
                values.put(DatabaseTables.Country.COLUMN_NAME_CAPITAL, capital);
                database.insert(DatabaseTables.Country.TABLE_NAME, null, values);
            }
        });
    }
}
