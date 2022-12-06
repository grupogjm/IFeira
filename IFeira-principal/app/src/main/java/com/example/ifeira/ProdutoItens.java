package com.example.ifeira;

import android.widget.ImageView;
import android.widget.TextView;

public class ProdutoItens {
    private TextView nome;
    private TextView valor;
    private TextView descricao;
    private TextView nomeVendedor;
    private TextView informacaoDoVendedor;
    private TextView nomeDaEmpresa;
    private TextView quatidade;
    private TextView tipo;
    private ImageView fotoproduto;

    public ProdutoItens(ImageView fotoproduto, TextView nome, TextView valor){

    }

    public ProdutoItens(TextView nome, TextView valor, TextView descricao, TextView nomeVendedor, TextView informacaoDoVendedor, TextView nomeDaEmpresa, TextView quatidade, TextView tipo, ImageView fotoproduto) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.nomeVendedor = nomeVendedor;
        this.informacaoDoVendedor = informacaoDoVendedor;
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.quatidade = quatidade;
        this.tipo = tipo;
    }


    //para abaixo apenas get e set;

    public TextView getNome() {
        return nome;
    }

    public void setNome(TextView nome) {
        this.nome = nome;
    }

    public TextView getValor() {
        return valor;
    }

    public void setValor(TextView valor) {
        this.valor = valor;
    }

    public TextView getDescricao() {
        return descricao;
    }

    public void setDescricao(TextView descricao) {
        this.descricao = descricao;
    }

    public TextView getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(TextView nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public TextView getInformacaoDoVendedor() {
        return informacaoDoVendedor;
    }

    public void setInformacaoDoVendedor(TextView informacaoDoVendedor) {
        this.informacaoDoVendedor = informacaoDoVendedor;
    }

    public TextView getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(TextView nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public TextView getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(TextView quatidade) {
        this.quatidade = quatidade;
    }

    public TextView getTipo() {
        return tipo;
    }

    public void setTipo(TextView tipo) {
        this.tipo = tipo;
    }
}
