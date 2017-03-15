package com.example.android.detective;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;



public class Comments extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        getSupportActionBar().hide();


    }

    //To save the action of the send button after the screen rotation

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.activity_comments);
        }else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_comments_land);
        }
    }


    public void sendButton(View view) {

        EditText addmore = (EditText) findViewById(R.id.additionaltext);
        String AddInformation = addmore.getText().toString();

        CheckBox choice1 = (CheckBox) findViewById(R.id.check1);
        boolean Check1 = choice1.isChecked();
        String result1 = (String) choice1.getText();

        CheckBox choice2 = (CheckBox) findViewById(R.id.check2);
        boolean Check2 = choice2.isChecked();
        String result2 = (String) choice2.getText();

        CheckBox choice3 = (CheckBox) findViewById(R.id.check3);
        boolean Check3 = choice3.isChecked();
        String result3 = (String) choice3.getText();


        CheckBox choice4 = (CheckBox) findViewById(R.id.check4);
        boolean Check4 = choice4.isChecked();
        String result4 = (String) choice4.getText();

        CheckBox choice5 = (CheckBox) findViewById(R.id.check5);
        boolean Check5 = choice5.isChecked();
        String result5 = (String) choice5.getText();

        String informationContent = SendInformation(AddInformation, Check1, result1, Check2, result2,
                Check3, result3, Check4, result4, Check5, result5);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
        intent.putExtra(Intent.EXTRA_TEXT, informationContent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    private String SendInformation(String AddInformation, boolean Check1, String result1, boolean Check2, String result2,
                                   boolean Check3, String result3, boolean Check4, String result4, boolean Check5, String result5) {
        String informationContent = AddInformation + "\n";
        informationContent = informationContent + "\n" + result1 + ":  " + Check1;
        informationContent = informationContent + "\n" + result2 + ":  " + Check2;
        informationContent = informationContent + "\n" + result3 + ":  " + Check3;
        informationContent = informationContent + "\n" + result4 + ":  " + Check4;
        informationContent = informationContent + "\n" + result5 + ":  " + Check5;


        Toast toast = Toast.makeText(getApplication(), "Thank you for your feedback", Toast.LENGTH_SHORT);
        toast.show();
        return informationContent;

    }


    public void Check1(View view) {
        CheckBox wishClick = (CheckBox) findViewById(R.id.check1);
        wishClick.isChecked();
    }


    public void Check2(View view) {
        CheckBox wishClick = (CheckBox) findViewById(R.id.check2);
        wishClick.isChecked();
    }


    public void Check3(View view) {
        CheckBox wishClick = (CheckBox) findViewById(R.id.check3);
        wishClick.isChecked();
    }


    public void Check4(View view) {
        CheckBox wishClick = (CheckBox) findViewById(R.id.check4);
        wishClick.isChecked();
    }

    public void Check5(View view) {
        CheckBox wishClick = (CheckBox) findViewById(R.id.check5);
        wishClick.isChecked();
    }

    public void addmore(View view) {
        EditText addmore = (EditText) findViewById(R.id.additionaltext);
        String typecomment = addmore.getText().toString();
    }


}