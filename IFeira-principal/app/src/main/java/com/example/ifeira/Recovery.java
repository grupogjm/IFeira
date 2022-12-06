package com.example.ifeira;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;

public class Recovery extends AppCompatActivity {
    private EditText editEmail;
    private Button redefinir;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
        auth = FirebaseAuth.getInstance();
        editEmail = findViewById(R.id.input_email);
        redefinir = findViewById(R.id.button_send_email);


        redefinir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String email = editEmail.getText().toString();
                if(TextUtils.isEmpty(email)){
                    Snackbar snackbar = Snackbar.make(v,"Preencha o campo E-mail", Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.RED);
                    snackbar.show();
                }
                else{
                    auth.sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void Void) {
                            Toast.makeText(getBaseContext(),"E-mail de redefinição de senha enviado com sucesso!", Toast.LENGTH_LONG).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            String error = e.toString();
                            if(error.contains("INVALID_EMAIL")){
                                Toast.makeText(getBaseContext(),"E-mail inválido", Toast.LENGTH_LONG).show();
                            }else{
                                if(error.contains("EMAIL_NOT_FOUND")){
                                    Toast.makeText(getBaseContext(),"E-mail não cadastrado", Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(getBaseContext(),"Erro ao enviar e-mail", Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    });
                }
            }
        });

        View voltar;
        voltar = findViewById(R.id.Icone_voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Recovery.this, Login.class);
                startActivity(i);
            }
        });
    }
}