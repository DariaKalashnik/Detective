package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class SolveProblem extends AppCompatActivity {

    public final static String CRIME = "sherlock.CRIME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem);


        getSupportActionBar().hide();

    }

    //Set different answers for choosen RadioButtons

    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();

        switch (v.getId()) {
            case R.id.radioQ1:
                answerIntent.putExtra(CRIME, "Oops, you are wrong");
                break;
            case R.id.radioQ2:
                answerIntent.putExtra(CRIME, "Good try, but it is incorrect");
                break;
            case R.id.radioQ3:
                answerIntent.putExtra(CRIME, "It is not even close");
                break;
            case R.id.radioQ4:
                answerIntent.putExtra(CRIME, "Correct. You are brilliant detective!");
                break;
            case R.id.radioQ5:
                answerIntent.putExtra(CRIME, "Classic music is good, but your answer is not");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }


}

