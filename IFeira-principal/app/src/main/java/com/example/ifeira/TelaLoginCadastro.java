package com.example.ifeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaLoginCadastro extends AppCompatActivity {

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
}