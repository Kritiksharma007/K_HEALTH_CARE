package com.back4app.quickstartexampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class kritik_intent_launcher extends AppCompatActivity {
    TextView t1;
    Button btn1,btn2,btn3;
    ImageView iv1,iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kritik_intent_launcher);
        t1=findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(kritik_intent_launcher.this,Newapp1.class);
                startActivity(intent);
            }
        });
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(kritik_intent_launcher.this,Newapp1.class);
                startActivity(intent);
            }
        });
        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(kritik_intent_launcher.this,contactus1.class);
                startActivity(intent);
            }
        });
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(kritik_intent_launcher.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}