package com.curso.a5tent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_buscar).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                ActivityOptionsCompat ActivityOptionsCompat = androidx.core.app.ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_right);
                ActivityCompat.startActivity(MainActivity.this, intent, ActivityOptionsCompat.toBundle());
            }
        });
    }
}