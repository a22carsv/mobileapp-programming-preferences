package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private EditText EditField;
    private Button buttonToMain;

    private static final String SHARED_PREF_NAME = "myPref";
    private static final String KEY_TEXT = "myText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        EditField = findViewById(R.id.editText);
        buttonToMain = findViewById(R.id.saveButton);

        // Button click listener to save the text and finish the activity
        buttonToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Save the text to SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_TEXT, EditField.getText().toString());
                editor.apply();

                // Finish the activity and return to the previous activity
                finish();
            }
        });
    }
}
