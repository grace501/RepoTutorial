package com.example.repotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje();
    }

    private void mensaje(){
        Toast.makeText(this, "Sean todos bienvenidos!", Toast.LENGTH_SHORT).show();
    }
}
