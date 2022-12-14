// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ifeira.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMeusProdutosBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final EditText EditPesquisa;

  @NonNull
  public final View IconeVoltar;

  @NonNull
  public final ImageView ImagemProduto1;

  @NonNull
  public final ImageView ImagemProduto2;

  @NonNull
  public final ImageView ImagemProduto3;

  @NonNull
  public final ConstraintLayout LayoutCadastrarProduto;

  @NonNull
  public final ConstraintLayout LayoutProduto01;

  @NonNull
  public final ConstraintLayout LayoutProduto02;

  @NonNull
  public final ConstraintLayout LayoutProduto03;

  @NonNull
  public final ConstraintLayout LayoutToobar;

  @NonNull
  public final View LinhaBaixo1;

  @NonNull
  public final View LinhaBaixo2;

  @NonNull
  public final View LinhaBaixo3;

  @NonNull
  public final View LinhaCima1;

  @NonNull
  public final View LinhaCima2;

  @NonNull
  public final View LinhaCima3;

  @NonNull
  public final View Seta;

  @NonNull
  public final TextView TextDescricaoProduto1;

  @NonNull
  public final TextView TextDescricaoProduto2;

  @NonNull
  public final TextView TextDescricaoProduto3;

  @NonNull
  public final TextView TextNomeProduto1;

  @NonNull
  public final TextView TextNomeProduto2;

  @NonNull
  public final TextView TextNomeProduto3;

  @NonNull
  public final TextView TextQuantidadeDeProdutos;

  @NonNull
  public final TextView TextStatusProdutos1;

  @NonNull
  public final TextView TextStatusProdutos2;

  @NonNull
  public final TextView TextStatusProdutos3;

  @NonNull
  public final TextView TextValorProduto1;

  @NonNull
  public final TextView TextValorProduto2;

  @NonNull
  public final TextView TextValorProduto3;

  @NonNull
  public final TextView TipoProduto;

  @NonNull
  public final TextView TipoProduto2;

  @NonNull
  public final TextView TipoProduto3;

  @NonNull
  public final ToolbarBinding Toolbar;

  private ActivityMeusProdutosBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull EditText EditPesquisa, @NonNull View IconeVoltar, @NonNull ImageView ImagemProduto1,
      @NonNull ImageView ImagemProduto2, @NonNull ImageView ImagemProduto3,
      @NonNull ConstraintLayout LayoutCadastrarProduto, @NonNull ConstraintLayout LayoutProduto01,
      @NonNull ConstraintLayout LayoutProduto02, @NonNull ConstraintLayout LayoutProduto03,
      @NonNull ConstraintLayout LayoutToobar, @NonNull View LinhaBaixo1, @NonNull View LinhaBaixo2,
      @NonNull View LinhaBaixo3, @NonNull View LinhaCima1, @NonNull View LinhaCima2,
      @NonNull View LinhaCima3, @NonNull View Seta, @NonNull TextView TextDescricaoProduto1,
      @NonNull TextView TextDescricaoProduto2, @NonNull TextView TextDescricaoProduto3,
      @NonNull TextView TextNomeProduto1, @NonNull TextView TextNomeProduto2,
      @NonNull TextView TextNomeProduto3, @NonNull TextView TextQuantidadeDeProdutos,
      @NonNull TextView TextStatusProdutos1, @NonNull TextView TextStatusProdutos2,
      @NonNull TextView TextStatusProdutos3, @NonNull TextView TextValorProduto1,
      @NonNull TextView TextValorProduto2, @NonNull TextView TextValorProduto3,
      @NonNull TextView TipoProduto, @NonNull TextView TipoProduto2, @NonNull TextView TipoProduto3,
      @NonNull ToolbarBinding Toolbar) {
    this.rootView = rootView;
    this.EditPesquisa = EditPesquisa;
    this.IconeVoltar = IconeVoltar;
    this.ImagemProduto1 = ImagemProduto1;
    this.ImagemProduto2 = ImagemProduto2;
    this.ImagemProduto3 = ImagemProduto3;
    this.LayoutCadastrarProduto = LayoutCadastrarProduto;
    this.LayoutProduto01 = LayoutProduto01;
    this.LayoutProduto02 = LayoutProduto02;
    this.LayoutProduto03 = LayoutProduto03;
    this.LayoutToobar = LayoutToobar;
    this.LinhaBaixo1 = LinhaBaixo1;
    this.LinhaBaixo2 = LinhaBaixo2;
    this.LinhaBaixo3 = LinhaBaixo3;
    this.LinhaCima1 = LinhaCima1;
    this.LinhaCima2 = LinhaCima2;
    this.LinhaCima3 = LinhaCima3;
    this.Seta = Seta;
    this.TextDescricaoProduto1 = TextDescricaoProduto1;
    this.TextDescricaoProduto2 = TextDescricaoProduto2;
    this.TextDescricaoProduto3 = TextDescricaoProduto3;
    this.TextNomeProduto1 = TextNomeProduto1;
    this.TextNomeProduto2 = TextNomeProduto2;
    this.TextNomeProduto3 = TextNomeProduto3;
    this.TextQuantidadeDeProdutos = TextQuantidadeDeProdutos;
    this.TextStatusProdutos1 = TextStatusProdutos1;
    this.TextStatusProdutos2 = TextStatusProdutos2;
    this.TextStatusProdutos3 = TextStatusProdutos3;
    this.TextValorProduto1 = TextValorProduto1;
    this.TextValorProduto2 = TextValorProduto2;
    this.TextValorProduto3 = TextValorProduto3;
    this.TipoProduto = TipoProduto;
    this.TipoProduto2 = TipoProduto2;
    this.TipoProduto3 = TipoProduto3;
    this.Toolbar = Toolbar;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMeusProdutosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMeusProdutosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_meus_produtos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMeusProdutosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Edit_pesquisa;
      EditText EditPesquisa = ViewBindings.findChildViewById(rootView, id);
      if (EditPesquisa == null) {
        break missingId;
      }

      id = R.id.Icone_voltar;
      View IconeVoltar = ViewBindings.findChildViewById(rootView, id);
      if (IconeVoltar == null) {
        break missingId;
      }

      id = R.id.Imagem_produto1;
      ImageView ImagemProduto1 = ViewBindings.findChildViewById(rootView, id);
      if (ImagemProduto1 == null) {
        break missingId;
      }

      id = R.id.Imagem_produto2;
      ImageView ImagemProduto2 = ViewBindings.findChildViewById(rootView, id);
      if (ImagemProduto2 == null) {
        break missingId;
      }

      id = R.id.Imagem_produto3;
      ImageView ImagemProduto3 = ViewBindings.findChildViewById(rootView, id);
      if (ImagemProduto3 == null) {
        break missingId;
      }

      id = R.id.Layout_cadastrarProduto;
      ConstraintLayout LayoutCadastrarProduto = ViewBindings.findChildViewById(rootView, id);
      if (LayoutCadastrarProduto == null) {
        break missingId;
      }

      id = R.id.LayoutProduto01;
      ConstraintLayout LayoutProduto01 = ViewBindings.findChildViewById(rootView, id);
      if (LayoutProduto01 == null) {
        break missingId;
      }

      id = R.id.LayoutProduto02;
      ConstraintLayout LayoutProduto02 = ViewBindings.findChildViewById(rootView, id);
      if (LayoutProduto02 == null) {
        break missingId;
      }

      id = R.id.LayoutProduto03;
      ConstraintLayout LayoutProduto03 = ViewBindings.findChildViewById(rootView, id);
      if (LayoutProduto03 == null) {
        break missingId;
      }

      id = R.id.LayoutToobar;
      ConstraintLayout LayoutToobar = ViewBindings.findChildViewById(rootView, id);
      if (LayoutToobar == null) {
        break missingId;
      }

      id = R.id.Linha_baixo1;
      View LinhaBaixo1 = ViewBindings.findChildViewById(rootView, id);
      if (LinhaBaixo1 == null) {
        break missingId;
      }

      id = R.id.Linha_baixo2;
      View LinhaBaixo2 = ViewBindings.findChildViewById(rootView, id);
      if (LinhaBaixo2 == null) {
        break missingId;
      }

      id = R.id.Linha_baixo3;
      View LinhaBaixo3 = ViewBindings.findChildViewById(rootView, id);
      if (LinhaBaixo3 == null) {
        break missingId;
      }

      id = R.id.Linha_cima1;
      View LinhaCima1 = ViewBindings.findChildViewById(rootView, id);
      if (LinhaCima1 == null) {
        break missingId;
      }

      id = R.id.Linha_cima2;
      View LinhaCima2 = ViewBindings.findChildViewById(rootView, id);
      if (LinhaCima2 == null) {
        break missingId;
      }

      id = R.id.Linha_cima3;
      View LinhaCima3 = ViewBindings.findChildViewById(rootView, id);
      if (LinhaCima3 == null) {
        break missingId;
      }

      id = R.id.Seta;
      View Seta = ViewBindings.findChildViewById(rootView, id);
      if (Seta == null) {
        break missingId;
      }

      id = R.id.Text_descricao_produto1;
      TextView TextDescricaoProduto1 = ViewBindings.findChildViewById(rootView, id);
      if (TextDescricaoProduto1 == null) {
        break missingId;
      }

      id = R.id.Text_descricao_produto2;
      TextView TextDescricaoProduto2 = ViewBindings.findChildViewById(rootView, id);
      if (TextDescricaoProduto2 == null) {
        break missingId;
      }

      id = R.id.Text_descricao_produto3;
      TextView TextDescricaoProduto3 = ViewBindings.findChildViewById(rootView, id);
      if (TextDescricaoProduto3 == null) {
        break missingId;
      }

      id = R.id.Text_nome_produto1;
      TextView TextNomeProduto1 = ViewBindings.findChildViewById(rootView, id);
      if (TextNomeProduto1 == null) {
        break missingId;
      }

      id = R.id.Text_nome_produto2;
      TextView TextNomeProduto2 = ViewBindings.findChildViewById(rootView, id);
      if (TextNomeProduto2 == null) {
        break missingId;
      }

      id = R.id.Text_nome_produto3;
      TextView TextNomeProduto3 = ViewBindings.findChildViewById(rootView, id);
      if (TextNomeProduto3 == null) {
        break missingId;
      }

      id = R.id.Text_quantidade_de_produtos;
      TextView TextQuantidadeDeProdutos = ViewBindings.findChildViewById(rootView, id);
      if (TextQuantidadeDeProdutos == null) {
        break missingId;
      }

      id = R.id.Text_status_produtos1;
      TextView TextStatusProdutos1 = ViewBindings.findChildViewById(rootView, id);
      if (TextStatusProdutos1 == null) {
        break missingId;
      }

      id = R.id.Text_status_produtos2;
      TextView TextStatusProdutos2 = ViewBindings.findChildViewById(rootView, id);
      if (TextStatusProdutos2 == null) {
        break missingId;
      }

      id = R.id.Text_status_produtos3;
      TextView TextStatusProdutos3 = ViewBindings.findChildViewById(rootView, id);
      if (TextStatusProdutos3 == null) {
        break missingId;
      }

      id = R.id.Text_valor_produto1;
      TextView TextValorProduto1 = ViewBindings.findChildViewById(rootView, id);
      if (TextValorProduto1 == null) {
        break missingId;
      }

      id = R.id.Text_valor_produto2;
      TextView TextValorProduto2 = ViewBindings.findChildViewById(rootView, id);
      if (TextValorProduto2 == null) {
        break missingId;
      }

      id = R.id.Text_valor_produto3;
      TextView TextValorProduto3 = ViewBindings.findChildViewById(rootView, id);
      if (TextValorProduto3 == null) {
        break missingId;
      }

      id = R.id.Tipo_produto;
      TextView TipoProduto = ViewBindings.findChildViewById(rootView, id);
      if (TipoProduto == null) {
        break missingId;
      }

      id = R.id.Tipo_produto2;
      TextView TipoProduto2 = ViewBindings.findChildViewById(rootView, id);
      if (TipoProduto2 == null) {
        break missingId;
      }

      id = R.id.Tipo_produto3;
      TextView TipoProduto3 = ViewBindings.findChildViewById(rootView, id);
      if (TipoProduto3 == null) {
        break missingId;
      }

      id = R.id.Toolbar;
      View Toolbar = ViewBindings.findChildViewById(rootView, id);
      if (Toolbar == null) {
        break missingId;
      }
      ToolbarBinding binding_Toolbar = ToolbarBinding.bind(Toolbar);

      return new ActivityMeusProdutosBinding((LinearLayoutCompat) rootView, EditPesquisa,
          IconeVoltar, ImagemProduto1, ImagemProduto2, ImagemProduto3, LayoutCadastrarProduto,
          LayoutProduto01, LayoutProduto02, LayoutProduto03, LayoutToobar, LinhaBaixo1, LinhaBaixo2,
          LinhaBaixo3, LinhaCima1, LinhaCima2, LinhaCima3, Seta, TextDescricaoProduto1,
          TextDescricaoProduto2, TextDescricaoProduto3, TextNomeProduto1, TextNomeProduto2,
          TextNomeProduto3, TextQuantidadeDeProdutos, TextStatusProdutos1, TextStatusProdutos2,
          TextStatusProdutos3, TextValorProduto1, TextValorProduto2, TextValorProduto3, TipoProduto,
          TipoProduto2, TipoProduto3, binding_Toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
