package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// Created by Daria Kalashnikova

public class SolveProblem2 extends AppCompatActivity {

    public final static String CRIME2 = "sherlock.CRIME2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem2);
    }

    //Set different answers for chosen RadioButtons
    public void onRadioClick2(View v) {
        Intent answerIntent2 = new Intent();
        switch (v.getId()) {
            case R.id.radioQ6:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_1));
                MainActivity.score[1] = false;
                break;
            case R.id.radioQ7:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_2));
                MainActivity.score[1] = true;
                break;
            case R.id.radioQ8:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_3));
                MainActivity.score[1] = false;
                break;
            case R.id.radioQ9:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_4));
                MainActivity.score[1] = false;
                break;
            case R.id.radioQ10:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_5));
                MainActivity.score[1] = false;
                break;

            default:
                break;
        }
        setResult(RESULT_OK, answerIntent2);
        finish();
    }
}