package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button buttonBack;
    TextView etName1, etRoll1, etMobile1, etEmail1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttonBack =findViewById(R.id.ssubmit1);
        etName1 =findViewById(R.id.sname1);
        etRoll1 =findViewById(R.id.srollno1);
        etMobile1 =findViewById(R.id.smobileno1);
        etEmail1 =findViewById(R.id.semailid1);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}