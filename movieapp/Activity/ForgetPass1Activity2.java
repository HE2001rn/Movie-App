package com.example.movieapp.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.movieapp.R;

public class ForgetPass1Activity2 extends AppCompatActivity {

    private Button sendbtn;
    private Button sign;
    private Button save;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forget_pass12);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView btn1=findViewById(R.id.backSignin);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ForgetPass1Activity2.this,SignUpActivity2.class));
            }
        });
        sendbtn=findViewById(R.id.Sendbtn);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ForgetPass1Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        sign=findViewById(R.id.SignInbtn);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ForgetPass1Activity2.this, SignUpActivity2.class);
                startActivity(intent);
            }
        });
        save=findViewById(R.id.savebtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ForgetPass1Activity2.this, SignUpActivity2.class);
                startActivity(intent);
            }
        });
    }
}