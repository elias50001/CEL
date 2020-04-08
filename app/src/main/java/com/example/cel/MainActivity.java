package com.example.cel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton bcurso, bhorario, bcostos, branking, blibros, binfo, bcontacto, breq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bcurso = findViewById(R.id.imageButton);
        bcurso.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, cursos.class);
                startActivity(intent);
            }
        });

        bhorario = findViewById(R.id.imageButton2);
        bhorario.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, horario.class);
                startActivity(intent);
            }
        });

        bcostos = findViewById(R.id.imageButton3);
        bcostos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, costos.class);
                startActivity(intent);
            }
        });

        branking = findViewById(R.id.imageButton4);
        branking.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, ranking.class);
                startActivity(intent);
            }
        });

        breq = findViewById(R.id.imageButton5);
        breq.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, requerimiento.class);
                startActivity(intent);
            }
        });

        blibros = findViewById(R.id.imageButton6);
        blibros.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, libros.class);
                startActivity(intent);
            }
        });

        binfo = findViewById(R.id.imageButton7);
        binfo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, info.class);
                startActivity(intent);
            }
        });

        bcontacto = findViewById(R.id.imageButton8);
        bcontacto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Intent is what you use to start another activity
                Intent intent = new Intent(MainActivity.this, contacto.class);
                startActivity(intent);
            }
        });


    }

}