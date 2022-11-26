package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaDeConversas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_conversas);
        View voltar;
        voltar = findViewById(R.id.Icone_voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(TelaDeConversas.this, MenuLateral.class);
                startActivity(i);
            }
        });
    }
}