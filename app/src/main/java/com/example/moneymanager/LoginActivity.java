package com.example.moneymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onReg(View v)
    {
        Intent mainIntent = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(mainIntent);
    }
    public void onLogin(View v)
    {
        Intent mainIntent = new Intent(LoginActivity.this,HomeActivity.class);
        startActivity(mainIntent);
    }
}
