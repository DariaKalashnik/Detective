package com.example.android.detective;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class HomeActivity extends AppCompatActivity {

    private EditText namespace;
    private String enternamespace = "Hello detective ";

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
                intent.putExtra("", enternamespace + namespace.getText().toString());
                startActivity(intent);
            }
        });

    }


    public void namespace(View view) {
        namespace.getText();
    }
}
