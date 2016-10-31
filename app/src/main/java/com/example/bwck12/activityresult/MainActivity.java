package com.example.bwck12.activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by bwck12 on 31/10/2016.
 */

public class MainActivity  extends AppCompatActivity {
    public void getMessage(View v){
        Intent intentGetMessage = new Intent(this, SecondActivity.class);

        startActivityForResult(intentGetMessage, 2);
    }

    @Override
    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2){
            if(null!=data){
                String message = data.getStringExtra("MESSAGE");
                TextView textViewMessage = (TextView)findViewById(R.id.textViewMessage);
                textViewMessage.setText("Message is: " + message);
            }
        }
    }
}
