package com.example.ifeira;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class CadastrarProdutos extends AppCompatActivity {
    private View voltar;
    private Button button_foto;
    private Button button_enviar;
    private EditText nomeProduto;
    private EditText tipoProduto;
    private EditText valorProduto;
    private EditText descricao;
    private Uri fotoSelecionada;
    private ImageView imagemViewFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_produtos);

        voltar = findViewById(R.id.Icone_voltar);
        button_foto = findViewById(R.id.Button_foto);
        button_enviar = findViewById(R.id.Button_enviar);
        nomeProduto = findViewById(R.id.Edit_nomeProduto);
        tipoProduto = findViewById(R.id.Edit_TipoProduto);
        valorProduto = findViewById(R.id.Edit_ValorProduto);
        descricao = findViewById(R.id.Edit_descricao);
        imagemViewFoto = findViewById(R.id.ImagemView_foto);



        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(CadastrarProdutos.this, MeusProdutos.class);
                startActivity(i);
            }
        });


        button_foto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                selecionarFoto();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 0){
            fotoSelecionada = data.getData();
            Bitmap bitmap = null;
            try{
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), fotoSelecionada);
                imagemViewFoto.setImageDrawable(new BitmapDrawable(bitmap));
                button_foto.setAlpha(0);
            }catch (IOException e){

            }
        }
    }

    private void selecionarFoto(){
        Intent i = new Intent(Intent.ACTION_PICK);
        i.setType("image/*");
        startActivityForResult(i, 0);
    }
}