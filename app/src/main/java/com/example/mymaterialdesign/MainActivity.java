package com.example.mymaterialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button first = findViewById(R.id.first_button);
        first.setOnClickListener(this::firstButtonOnClick);
        Button second = findViewById(R.id.second_button);
        second.setOnClickListener(this::secondButtonOnClick);
        Button third = findViewById(R.id.third_button);
        third.setOnClickListener(this::thirdButtonOnClick);
    }

    private void firstButtonOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, StandaloneToolbar.class);
        startActivity(intent);
    }

    private void secondButtonOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, ActionBarToolbar.class);
        startActivity(intent);
    }

    private void thirdButtonOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, ContextualMenu.class);
        startActivity(intent);
    }
}