package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class SolveProblem4 extends AppCompatActivity {

    public final static String CRIME4 = "sherlock.CRIME4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem4);

        getSupportActionBar().hide();
    }

    //Set different answers for choosen RadioButtons

    public void onRadioClick4(View v) {
        Intent answerIntent4 = new Intent();

        switch (v.getId()) {
            case R.id.radioQ16:
                answerIntent4.putExtra(CRIME4, "Nice name, but it is wrong");
                break;
            case R.id.radioQ17:
                answerIntent4.putExtra(CRIME4, "Try again");
                break;
            case R.id.radioQ18:
                answerIntent4.putExtra(CRIME4, "Correct. You are brilliant detective!");
                break;
            case R.id.radioQ19:
                answerIntent4.putExtra(CRIME4, "No, it wasn`t that name");
                break;
            case R.id.radioQ20:
                answerIntent4.putExtra(CRIME4, "Too far from the truth");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent4);
        finish();

    }
}
