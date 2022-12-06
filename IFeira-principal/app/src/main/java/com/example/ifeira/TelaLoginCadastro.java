package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TelaLoginCadastro extends AppCompatActivity {
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_cadastro);
        View BotaoLogin;
        View BotaoCadastro;

        BotaoLogin = findViewById(R.id.Botao_Login);
        BotaoCadastro = findViewById(R.id.Botao_Cadastro);

        BotaoLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(TelaLoginCadastro.this, Login.class);
                startActivity(i);
            }
        });

        BotaoCadastro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(TelaLoginCadastro.this, CadastroDoUsuario.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        FirebaseUser userAtual = FirebaseAuth.getInstance().getCurrentUser();
        if(userAtual != null){
            Intent i = new Intent(TelaLoginCadastro.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }
}