package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View tresBarras;
        View historico;
        View home;
        View carrinho;
        View Imagem_legumes_01;
        View Imagem_legumes_02;
        View Imagem_legumes_03;
        View Imagem_frutas_01;
        View Imagem_frutas_02;
        View Imagem_frutas_03;

        Imagem_frutas_01 = findViewById(R.id.Imagem_frutas_01);
        Imagem_frutas_02 = findViewById(R.id.Imagem_frutas_02);
        Imagem_frutas_03 = findViewById(R.id.Imagem_frutas_03);

        Imagem_legumes_01 = findViewById(R.id.Imagem_legumes_01);
        Imagem_legumes_02 = findViewById(R.id.Imagem_legumes_02);
        Imagem_legumes_03 = findViewById(R.id.Imagem_legumes_03);

        carrinho = findViewById(R.id.View_icone_carrinho);
        home = findViewById(R.id.View_icone_home);
        historico = findViewById(R.id.View_icone_hitorico);
        tresBarras = findViewById(R.id.View_ic_tres_linhas);

        Imagem_frutas_01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TelaProduto.class);
                startActivity(i);
            }
        });

        Imagem_frutas_02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TelaProduto.class);
                startActivity(i);
            }
        });

        Imagem_frutas_03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TelaProduto.class);
                startActivity(i);
            }
        });

        Imagem_legumes_01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TelaProduto.class);
                startActivity(i);
            }
        });

        Imagem_legumes_02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TelaProduto.class);
                startActivity(i);
            }
        });

        Imagem_legumes_03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TelaProduto.class);
                startActivity(i);
            }
        });

        historico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HistoricoDePedidos.class);
                startActivity(i);
            }
        });


        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


        carrinho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Carrinho.class);
                startActivity(i);
            }
        });

        tresBarras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MenuLateral.class);
                startActivity(i);
            }
        });
    }

}