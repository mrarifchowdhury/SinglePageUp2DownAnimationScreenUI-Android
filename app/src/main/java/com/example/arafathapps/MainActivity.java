package com.example.arafathapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l2,l3;

    Button btnsub;

    Animation uptodown,downtoup,lefttomiddle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsub = (Button)findViewById(R.id.button);
        l1 = (LinearLayout)findViewById(R.id.l1);
        l2 = (LinearLayout)findViewById(R.id.l2);
        l3 = (LinearLayout)findViewById(R.id.l3);

        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown );
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        lefttomiddle = AnimationUtils.loadAnimation(this,R.anim.lefttomiddle);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
        l3.setAnimation(lefttomiddle);

    }
}
