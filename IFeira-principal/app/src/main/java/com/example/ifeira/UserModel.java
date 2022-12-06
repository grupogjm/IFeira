package com.example.ifeira;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserModel {
    private String id;
    private String nome;
    private String email;
    private String dataNasc;
    private String ddd;
    private String celular;
    private String numeroCasa;
    private String bairro;
    private String cidade;
    private String rua;



    public UserModel(){

    }

    public UserModel(String id, String nome, String email, String dataNasc, String ddd, String celular, String numeroCasa, String bairro, String cidade, String rua) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.ddd = ddd;
        this.celular = celular;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.rua = rua;
    }

    public void salvar(){
        FirebaseDatabase database;
        DatabaseReference ref;
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("usuarios");
        ref.child(getId()).setValue(this);
       //DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        //reference.child("usuarios").child(getId()).setValue(this);
    }



    //Abaixo somente get e set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
