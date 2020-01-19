package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        Button btn0=findViewById(R.id.num0);
        Button btn1=findViewById(R.id.num1);
        Button btn2=findViewById(R.id.num2);
        Button btn3=findViewById(R.id.num3);
        Button btn4=findViewById(R.id.num4);
        Button btn5=findViewById(R.id.num5);
        Button btn6=findViewById(R.id.num6);
        Button btn7=findViewById(R.id.num7);
        Button btn8=findViewById(R.id.num8);
        Button btn9=findViewById(R.id.num9);
        Button btntochka=findViewById(R.id.numtochka);

        btn0.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num0);
                disp.setText(text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num1);
                disp.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num2);
                disp.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num3);
                disp.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num4);
                disp.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num5);
                disp.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num6);
                disp.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num7);
                disp.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num8);
                disp.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num9);
                disp.setText(text);
            }
        });
        btntochka.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_numtochka);
                disp.setText(text);
            }
        });
    }
}