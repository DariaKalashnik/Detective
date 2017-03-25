package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.app.Activity.RESULT_OK;


public class SolveProblem4 extends AppCompatActivity {

    public final static String CRIME4 = "sherlock.CRIME4";

    // Initialize string values for different answers

    public String variant_4_1 = "Nice name, but it is wrong";
    public String variant_4_2 = "Try again";
    public String variant_4_3 = "Correct. You are brilliant detective!";
    public String variant_4_4 = "No, it wasn`t that name";
    public String variant_4_5 = "Too far from the truth";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem4);
    }

    //Set different answers for choosen RadioButtons

    public void onRadioClick4(View v) {
        Intent answerIntent4 = new Intent();

        switch (v.getId()) {
            case R.id.radioQ16:
                answerIntent4.putExtra(CRIME4, variant_4_1);
                break;
            case R.id.radioQ17:
                answerIntent4.putExtra(CRIME4, variant_4_2);
                break;
            case R.id.radioQ18:
                answerIntent4.putExtra(CRIME4, variant_4_3);
                break;
            case R.id.radioQ19:
                answerIntent4.putExtra(CRIME4, variant_4_4);
                break;
            case R.id.radioQ20:
                answerIntent4.putExtra(CRIME4, variant_4_5);
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent4);
        finish();

    }
}
