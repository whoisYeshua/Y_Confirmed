package com.aralkos.yconfirmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
    }

    public void toSettings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
        Animatoo.animateSlideRight(this);
    }

}