package com.example.omikuji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView lucky = findViewById(R.id.lucky);
        int lucky_number = (int)(Math.random() * 1000000) % 10 + 1;

        if (lucky_number == 1){
            lucky.setText("大吉");

        }else if (lucky_number == 2 || lucky_number == 3){
            lucky.setText("吉");

        }else if (lucky_number == 4 || lucky_number == 5){
            lucky.setText("中吉");

        }else if (lucky_number == 6 || lucky_number == 7){
            lucky.setText("小吉");

        }else if (lucky_number == 8 || lucky_number == 9){
            lucky.setText("末吉");

        }else{
            lucky.setText("凶");
        }

        View btn_re = findViewById(R.id.btn_re);
        btn_re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}