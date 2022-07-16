package com.curso.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.curso.recyclerview.R;
import com.curso.recyclerview.RecyclerItemClickListener;
import com.curso.recyclerview.adapter.Adapter;
import com.curso.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Lista de Filmes
        this.criarFilmes();


        //Configurar Adapterr
        Adapter adapter = new Adapter(listaFilmes);


        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //evento de click
        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Filme filme = listaFilmes.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                    "Item pressionado: " + filme.getTitulo(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Filme filme = listaFilmes.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                     "Ano do Filme: " + filme.getAno(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        }
                    }


            )
        );

    }

    public void criarFilmes (){

        Filme filme = new Filme("Homem Aranha - De volta ao Lar", "Ficção", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha", "Ficção", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Liga da Justiça", "Ficção", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Dr Estranho No Multiverso da Loucura", "Ficção", "2022");
        this.listaFilmes.add(filme);

        filme = new Filme("Jumanji", "Aventura", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Transformers", "Ficção", "2007");
        this.listaFilmes.add(filme);

        filme = new Filme("Interestelar", "Ficção Cíentifica", "2014");
        this.listaFilmes.add(filme);

        filme = new Filme("Para Todos os Garotos Que Já Amei", "Romance", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Uncharted - Fora do Mapa", "Ação", "2022");
        this.listaFilmes.add(filme);

        filme = new Filme("Jurassic World - Um Reino Ameaçado", "Ação", "2018");
        this.listaFilmes.add(filme);

    }

}