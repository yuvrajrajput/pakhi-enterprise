package com.example.pakhi_enterprise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Phonenumber extends AppCompatActivity {
    Button btn_sn;
    EditText editTextPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonenumber);
        view();
        btn_sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editTextPhone.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Enter Valid Number",Toast.LENGTH_LONG).show();
                } else {
                    String phone = editTextPhone.getText().toString();
                    Intent i = new Intent(Phonenumber.this,OTP_Number.class);
                    i.putExtra("Phone",phone);
                    startActivity(i);
                    finish();
                }
            }
        });

    }

    private void view() {
        btn_sn = (Button) findViewById(R.id.btn_sn);
        editTextPhone = (EditText) findViewById(R.id.editTextPhone);

    }
}