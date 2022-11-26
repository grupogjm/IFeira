package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuLateral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lateral);
        View x;
        View hitorico;
        View meusProdutos;
        View perfilUsuario;
        View perfilVendedor;
        View chat;

        x = findViewById(R.id.Icone_x);
        hitorico = findViewById(R.id.Layout_hitorico);
        meusProdutos = findViewById(R.id.Layout_meus_produtos);
        perfilUsuario = findViewById(R.id.Layout_perfil_usuario);
        perfilVendedor = findViewById(R.id.Layout_perfil_vendedor);
        chat = findViewById(R.id.Layout_Chat);


        x.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MenuLateral.this, MainActivity.class);
                startActivity(i);
            }
        });

        hitorico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MenuLateral.this, HistoricoDePedidos.class);
                startActivity(i);
            }
        });

        meusProdutos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MenuLateral.this, MeusProdutos.class);
                startActivity(i);
            }
        });

        perfilUsuario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MenuLateral.this, PerfilUsuario.class);
                startActivity(i);
            }
        });

        perfilVendedor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MenuLateral.this, PerfilVendedor.class);
                startActivity(i);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MenuLateral.this, TelaDeConversas.class);
                startActivity(i);
            }
        });
    }
}