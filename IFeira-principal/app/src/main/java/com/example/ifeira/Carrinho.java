package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Carrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho);

        View voltar;
        View confimarPedido;
        confimarPedido = findViewById(R.id.Botao_Confirmar_pedido_carrinho);
        voltar = findViewById(R.id.Icone_voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Carrinho.this, MainActivity.class);
                startActivity(i);
            }
        });

        confimarPedido.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Carrinho.this, TelaDePagamento.class);
                startActivity(i);
            }
        });
    }
}