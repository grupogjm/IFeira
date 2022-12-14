// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ifeira.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CarrinhoBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button BotaoConfirmarPedidoCarrinho;

  @NonNull
  public final View IconeVoltar;

  @NonNull
  public final TextView TextChat;

  @NonNull
  public final ToolbarBinding Toolbar;

  @NonNull
  public final ConstraintLayout constraintCart;

  @NonNull
  public final ImageView imageProduct;

  @NonNull
  public final ImageView imageProduct1;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView textView24;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  private CarrinhoBinding(@NonNull ScrollView rootView,
      @NonNull Button BotaoConfirmarPedidoCarrinho, @NonNull View IconeVoltar,
      @NonNull TextView TextChat, @NonNull ToolbarBinding Toolbar,
      @NonNull ConstraintLayout constraintCart, @NonNull ImageView imageProduct,
      @NonNull ImageView imageProduct1, @NonNull TextView textView10, @NonNull TextView textView15,
      @NonNull TextView textView17, @NonNull TextView textView18, @NonNull TextView textView21,
      @NonNull TextView textView22, @NonNull TextView textView23, @NonNull TextView textView24,
      @NonNull TextView textView25, @NonNull TextView textView26) {
    this.rootView = rootView;
    this.BotaoConfirmarPedidoCarrinho = BotaoConfirmarPedidoCarrinho;
    this.IconeVoltar = IconeVoltar;
    this.TextChat = TextChat;
    this.Toolbar = Toolbar;
    this.constraintCart = constraintCart;
    this.imageProduct = imageProduct;
    this.imageProduct1 = imageProduct1;
    this.textView10 = textView10;
    this.textView15 = textView15;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.textView21 = textView21;
    this.textView22 = textView22;
    this.textView23 = textView23;
    this.textView24 = textView24;
    this.textView25 = textView25;
    this.textView26 = textView26;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static CarrinhoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CarrinhoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.carrinho, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CarrinhoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Botao_Confirmar_pedido_carrinho;
      Button BotaoConfirmarPedidoCarrinho = ViewBindings.findChildViewById(rootView, id);
      if (BotaoConfirmarPedidoCarrinho == null) {
        break missingId;
      }

      id = R.id.Icone_voltar;
      View IconeVoltar = ViewBindings.findChildViewById(rootView, id);
      if (IconeVoltar == null) {
        break missingId;
      }

      id = R.id.Text_chat;
      TextView TextChat = ViewBindings.findChildViewById(rootView, id);
      if (TextChat == null) {
        break missingId;
      }

      id = R.id.Toolbar;
      View Toolbar = ViewBindings.findChildViewById(rootView, id);
      if (Toolbar == null) {
        break missingId;
      }
      ToolbarBinding binding_Toolbar = ToolbarBinding.bind(Toolbar);

      id = R.id.constraintCart;
      ConstraintLayout constraintCart = ViewBindings.findChildViewById(rootView, id);
      if (constraintCart == null) {
        break missingId;
      }

      id = R.id.imageProduct;
      ImageView imageProduct = ViewBindings.findChildViewById(rootView, id);
      if (imageProduct == null) {
        break missingId;
      }

      id = R.id.imageProduct1;
      ImageView imageProduct1 = ViewBindings.findChildViewById(rootView, id);
      if (imageProduct1 == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.textView24;
      TextView textView24 = ViewBindings.findChildViewById(rootView, id);
      if (textView24 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      return new CarrinhoBinding((ScrollView) rootView, BotaoConfirmarPedidoCarrinho, IconeVoltar,
          TextChat, binding_Toolbar, constraintCart, imageProduct, imageProduct1, textView10,
          textView15, textView17, textView18, textView21, textView22, textView23, textView24,
          textView25, textView26);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
