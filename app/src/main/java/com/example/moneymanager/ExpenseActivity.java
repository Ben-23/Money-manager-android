package com.example.moneymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
    }
    public void onContinue(View v)    {
        Intent mainIntent = new Intent(ExpenseActivity.this,TrackerActivity.class);
        startActivity(mainIntent);
    }
}
