package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaProduto extends AppCompatActivity {
    private TextView nomeP;
    private TextView valorP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_produto);
        View comprar;
        comprar = findViewById(R.id.Botao_comprar);
        comprar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(TelaProduto.this, TelaDePagamento.class);
                startActivity(i);
            }
        });
        nomeP = findViewById(R.id.textView);
        valorP = findViewById(R.id.textView2);




    }

}