package com.example.android.detective;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.detective.R.id.greetings;
import static com.example.android.detective.R.id.namespace;
import static com.example.android.detective.R.id.textView1;


public class MainActivity extends AppCompatActivity {


    static final private int CHOOSE_ANSWER = 0;
    static final private int CHOOSE_ANSWER2 = 0;
    static final private int CHOOSE_ANSWER3 = 0;
    static final private int CHOOSE_ANSWER4 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        TextView textView = (TextView) findViewById(greetings);

        Intent intent = getIntent();
        String str = intent.getStringExtra("");
        textView.setText(str);
    }

    public void onClick(View v) {
        Intent questionIntent = new Intent(MainActivity.this, SolveProblem.class);
        startActivityForResult(questionIntent, CHOOSE_ANSWER);
    }


    public void onClick1(View view) {
        Intent questionIntent2 = new Intent(MainActivity.this, SolveProblem2.class);
        startActivityForResult(questionIntent2, CHOOSE_ANSWER2);
    }

    public void onClick2(View v) {
        Intent questionIntent3 = new Intent(MainActivity.this, SolveProblem3.class);
        startActivityForResult(questionIntent3, CHOOSE_ANSWER3);
    }

    public void onClick3(View v) {
        Intent questionIntent4 = new Intent(MainActivity.this, SolveProblem4.class);
        startActivityForResult(questionIntent4, CHOOSE_ANSWER4);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);
        TextView infoTextView1 = (TextView) findViewById(R.id.textViewInfo1);
        TextView infoTextView2 = (TextView) findViewById(R.id.textViewInfo2);
        TextView infoTextView3 = (TextView) findViewById(R.id.textViewInfo3);


        if (requestCode == CHOOSE_ANSWER) {
            if (resultCode == RESULT_OK) {
                String problem = data.getStringExtra(SolveProblem.CRIME);
                infoTextView.setText(problem);
            } else {
                infoTextView.setText("");
            }
        }

        if (requestCode == CHOOSE_ANSWER2) {
            if (resultCode == RESULT_OK) {

                String problem2 = data.getStringExtra(SolveProblem2.CRIME2);
                infoTextView1.setText(problem2);
            } else {
                infoTextView1.setText("");
            }
        }


        if (requestCode == CHOOSE_ANSWER3) {
            if (resultCode == RESULT_OK) {

                String problem3 = data.getStringExtra(SolveProblem3.CRIME3);
                infoTextView2.setText(problem3);
            } else {
                infoTextView2.setText("");
            }
        }

        if (requestCode == CHOOSE_ANSWER4) {
            if (resultCode == RESULT_OK) {

                String problem4 = data.getStringExtra(SolveProblem4.CRIME4);
                infoTextView3.setText(problem4);
            } else {
                infoTextView3.setText("");
            }
        }
    }


    public void onComment(View view) {
        Intent commentIntent = new Intent(MainActivity.this, Comments.class);
        startActivity(commentIntent);
    }

}







