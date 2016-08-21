package com.sammy.production.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popMov(View view) {
        Toast.makeText(MainActivity.this, "This button will open my Popular Movies App!", Toast.LENGTH_SHORT).show();
    }

    public void stock(View view) {
        Toast.makeText(MainActivity.this, "This button will open my Stock Hawk App!", Toast.LENGTH_SHORT).show();
    }

    public void big(View view) {
        Toast.makeText(MainActivity.this, "This button will open my Build It Bigger App!", Toast.LENGTH_SHORT).show();
    }

    public void material(View view) {
        Toast.makeText(MainActivity.this, "This button will open my Material Design App!", Toast.LENGTH_SHORT).show();
    }

    public void ubi(View view) {
        Toast.makeText(MainActivity.this, "This button will open my Ubiquitous App!", Toast.LENGTH_SHORT).show();
    }

    public void capstone(View v) {
        Toast.makeText(MainActivity.this, "This button will open my CAPSTONE App!", Toast.LENGTH_SHORT).show();
    }
}
