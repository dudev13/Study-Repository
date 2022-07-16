package com.curso.diretorio_falhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.curso.truckimports.MainActivity_2;
import com.curso.truckimports.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //animacoes
        findViewById(R.id.btn_buscar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.curso.diretorio_falhas.MainActivity.this, MainActivity_2.class);
                ActivityOptionsCompat ActivityOptionsCompat = androidx.core.app.ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_right);
                ActivityCompat.startActivity(com.curso.diretorio_falhas.MainActivity.this, intent, ActivityOptionsCompat.toBundle());
            }
        });

    }
}