package com.example.mymaterialdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

public class ActionBarToolbar extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String message = "";
        switch (item.getItemId()) {
            case R.id.save:
                message = getString(R.string.menu_save);
                break;
            case R.id.mail:
                message = getString(R.string.email);
                break;
            case R.id.camera:
                message = getString(R.string.camera);
                break;
            case R.id.settings:
                message = getString(R.string.settings);
                break;
            case R.id.web_search:
                message = getString(R.string.web_search);
                break;
            case R.id.help:
                message = getString(R.string.help);
                break;
        }
        Toast.makeText(ActionBarToolbar.this, message + " clicked!", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Action Bar Toolbar.");
        toolbar.setSubtitle("by SarcasticNickname");
        setSupportActionBar(toolbar);
    }
}