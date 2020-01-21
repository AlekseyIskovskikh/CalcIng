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
        Button btnC=findViewById(R.id.numC);
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
        Button btnplus=findViewById(R.id.numplus);
        Button btnminus= findViewById(R.id.numminus);
        Button btnrav= findViewById(R.id.numrav);
        Button btnmult= findViewById(R.id.nummult);
        Button btndiv= findViewById(R.id.numdiv);
        Button btnprocent= findViewById(R.id.numprocent);


        btnC.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                disp.setText(" ");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num0);
                disp.setText(disp.getText() + text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num1);
                disp.setText(disp.getText() + text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num2);
                disp.setText(disp.getText() + text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num3);
                disp.setText(disp.getText() + text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num4);
                disp.setText(disp.getText() + text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num5);
                disp.setText(disp.getText() + text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num6);
                disp.setText(disp.getText() + text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num7);
                disp.setText(disp.getText() + text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num8);
                disp.setText(disp.getText() + text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num9);
                disp.setText(disp.getText() + text);
            }
        });
        btntochka.setOnClickListener(new View.OnClickListener() {
            TextView disp = findViewById(R.id.disp);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_numtochka);
                disp.setText(disp.getText() + text);
            }
        });
    }
}