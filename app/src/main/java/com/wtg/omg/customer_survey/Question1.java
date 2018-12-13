package com.wtg.omg.customer_survey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }

    public void back(View view) {
        Intent intent = new Intent(Question1.this, MainActivity.class);
        startActivity(intent);
    }
}
