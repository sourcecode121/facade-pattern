package com.example.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Facade calc = new FacadeImpl(new ClassA(), new ClassB(), new ClassC());
        Log.d("MainActivity", Integer.toString(calc.sum()));
    }
}
