package com.guptastuti.lab03onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView topLeft;
    TextView topRight;
    TextView bottomLeft;
    TextView bottomRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
