package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();


        Button StartQuiz = (Button) findViewById(R.id.startQuiz);

        //Write a name in the HomeActivity in order to get it in the MainActivity

        StartQuiz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText etLocation = (EditText) findViewById(R.id.namespace);
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("", "Hello, detective " + etLocation.getText().toString());
                startActivity(intent);
            }
        });

    }


    public void namespace(View view) {
        EditText namespace = (EditText) findViewById(R.id.namespace);
        String greetings = namespace.getText().toString();
    }
}
