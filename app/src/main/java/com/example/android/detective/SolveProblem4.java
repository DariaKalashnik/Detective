package com.example.android.detective;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Created by Daria Kalashnikova

public class SolveProblem4 extends AppCompatActivity {

    public final static String CRIME4 = "sherlock.CRIME4";
    Button checkIt;
    String input;
    private EditText answer;
    String correct_answer = "Victor";
    // boolean compare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_problem4);

        answer = (EditText) findViewById(R.id.answer);
        checkIt = (Button) findViewById(R.id.checkIt);

        checkIt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent answerIntent4 = new Intent();
                input = answer.getText().toString();
                answerIntent4.putExtra(CRIME4, input);
                if (TextUtils.isEmpty(input) || input.length() == 0) {
                    answerIntent4.putExtra(CRIME4, getString(R.string.blank));
                } else if (input.trim().equalsIgnoreCase(correct_answer)) {
                    answerIntent4.putExtra(CRIME4, getString(R.string.correct));
                    MainActivity.score[3] = true;
                } else {
                    answerIntent4.putExtra(CRIME4, getString(R.string.message_4_1));
                    MainActivity.score[3] = true;
                }
                setResult(RESULT_OK, answerIntent4);
                finish();
            }
        });
    }

    public void answer(View view) {
        answer.getText();
    }

    public void checkIt(View view) {
    }
}

