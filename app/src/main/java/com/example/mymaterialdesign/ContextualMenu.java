package com.example.mymaterialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextualMenu extends AppCompatActivity {

    Button button;
    ActionMode actionMode;
    private final ActionMode.Callback contextualCallback = new ActionMode.Callback() {

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("My Action mode");
            actionMode.setSubtitle("by SarcasticNickname");
            return true;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_menu);

        Toolbar toolbar = findViewById(R.id.contextual_toolbar);
        toolbar.setTitle("Contextual activity toolbar");
        toolbar.setSubtitle("by SarcasticNickname");
        setSupportActionBar(toolbar);

        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(item -> {
            String title = (String)item.getTitle();
            Toast.makeText(ContextualMenu.this, title + " selected", Toast.LENGTH_SHORT).show();
            return true;
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> actionMode = startActionMode(contextualCallback));
    }
}