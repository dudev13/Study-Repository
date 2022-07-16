package com.curso.appsorteio;

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

    public void mostrarNumero(View view){

        TextView txt = findViewById(R.id.txt2);

        int n = new Random().nextInt(5);

        txt.setText("Número: " + n);

    }

}