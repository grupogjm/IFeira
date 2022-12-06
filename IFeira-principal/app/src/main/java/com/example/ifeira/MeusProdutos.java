package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MeusProdutos extends AppCompatActivity {
    private View meusProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_produtos);

        meusProdutos = findViewById(R.id.Layout_cadastrarProduto);
        meusProdutos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MeusProdutos.this, CadastrarProdutos.class);
                startActivity(i);
            }
        });

        View voltar;

        voltar = findViewById(R.id.Icone_voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MeusProdutos.this, MenuLateral.class);
                startActivity(i);
            }
        });
    }
}