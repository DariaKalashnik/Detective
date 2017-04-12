package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class SolveProblem2 extends AppCompatActivity {

    public final static String CRIME2 = "sherlock.CRIME2";

    // Initialize string values for different answers

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem2);
    }

    //Set different answers for choosen RadioButtons

    public void onRadioClick2(View v) {
        Intent answerIntent2 = new Intent();

        switch (v.getId()) {
            case R.id.radioQ6:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_1));
                break;
            case R.id.radioQ7:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_2));
                break;
            case R.id.radioQ8:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_3));
                break;
            case R.id.radioQ9:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_4));
                break;
            case R.id.radioQ10:
                answerIntent2.putExtra(CRIME2, getString(R.string.message_2_5));
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent2);
        finish();

    }
}