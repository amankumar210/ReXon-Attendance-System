package com.example.sih_facedetection;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    Button Buttton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Buttton6=(Button)findViewById(R.id.button6);
        Buttton6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}