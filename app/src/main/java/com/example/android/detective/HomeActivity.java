package com.example.android.detective;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// Created by Daria Kalashnikova

public class HomeActivity extends AppCompatActivity {

    private EditText namespace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button startQuiz = (Button) findViewById(R.id.startQuiz);
        namespace = (EditText) findViewById(R.id.namespace);

        //Write a name in the HomeActivity in order to get it in the MainActivity
        startQuiz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("", getString(R.string.sayHello) + " " + namespace.getText().toString());
                startActivity(intent);

                String yoursecretname = namespace.getText().toString().trim();

                // Message to the user if EdiText is empty
                if (TextUtils.isEmpty(yoursecretname) || yoursecretname.length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.ToastMessage_1), Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

    public void namespace(View view) {
        namespace.getText();
    }
}
