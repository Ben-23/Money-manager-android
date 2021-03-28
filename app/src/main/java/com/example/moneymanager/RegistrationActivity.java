package com.example.moneymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void onRegister(View v)    {
        Intent mainIntent = new Intent(RegistrationActivity.this,HomeActivity.class);
        startActivity(mainIntent);
    }
    public void onLog(View v)    {
        Intent mainIntent = new Intent(RegistrationActivity.this,LoginActivity.class);
        startActivity(mainIntent);
    }
}
