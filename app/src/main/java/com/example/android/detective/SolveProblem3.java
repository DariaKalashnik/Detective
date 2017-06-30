package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

// Created by Daria Kalashnikova

public class SolveProblem3 extends AppCompatActivity {

    public final static String CRIME3 = "sherlock.CRIME3";
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem3);

        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
    }

    public void checkIt(View view) {
        Intent answerIntent3 = new Intent();
        if (checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked() && !checkBox5.isChecked()) {
            answerIntent3.putExtra(CRIME3, getString(R.string.correct));
            MainActivity.score[2] = true;
        } else {
            answerIntent3.putExtra(CRIME3, getString(R.string.message_3_1));
            MainActivity.score[2] = false;
        }
        setResult(RESULT_OK, answerIntent3);
        finish();
    }

    public void onCheckBox(View view) {
        checkBox1.isChecked();
    }

    public void onCheckBox2(View view) {
        checkBox2.isChecked();
    }

    public void onCheckBox3(View view) {
        checkBox3.isChecked();
    }

    public void onCheckBox4(View view) {
        checkBox4.isChecked();
    }

    public void onCheckBox5(View view) {
        checkBox5.isChecked();
    }
}