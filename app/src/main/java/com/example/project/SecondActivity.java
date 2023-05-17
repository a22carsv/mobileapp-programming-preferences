package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        editText = findViewById(R.id.editText);

        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the entered text from EditText
                String enteredText = editText.getText().toString();

                // Write the entered text to Shared Preferences
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("data", enteredText);
                editor.apply();

                // Finish the activity and return to MainActivity
                finish();
            }
        });
    }
}
