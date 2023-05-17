package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Read data from Shared Preferences
        String data = sharedPreferences.getString("data", "");
        // Use the retrieved data as needed in MainActivity
        // For example, you can update a TextView with the data:
        // TextView textView = findViewById(R.id.textView);
        // textView.setText(data);
    }
}
