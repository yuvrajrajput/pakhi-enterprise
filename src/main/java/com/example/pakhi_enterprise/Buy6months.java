package com.example.pakhi_enterprise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Buy6months extends AppCompatActivity {

    EditText cnum;
    Button subbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy6months);

        startactivity();

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
            }
        });

    }

    public void startactivity() {
        cnum = (EditText)findViewById(R.id.cnum);
        subbtn = (Button)findViewById(R.id.subbtn);
    }

}