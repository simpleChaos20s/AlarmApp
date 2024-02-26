package com.example.alarmapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.add_item_menu){
            Toast.makeText(this, "Add new time", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.edit_item_menu){
            Toast.makeText(this, "Edit time", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.sort_item_menu){
            Toast.makeText(this, "Sort times", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.settings_item_menu){
            Toast.makeText(this, "Setting time", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}