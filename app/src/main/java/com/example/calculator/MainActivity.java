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
        Button btntochka=findViewById(R.id.num);
        btn0.setOnClickListener(new View.OnClickListener() {
            TextView txt = findViewById(R.id.number);
            @Override
            public void onClick(View v) {
                String text = getString(R.string.txt_num0);
                txt.setText(text);
            }
        });

    }
}
