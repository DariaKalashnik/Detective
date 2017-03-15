package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class SolveProblem2 extends AppCompatActivity {

    public final static String CRIME2 = "sherlock.CRIME2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem2);

        getSupportActionBar().hide();
    }

    //Set different answers for choosen RadioButtons

    public void onRadioClick2(View v) {
        Intent answerIntent2 = new Intent();

        switch (v.getId()) {
            case R.id.radioQ6:
                answerIntent2.putExtra(CRIME2, "Someone here likes Doctor Who");
                break;
            case R.id.radioQ7:
                answerIntent2.putExtra(CRIME2, "Correct. You are brilliant detective!");
                break;
            case R.id.radioQ8:
                answerIntent2.putExtra(CRIME2, "Sorry, but it is not that phrase");
                break;
            case R.id.radioQ9:
                answerIntent2.putExtra(CRIME2, "Quite close, but no");
                break;
            case R.id.radioQ10:
                answerIntent2.putExtra(CRIME2, "Always be careful with your answers");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent2);
        finish();

    }
}