package com.am.numberguessing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splach extends AppCompatActivity {

    private ImageView imageView;
    Animation animationsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);

        imageView = findViewById(R.id.imageView);
        animationsplash = AnimationUtils.loadAnimation(this,R.anim.splash_animation);
        imageView.setAnimation(animationsplash);
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(Splach.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}