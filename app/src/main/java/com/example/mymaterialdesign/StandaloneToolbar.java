package com.example.mymaterialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class StandaloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Standalone toolbar");
        toolbar.setSubtitle("by SarcasticNickname");

        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = (String) item.getTitle();
                Toast.makeText(StandaloneToolbar.this, title + " Selected !", Toast.LENGTH_SHORT).show();

                switch (item.getItemId()) {
                    case R.id.save:
                        break;
                    case R.id.mail:
                        break;
                }
                return true;
            }
        });
    }
}