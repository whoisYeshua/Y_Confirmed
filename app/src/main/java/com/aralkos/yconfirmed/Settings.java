package com.aralkos.yconfirmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void toMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Animatoo.animateFade(this);
    }

    public void toStatistics(View view) {
        Intent intent = new Intent(this, Statistics.class);
        startActivity(intent);
        Animatoo.animateSlideLeft(this);
    }

}