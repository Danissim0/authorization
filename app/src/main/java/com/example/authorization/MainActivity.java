package com.example.authorization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button authorization;
    EditText login, password;
    TextView answer;
    final String user_login = "danila";
    final String user_password = "12345a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        authorization = findViewById(R.id.authorization);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        authorization.setOnClickListener(this);
        answer = findViewById(R.id.answer);
    }

    @Override
    public void onClick(View v) {
        String input_login = login.getText().toString();
        String input_password = password.getText().toString();
        if (input_login.equals(user_login) && input_password.equals(user_password)) {
            authorization.setBackgroundColor(Color.GREEN);
            login.setTextColor(Color.GREEN);
            password.setTextColor(Color.GREEN);
            answer.setTextColor(Color.GREEN);
            answer.setText("Верно");
            answer.setVisibility(View.VISIBLE);
        } else if (input_login.equals(user_login)) {
            login.setTextColor(Color.GREEN);
            password.setTextColor(Color.RED);
            authorization.setBackgroundColor(Color.RED);
            answer.setTextColor(Color.RED);
            answer.setText("Неверный пароль");
            answer.setVisibility(View.VISIBLE);
        } else if (input_password.equals(user_password)) {
            login.setTextColor(Color.RED);
            password.setTextColor(Color.GREEN);
            authorization.setBackgroundColor(Color.RED);
            answer.setTextColor(Color.GREEN);
            answer.setText("Неверный логин");
            answer.setVisibility(View.VISIBLE);
        } else {
            login.setTextColor(Color.RED);
            authorization.setBackgroundColor(Color.RED);
            password.setTextColor(Color.RED);
            answer.setTextColor(Color.RED);
            answer.setText("Неверный логин и пароль");
            answer.setVisibility(View.VISIBLE);
        }
    }
}