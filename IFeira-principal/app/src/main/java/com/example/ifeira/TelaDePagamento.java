package com.example.ifeira;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TelaDePagamento extends AppCompatActivity {
    private Button comprar;
    private TextView nome;
    private TextView nome_no_endereco;
    private TextView endereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_pagamento);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference().child("usuarios").child(FirebaseAuth.getInstance().getCurrentUser().getUid());

        comprar = findViewById(R.id.Botao_confirmar_pedido);
        nome = findViewById(R.id.Nome_total_pedido);
        nome_no_endereco = findViewById(R.id.nome_no_endereco);
        endereco = findViewById(R.id.Text_endereco_de_entrega);
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                nome.setText(snapshot.child("nome").getValue(String.class));
                nome_no_endereco.setText(snapshot.child("nome").getValue(String.class));
                endereco.setText(snapshot.child("rua").getValue(String.class)+", "+snapshot.child("numeroCasa").getValue(String.class)+", "+snapshot.child("bairro").getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        comprar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"Comprar realizada!", Snackbar.LENGTH_SHORT);
                snackbar.setBackgroundTint(Color.GRAY);
                snackbar.show();
            }

        });

    }

}