package com.example.javaguifun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); don't inflate ANY XML
        //everything we've done in XML, there is a java equivalent for
        //we will create our own custom GridLayout
        //xml is static
        //if we need a dynamic layout, it needs to be defined in Java
        //ex. an NxN grid of buttons, N is user input
        MyGridLayout myGridLayout = new MyGridLayout(this);
        setContentView(myGridLayout);
    }
}
