package com.example.cycledevie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int c = 0;
    private TextView Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Show = (TextView) findViewById(R.id.show_count);
        if (savedInstanceState != null)
        {
            onRestoreInstanceState(savedInstanceState);

        }

    }
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // Save custom values into the bundle

        savedInstanceState.putString("editText", Show.getText().toString());
        savedInstanceState.putInt("count", c);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }



    public void count(View view) {
        c++;
        if (Show != null)
            Show.setText(Integer.toString(c));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state members from saved instance
       int count = savedInstanceState.getInt("count");
         String edit = savedInstanceState.getString("editText");
    }



}
