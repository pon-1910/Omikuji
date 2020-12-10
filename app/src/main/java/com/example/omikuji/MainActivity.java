package com.example.omikuji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.but_omi);

        ImageButton but_omi = findViewById(R.id.but_omi);
        but_omi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRotationXml();
            }
        });
    }

    private void startRotationXml(){
        RotateAnimation rotate = new RotateAnimation(0.0f, 180.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotate.setDuration(3000);
        rotate.setFillAfter(true);

        imageView.startAnimation(rotate);
    }
}