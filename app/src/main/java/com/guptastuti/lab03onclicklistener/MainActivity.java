package com.guptastuti.lab03onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.view.View;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.SeekBar;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    TextView topLeft;
    TextView topRight;
    TextView bottomLeft;
    TextView bottomRight;
    SeekBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topLeft = findViewById(R.id.textTopLeft);
        topRight = findViewById(R.id.textTopRight);
        bottomLeft = findViewById(R.id.textBottomLeft);
        bottomRight = findViewById(R.id.textBottomRight);
        seekbar = findViewById(R.id.seekbar);
        final SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        OnClickListener myListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if (v == topLeft) {
                    int idTL = sharedPreferences.getInt("TL", 0);
                    editor.putInt("TL", idTL+1);
                    editor.apply();
                    Log.i("top left", "topLeft");
                    Toast.makeText(MainActivity.this, "top left" + sharedPreferences.getInt("TL", 0), Toast.LENGTH_SHORT).show();
                }
                if (v == topRight) {
                    int idTR = sharedPreferences.getInt("TR", 0);
                    editor.putInt("TR", idTR+1);
                    editor.apply();
                    Log.i("top right", "topRight");
                    Toast.makeText(MainActivity.this, "top right" + sharedPreferences.getInt("TR", 0), Toast.LENGTH_SHORT).show();
                }
                if (v == bottomLeft) {
                    int idBL = sharedPreferences.getInt("BL", 0);
                    editor.putInt("BL", idBL+1);
                    editor.apply();
                    Log.i("bottom left", "bottomLeft");
                    Toast.makeText(MainActivity.this, "bottom left" + sharedPreferences.getInt("BL", 0), Toast.LENGTH_SHORT).show();
                }
                if (v == bottomRight) {
                    int idBR = sharedPreferences.getInt("BR", 0);
                    editor.putInt("BR", idBR+1);
                    editor.apply();
                    Log.i("bottom right", "bottomRight");
                    Toast.makeText(MainActivity.this, "bottom right" + sharedPreferences.getInt("BR", 0), Toast.LENGTH_SHORT).show();
                }
            }
        };
        topLeft.setOnClickListener(myListener);
        topRight.setOnClickListener(myListener);
        bottomLeft.setOnClickListener(myListener);
        bottomRight.setOnClickListener(myListener);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                topLeft.setTextSize(progress + 1);
                topRight.setTextSize(progress + 1);
                bottomLeft.setTextSize(progress + 1);
                bottomRight.setTextSize(progress + 1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
