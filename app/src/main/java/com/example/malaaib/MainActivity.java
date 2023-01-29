package com.example.malaaib;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSignouPage(View view) {
        startActivity(new Intent(this,SignupPage.class));
    }

    public void openLoginPage(View view) {
        startActivity(new Intent(this,LoginPage.class));
    }
}