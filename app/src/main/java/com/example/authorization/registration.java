package com.example.authorization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registration extends AppCompatActivity implements View.OnClickListener {
    Button registration;
    EditText login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        registration = findViewById(R.id.registration_button);
        registration.setOnClickListener(this);
        login = findViewById(R.id.login_registration);
        password = findViewById(R.id.password_registration);
    }

    @Override
    public void onClick(View v) {
        String user_login = login.getText().toString();
        String user_password = password.getText().toString();
        Intent i = new Intent();
        i.putExtra("login", user_login);
        i.putExtra("password", user_password);
        setResult(RESULT_OK, i);
        finish();
    }
}