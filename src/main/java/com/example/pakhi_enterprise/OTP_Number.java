package com.example.pakhi_enterprise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class OTP_Number extends AppCompatActivity {

    Button btn_otp;
    EditText edt_otp;
    CheckBox chb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p__number);

        btn_otp = (Button) findViewById(R.id.btn_otp);
        edt_otp = (EditText) findViewById(R.id.edt_otp);
        chb = (CheckBox) findViewById(R.id.chb);

        btn_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(edt_otp.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Otp Require",Toast.LENGTH_LONG).show();
                } else {
                    if (chb.isChecked()){
                        Intent i = new Intent(OTP_Number.this,MainNavigationDrawerActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext()," Please Agree With Terms And Condition",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}