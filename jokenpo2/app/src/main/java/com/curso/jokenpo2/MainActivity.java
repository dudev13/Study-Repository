package com.curso.jokenpo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//objeto das opcoes
    ImageView resultado = findViewById(R.id.resultado);
    TextView textoResultado = findViewById(R.id.txt_result);

    //metodos
    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String userChoise){
        int num = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String appChoise = opcoes [num];

        switch (appChoise) {
            case "pedra" :
                resultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                resultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                resultado.setImageResource(R.drawable.tesoura1);
                break;
        }

        if(                     //App ganhador
                (appChoise == "tesoura" && userChoise == "papel") ||
                        (appChoise == "papel" && userChoise == "pedra")||
                        (appChoise == "pedra" && userChoise == "tesoura" )
        ){
            textoResultado.setText ("Você Perdeu =( ");
        }else if(               //Usuario Ganhador
                (userChoise == "tesoura" && appChoise == "papel") ||
                        (userChoise == "papel" && appChoise == "pedra")||
                        (userChoise == "pedra" && appChoise == "tesoura" )
        ){
            textoResultado.setText ("Você Ganhou =) ");
        }else{      //Empate
            textoResultado.setText ("Empatamos ;) ");
        }


        // System.out.println("Opção Selecionada:" + appChoise);


    }

}