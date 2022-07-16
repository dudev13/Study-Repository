package com.curso.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase (View view){

        String[] frases = {
                "1",
                "2",
                "3",
                "4!",
                "5"};

        int numero = new Random().nextInt(5); // numeros a partir do 0

        TextView texto = findViewById(R.id.txt_res);
        texto.setText(frases[numero]);

    }

    }