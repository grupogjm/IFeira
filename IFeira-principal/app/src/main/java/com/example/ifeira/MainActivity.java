package com.example.ifeira;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private TextView endereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atualizar();

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
        View Seta_endereco;
        View Seta_ver_todos_legumes;
        View Seta_ver_todos_frutas;
        Seta_ver_todos_frutas = findViewById(R.id.Seta_ver_todos_frutas);
        Seta_ver_todos_legumes = findViewById(R.id.Seta_ver_todos_legumes);

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

        Seta_ver_todos_frutas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TodasFrutas.class);
                startActivity(i);
            }
        });

        Seta_ver_todos_legumes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TodosLegumes.class);
                startActivity(i);
            }
        });


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



    public void atualizar(){ //pega os dados da baseDeDados;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference().child("usuarios").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                endereco = findViewById(R.id.Endereco);
                endereco.setText(snapshot.child("rua").getValue(String.class)+", "+snapshot.child("numeroCasa").getValue(String.class)+", "+snapshot.child("bairro").getValue(String.class));
               /* email = snapshot.child("email").getValue(String.class);
                bairro = snapshot.child("bairro").getValue(String.class);
                cidade = snapshot.child("cidade").getValue(String.class);
                dataNasc = snapshot.child("dataNasc").getValue(String.class);
                ddd = snapshot.child("ddd").getValue(String.class);
                numeroCasa = snapshot.child("numeroCasa").getValue(String.class);
                celular = snapshot.child("celular").getValue(String.class);*/
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

}