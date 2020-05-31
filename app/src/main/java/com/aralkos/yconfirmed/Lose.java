package com.aralkos.yconfirmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Lose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);
    }

    public void toRes(View view) {
        Intent intent = new Intent(this, Result.class);
        startActivity(intent);
        Animatoo.animateSlideLeft(this);
    }
}