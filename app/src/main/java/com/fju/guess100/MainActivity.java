package com.fju.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       public void guess100 (View view){
        EditText edsecert=(EditText)findViewById(R.id.secert);
        EditText edinfo=(EditText)findViewById(R.id.info);
        EditText ednumber =(EditText)findViewById(R.id.number);
        EditText esend=(EditText)findViewById(R.id.send);
        float weight=Float.parseFloat(edsecert.getText().toString());
        float weight=Float.parseFloat(edinfo.getText().toString());
        float weight=Float.parseFloat(ednumber.getText().toString());

        float weight=Float.parseFloat(edsend.getText().toString());
    }

       }


