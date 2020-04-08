package com.example.cel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        ImageButton backtohome = findViewById(R.id.btnhome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(contacto.this, MainActivity.class);
                startActivity(i);
            }
        });
        
    }
}
