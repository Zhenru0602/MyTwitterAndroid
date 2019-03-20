package com.example.zhenru.mytwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class LandingActivity extends AppCompatActivity implements View.OnTouchListener{
    private TextView logIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.barGrey));
        getWindow().setStatusBarColor(getResources().getColor(R.color.barGrey));
        setContentView(R.layout.activity_landing);

        logIn = findViewById(R.id.log_in_link);
        logIn.setOnTouchListener(this);
    }

    public void signUp(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
        finish();
        return true;
    }
}
