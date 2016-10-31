package com.example.bwck12.activityresult;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by bwck12 on 31/10/2016.
 */

public class SecondActivity extends AppCompatActivity{
    EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextMessage=(EditText)findViewById(R.id.editTextMessage);
    }

    public void submitMessage(View V){
        String message=editTextMessage.getText().toString();
        Intent intentMessage = new Intent();

        intentMessage.putExtra("MESSAGE", message);
        setResult(2, intentMessage);
        finish();
    }

}
