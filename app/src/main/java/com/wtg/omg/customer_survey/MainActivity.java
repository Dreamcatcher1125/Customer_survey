package com.wtg.omg.customer_survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void begin(View View)
    {
        Intent intent = new Intent(MainActivity.this, Question1.class);
        startActivity(intent);
    }
}
