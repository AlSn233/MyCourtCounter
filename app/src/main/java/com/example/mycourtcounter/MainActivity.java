package com.example.mycourtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView p1;
    TextView p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = findViewById(R.id.text2);
        p2 = findViewById(R.id.text4);

    }
    public void bt1(View v){
        int score = Integer.valueOf(p1.getText().toString());
        score += 1;
        p1.setText(score+"");
    }
    public void bt2(View v){
        int score = Integer.valueOf(p1.getText().toString());
        score  += 2;
        p1.setText(score +"");
    }
    public void bt3(View v){
        int score  = Integer.valueOf(p1.getText().toString());
        score += 3;
        p1.setText(score +"");
    }
    public void bt4(View v){
        int score  = Integer.valueOf(p2.getText().toString());
        score += 1;
        p2.setText(score +"");
    }
    public void bt5(View v){
        int score  = Integer.valueOf(p2.getText().toString());
        score  += 2;
        p2.setText(score +"");
    }
    public void bt6(View v){
        int score  = Integer.valueOf(p2.getText().toString());
        score  += 3;
        p2.setText(score +"");
    }
    public void bt7(View v){
        p1.setText(0+"");
        p2.setText(0+"");
    }
}