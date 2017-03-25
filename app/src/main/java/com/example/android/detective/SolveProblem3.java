package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.app.Activity.RESULT_OK;


public class SolveProblem3 extends AppCompatActivity {

    public final static String CRIME3 = "sherlock.CRIME3";

    // Initialize string values for different answers

    public String variant_3_1 = "Correct. You are brilliant detective!";
    public String variant_3_2 = "Wrong answer";
    public String variant_3_3 = "It is not a fantasy series";
    public String variant_3_4 = "Important issue, but not at this time";
    public String variant_3_5 = "And we all miss him, but the answer is incorrect";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem3);
    }

    //Set different answers for choosen RadioButtons

    public void onRadioClick3(View v) {
        Intent answerIntent3 = new Intent();

        switch (v.getId()) {
            case R.id.radioQ11:
                answerIntent3.putExtra(CRIME3, variant_3_1);
                break;
            case R.id.radioQ12:
                answerIntent3.putExtra(CRIME3, variant_3_2);
                break;
            case R.id.radioQ13:
                answerIntent3.putExtra(CRIME3, variant_3_3);
                break;
            case R.id.radioQ14:
                answerIntent3.putExtra(CRIME3, variant_3_4);
                break;
            case R.id.radioQ15:
                answerIntent3.putExtra(CRIME3, variant_3_5);
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent3);
        finish();

    }
}
