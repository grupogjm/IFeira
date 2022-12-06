package com.example.ifeira;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MenuLateral extends AppCompatActivity {
    private FirebaseAuth auth;
    private View sair;
    private TextView nome;

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
        auth = FirebaseAuth.getInstance();
        sair = findViewById(R.id.Layout_Sair);
        x = findViewById(R.id.Icone_x);
        hitorico = findViewById(R.id.Layout_hitorico);
        meusProdutos = findViewById(R.id.Layout_meus_produtos);
        perfilUsuario = findViewById(R.id.Layout_perfil_usuario);
        perfilVendedor = findViewById(R.id.Layout_perfil_vendedor);
        chat = findViewById(R.id.Layout_Chat);
        atualizar();
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                Intent i = new Intent(MenuLateral.this, TelaLoginCadastro.class);
                startActivity(i);
            }
        });


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
    public void atualizar(){ //pega os dados da baseDeDados;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference().child("usuarios").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                nome = findViewById(R.id.Nome_usuario);
                nome.setText(snapshot.child("nome").getValue(String.class).toUpperCase());
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