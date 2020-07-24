package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonSubmit;
    EditText etName,etRoll,etMobile,etEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSubmit=findViewById(R.id.ssubmit);
        etName=findViewById(R.id.sname);
        etRoll=findViewById(R.id.srollno);
        etMobile=findViewById(R.id.smobileno);
        etEmail=findViewById(R.id.semailid);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Processing",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}