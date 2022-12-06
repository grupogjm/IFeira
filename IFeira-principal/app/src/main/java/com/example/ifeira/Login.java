package com.example.ifeira;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    private EditText edit_email;
    private EditText edit_senha;
    private Button button_entrar;
    private TextView esqueci;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edit_email = findViewById(R.id.Edit_Email_login);
        edit_senha = findViewById(R.id.Edit_Senha_login);
        auth = FirebaseAuth.getInstance();
        button_entrar = findViewById(R.id.Button_entrar);
        esqueci = findViewById(R.id.text_esqueciSenhaLogin);

        button_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserModel userModel = new UserModel();
                String loginEmail = edit_email.getText().toString();
                String loginSenha = edit_senha.getText().toString();
                if(TextUtils.isEmpty(loginEmail) || TextUtils.isEmpty(loginSenha)){
                    Snackbar snackbar = Snackbar.make(v,"Preencha todos os campos!", Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.RED);
                    snackbar.show();
                }else{
                    auth.signInWithEmailAndPassword(loginEmail,loginSenha)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        Intent i = new Intent(Login.this, MainActivity.class);
                                        startActivity(i);
                                    }
                                    else{
                                        String error = task.getException().getMessage();
                                        Toast.makeText(Login.this,""+error, Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });

        esqueci.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Recovery.class);
                startActivity(i);
            }
        });
    }
}