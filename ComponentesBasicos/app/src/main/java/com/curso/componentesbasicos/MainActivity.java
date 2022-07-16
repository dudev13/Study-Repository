package com.curso.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

        private  EditText campoNome;
        private TextInputEditText campoEmail;
        private TextView textoresultado;

        private CheckBox checkVerde, checkBranco, checkVerm;
        //RadioButton
        private RadioButton sexoMasculino, sexoFeminino;
        private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        textoresultado  = findViewById(R.id.textResul);

        //CheckBox
        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVerm       = findViewById(R.id.checkVerm);

        //RadioButton
        sexoFeminino = findViewById(R.id.rdF);
        sexoMasculino = findViewById(R.id.rdM);
        opcaoSexo = findViewById(R.id.rgS);
        radiobutton();
    }

    public void radiobutton() {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == R.id.rdF) {
                    textoresultado.setText("Feminino");
                } else if (checkedId == R.id.rdM)
                    textoresultado.setText("Masculino");
            }
        });
    }
/*
        if (sexoFeminino.isChecked()) {
            textoresultado.setText("Feminino");
        } else {
            textoresultado.setText("Masculino");
        }
    }
 */

/*
    public void checkbox(){

        String texto = "";
        if( checkVerde.isChecked() ){
            texto = "Verde selecionado - ";
        }

        if( checkBranco.isChecked() ){
            texto = texto + "Branco selecionado - ";
        }

        if( checkVerm.isChecked() ){
            texto = texto + "Vermelho selecionado - ";
        }
        textoresultado.setText( texto );

    }

 */








    public void enviar (View view){
       radiobutton();
          //  checkbox();
    }



    public void limpar (View view){

            campoNome.setText("");
            campoEmail.setText("");
            textoresultado.setText("Resultado");

    }

}