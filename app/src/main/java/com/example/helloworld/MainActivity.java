package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button buttonRegister = findViewById(R.id.buttonRegister);

        //TextView textViewFirstName = findViewById(R.id.firstNameEditText);
        //TextView textViewLastName = findViewById(R.id.lastNameEditText);
        //TextView textViewEmail = findViewById(R.id.emaiEditText);
    }

    public void onButtonClickRegister (View view) {
        TextView textViewFirstName = findViewById(R.id.textFirstName);
        TextView textViewLastName = findViewById(R.id.textViewLastName);
        TextView textViewEmail = findViewById(R.id.textViewEmail);

        //textViewFirstName.setText("Hello, User");

        EditText editTextFirstName = findViewById(R.id.firstNameEditText);
        EditText editTextLastName = findViewById(R.id.lastNameEditText);
        EditText editTextEmail = findViewById(R.id.emailEditText);

        textViewFirstName.setText(editTextFirstName.getText().toString());
        textViewLastName.setText(editTextLastName.getText().toString());
        textViewEmail.setText(editTextEmail.getText().toString());

        //THIS IS A TEST MESSAGE
    }
}
