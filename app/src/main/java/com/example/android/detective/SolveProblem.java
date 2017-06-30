package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// Created by Daria Kalashnikova

public class SolveProblem extends AppCompatActivity {

    public final static String CRIME = "sherlock.CRIME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem);
    }

    //Set different answers for chosen RadioButtons
    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();
        switch (v.getId()) {
            case R.id.radioQ1:
                answerIntent.putExtra(CRIME, getString(R.string.message_1_1));
                MainActivity.score[0] = false;
                break;
            case R.id.radioQ2:
                answerIntent.putExtra(CRIME, getString(R.string.message_1_2));
                MainActivity.score[0] = false;
                break;
            case R.id.radioQ3:
                answerIntent.putExtra(CRIME, getString(R.string.message_1_3));
                MainActivity.score[0] = false;
                break;
            case R.id.radioQ4:
                answerIntent.putExtra(CRIME, getString(R.string.message_1_4));
                MainActivity.score[0] = true;
                break;
            case R.id.radioQ5:
                answerIntent.putExtra(CRIME, getString(R.string.message_1_5));
                MainActivity.score[0] = false;
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }
}

