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

    public void question1_next(View view) {
        // Тут переход к следующей Активити и сохранение того, что мы выбрали из ответов, придумать куда сохранять
    }

    public void back(View view) {
        Intent intent = new Intent(Question1.this, MainActivity.class);
        startActivity(intent);
        // тут нужно обнулять переменную сохраненных ответов, везде копировать эту кнопку
    }
}
