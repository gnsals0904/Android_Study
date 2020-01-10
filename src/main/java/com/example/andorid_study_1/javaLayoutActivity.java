package com.example.andorid_study_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class javaLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button myButton = new Button(this);
        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.addView(myButton);
        setContentView(myLayout);

    }
}
