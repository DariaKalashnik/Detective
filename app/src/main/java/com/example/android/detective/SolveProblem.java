package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.app.Activity.RESULT_OK;


public class SolveProblem extends AppCompatActivity {

    public final static String CRIME = "sherlock.CRIME";

    // Initialize string values for different answers

    public String variant_1_1 = "Oops, you are wrong";
    public String variant_1_2 = "Good try, but it is incorrect";
    public String variant_1_3 = "It is not even close";
    public String variant_1_4 = "Correct. You are brilliant detective!";
    public String variant_1_5 = "Classic music is good, but your answer is not";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem);

    }

    //Set different answers for choosen RadioButtons

    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();

        switch (v.getId()) {
            case R.id.radioQ1:
                answerIntent.putExtra(CRIME, variant_1_1);
                break;
            case R.id.radioQ2:
                answerIntent.putExtra(CRIME, variant_1_2);
                break;
            case R.id.radioQ3:
                answerIntent.putExtra(CRIME, variant_1_3);
                break;
            case R.id.radioQ4:
                answerIntent.putExtra(CRIME, variant_1_4);
                break;
            case R.id.radioQ5:
                answerIntent.putExtra(CRIME, variant_1_5);
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }


}

