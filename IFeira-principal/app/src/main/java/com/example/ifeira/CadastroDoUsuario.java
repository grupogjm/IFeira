package com.example.ifeira;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

public class CadastroDoUsuario extends AppCompatActivity {
    private View button_voltar;
    private EditText edit_email;
    private EditText edit_nome;
    private EditText edit_nascimento;
    private EditText edit_tel;
    private EditText edit_ddd;
    private EditText edit_senha;
    private EditText edit_senhaComfirma;
    private Button button_cadastrar;
    private EditText edit_cidade;
    private EditText edit_numeroCasa;
    private EditText edit_bairro;
    private EditText edit_rua;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_do_usuario);
        auth = FirebaseAuth.getInstance();
        edit_rua = findViewById(R.id.Edit_Rua);
        button_voltar = findViewById(R.id.icone_voltar_cadastro);
        edit_email = findViewById(R.id.edit_e_mail);
        edit_nome = findViewById(R.id.edit_nome);
        edit_nascimento = findViewById(R.id.edit_dataDeNascimento);
        edit_tel = findViewById(R.id.edit_Celular);
        edit_ddd = findViewById(R.id.edit_DDD);
        edit_senha = findViewById(R.id.edit_Senha);
        edit_senhaComfirma = findViewById(R.id.edit_RepetirSenha);
        button_cadastrar = findViewById(R.id.Cadastrar);
        edit_cidade = findViewById(R.id.Edit_Cidade);
        edit_bairro = findViewById(R.id.Edit_Bairro);
        edit_numeroCasa = findViewById(R.id.Edit_numeroCasa);

        button_voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(CadastroDoUsuario.this, TelaLoginCadastro.class);
                startActivity(i);
            }
        });


        button_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserModel userModel = new UserModel();

                userModel.setEmail(edit_email.getText().toString());

                String loginSenha = edit_senha.getText().toString();
                String loginRepetirSenha = edit_senhaComfirma.getText().toString();
                userModel.setRua(edit_rua.getText().toString());
                userModel.setNome(edit_nome.getText().toString());
                userModel.setDataNasc(edit_nascimento.getText().toString());
                userModel.setCelular(edit_tel.getText().toString());
                userModel.setDdd(edit_ddd.getText().toString());
                userModel.setCidade(edit_cidade.getText().toString());
                userModel.setBairro(edit_bairro.getText().toString());
                userModel.setNumeroCasa(edit_numeroCasa.getText().toString());

                if(TextUtils.isEmpty(userModel.getEmail()) || TextUtils.isEmpty(loginSenha) || TextUtils.isEmpty(loginRepetirSenha) || TextUtils.isEmpty(userModel.getNome()) || TextUtils.isEmpty(userModel.getDataNasc()) || TextUtils.isEmpty(userModel.getCelular()) || TextUtils.isEmpty(userModel.getDdd()) || TextUtils.isEmpty(userModel.getCidade()) || TextUtils.isEmpty(userModel.getBairro()) || TextUtils.isEmpty(userModel.getNumeroCasa()) || TextUtils.isEmpty(userModel.getRua())){
                    Snackbar snackbar = Snackbar.make(v,"Preencha todos os campos!", Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.RED);
                    snackbar.show();
                }else{
                    if(loginSenha.equals(loginRepetirSenha)){
                        auth.createUserWithEmailAndPassword(userModel.getEmail(), loginSenha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if(task.isSuccessful()){
                                    userModel.setId(auth.getUid());
                                    userModel.salvar();
                                    Snackbar snackbar = Snackbar.make(v,"Cadastrado com Sucesso!", Snackbar.LENGTH_SHORT);
                                    snackbar.setBackgroundTint(Color.GREEN);
                                    snackbar.show();
                                    Intent i = new Intent(CadastroDoUsuario.this, Login.class);
                                    startActivity(i);
                                }
                                else{
                                    String error;
                                    try{
                                        throw task.getException();
                                    }catch (FirebaseAuthWeakPasswordException e){
                                        error = "A senha deve ter no mínimo 6 caracteres";
                                    }catch (FirebaseAuthInvalidCredentialsException e ){
                                        error = "E-mail inválido";
                                    }catch (FirebaseAuthUserCollisionException e){
                                        error = "Usuário já existe";
                                    }catch (Exception e){
                                        error = "Erro ao efetuar o cadastro";
                                        e.printStackTrace();
                                    }
                                    Toast.makeText(CadastroDoUsuario.this,error, Toast.LENGTH_SHORT).show();
                                    //String error = task.getException().getMessage();
                                    //Toast.makeText(CadastroDoUsuario.this,""+error, Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                    else{
                        Snackbar snackbar = Snackbar.make(v,"Senhas diferentes!", Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.RED);
                        snackbar.show();
                    }
                }
            }
        });


    }
}