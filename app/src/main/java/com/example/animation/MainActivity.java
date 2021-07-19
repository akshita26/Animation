package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation animation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView3);
//        animation= AnimationUtils.loadAnimation(this,R.anim.rot);
        animation= AnimationUtils.loadAnimation(this,R.anim.trans);
    }

    public void anm(View view) {
        imageView.startAnimation(animation);
    }
}