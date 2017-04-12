package com.example.android.detective;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class Comments extends AppCompatActivity {


    // Save variables

    private Button sendButton;
    private EditText addmore;
    private CheckBox choice1;
    private CheckBox choice2;
    private CheckBox choice3;
    private CheckBox choice4;
    private CheckBox choice5;

    private String result1;
    private String result2;
    private String result3;
    private String result4;
    private String result5;
    private String AddInformation;
    private String EmailTo = "kalashnikovadoc@gmail.com";
    private String EmailFrom = "emailaddress@emailaddress.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        sendButton = (Button) findViewById(R.id.send);
        addmore = (EditText) findViewById(R.id.additionaltext);
        choice1 = (CheckBox) findViewById(R.id.check1);
        choice2 = (CheckBox) findViewById(R.id.check2);
        choice3 = (CheckBox) findViewById(R.id.check3);
        choice4 = (CheckBox) findViewById(R.id.check4);
        choice5 = (CheckBox) findViewById(R.id.check5);


        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                AddInformation = addmore.getText().toString();

                // Check if the CheckBox is clicked or not

                boolean Check1 = choice1.isChecked();

                if (Check1) {
                    result1 = choice1.getText().toString();
                } else {
                    result1 = "";
                }

                boolean Check2 = choice2.isChecked();

                if (Check2) {
                    result2 = choice2.getText().toString();
                } else {
                    result2 = "";
                }

                boolean Check3 = choice3.isChecked();

                if (Check3) {
                    result3 = choice3.getText().toString();
                } else {
                    result3 = "";
                }


                boolean Check4 = choice4.isChecked();
                if (Check4) {
                    result4 = choice4.getText().toString();
                } else {
                    result4 = "";
                }

                boolean Check5 = choice5.isChecked();

                if (Check5) {
                    result5 = choice5.getText().toString();
                } else {
                    result5 = "";
                }

                String informationContent = SendInformation(AddInformation, result1, result2,
                        result3, result4, result5);


                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:kalashnikovadoc@gmail.com"));
                intent.putExtra(Intent.EXTRA_EMAIL, EmailTo);
                intent.putExtra(Intent.EXTRA_EMAIL, EmailFrom);
                intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.Subject));
                intent.putExtra(Intent.EXTRA_TEXT, informationContent);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }

    // Send information in mail

    private String SendInformation(String AddInformation, String result1, String result2,
                                   String result3, String result4, String result5) {
        String message = getString(R.string.ForthenextQuiz);
        String informationContent = AddInformation + "\n" + message;
        informationContent += "\n" + result1;
        informationContent += "\n" + result2;
        informationContent += "\n" + result3;
        informationContent += "\n" + result4;
        informationContent += "\n" + result5;


        String feedback = getString(R.string.ToastMessage_2);
        Toast toast = Toast.makeText(getApplication(), feedback, Toast.LENGTH_SHORT);
        toast.show();
        return informationContent;

    }


    public void Check1(View view) {
        choice1.isChecked();
    }


    public void Check2(View view) {
        choice2.isChecked();
    }


    public void Check3(View view) {
        choice3.isChecked();
    }


    public void Check4(View view) {
        choice4.isChecked();
    }

    public void Check5(View view) {
        choice5.isChecked();
    }

    public void addmore(View view) {
        addmore.getText();
    }


    public void sendButton(View view) {
        sendButton.callOnClick();
    }
}