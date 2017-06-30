package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.android.detective.R.id.greetings;

// Created by Daria Kalashnikova

public class MainActivity extends AppCompatActivity {

    private static final String Answer1 = "answer1";
    private static final String Answer2 = "answer2";
    private static final String Answer3 = "answer3";
    private static final String Answer4 = "answer4";
    static final private int CHOOSE_ANSWER = 0;
    static final private int CHOOSE_ANSWER2 = 0;
    static final private int CHOOSE_ANSWER3 = 0;
    static final private int CHOOSE_ANSWER4 = 0;
    private TextView infoTextView;
    private TextView infoTextView1;
    private TextView infoTextView2;
    private TextView infoTextView3;
    private Intent questionIntent;
    private Intent questionIntent2;
    private Intent questionIntent3;
    private Intent questionIntent4;
    private Intent commentIntent;
    String problem1;
    String problem2;
    String problem3;
    String problem4;
    public static boolean score[] = {false, false, false, false};

    // Save and Restore Answers after screen rotation
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(Answer1, (String) infoTextView.getText());
        outState.putString(Answer2, (String) infoTextView1.getText());
        outState.putString(Answer3, (String) infoTextView2.getText());
        outState.putString(Answer4, (String) infoTextView3.getText());
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        infoTextView.setText(savedInstanceState.getString(Answer1));
        infoTextView1.setText(savedInstanceState.getString(Answer2));
        infoTextView2.setText(savedInstanceState.getString(Answer3));
        infoTextView3.setText(savedInstanceState.getString(Answer4));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(greetings);
        infoTextView = (TextView) findViewById(R.id.textViewInfo);
        infoTextView1 = (TextView) findViewById(R.id.textViewInfo1);
        infoTextView2 = (TextView) findViewById(R.id.textViewInfo2);
        infoTextView3 = (TextView) findViewById(R.id.textViewInfo3);
        questionIntent = new Intent(MainActivity.this, SolveProblem.class);
        questionIntent2 = new Intent(MainActivity.this, SolveProblem2.class);
        questionIntent3 = new Intent(MainActivity.this, SolveProblem3.class);
        questionIntent4 = new Intent(MainActivity.this, SolveProblem4.class);
        commentIntent = new Intent(MainActivity.this, Comments.class);
        Intent intent = getIntent();
        String str = intent.getStringExtra("");
        textView.setText(str);
    }

    public void onClick(View v) {
        startActivityForResult(questionIntent, CHOOSE_ANSWER);
    }

    public void onClick1(View view) {
        startActivityForResult(questionIntent2, CHOOSE_ANSWER2);
    }

    public void onClick2(View v) {
        startActivityForResult(questionIntent3, CHOOSE_ANSWER3);
    }

    public void onClick3(View v) {
        startActivityForResult(questionIntent4, CHOOSE_ANSWER4);
    }

    // Get results of Questions in the Main Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CHOOSE_ANSWER) {
            if (resultCode == RESULT_OK) {
                problem1 = data.getStringExtra(SolveProblem.CRIME);
                infoTextView.setText(problem1);
            } else {
                infoTextView.setText("");
            }
        }
        if (requestCode == CHOOSE_ANSWER2) {
            if (resultCode == RESULT_OK) {
                problem2 = data.getStringExtra(SolveProblem2.CRIME2);
                infoTextView1.setText(problem2);
            } else {
                infoTextView1.setText("");
            }
        }

        if (requestCode == CHOOSE_ANSWER3) {
            if (resultCode == RESULT_OK) {
                problem3 = data.getStringExtra(SolveProblem3.CRIME3);
                infoTextView2.setText(problem3);
            } else {
                infoTextView2.setText("");
            }
        }
        if (requestCode == CHOOSE_ANSWER4) {
            if (resultCode == RESULT_OK) {
                problem4 = data.getStringExtra(SolveProblem4.CRIME4);
                infoTextView3.setText(problem4);
            } else {
                infoTextView3.setText("");
            }
        }
    }

    public void onComment(View view) {
        CheckAnswers();
        startActivity(commentIntent);
    }

    public void CheckAnswers(){
        int points = 0;
        for(boolean current_answer : score){
            if (current_answer){
                points += 1;
            }
        }

        Toast.makeText(getApplicationContext(), "You solved: " + points + " out of 4 cases", Toast.LENGTH_LONG).show();
    }
}







