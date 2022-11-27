// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class ActivitySobreDetalhesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView direcao;

  @NonNull
  public final TextView endereco;

  @NonNull
  public final TextView enderecoLabel;

  @NonNull
  public final ImageView lojaImage;

  @NonNull
  public final TextView nomeLoja;

  @NonNull
  public final TextView regiaoLoja;

  private ActivitySobreDetalhesBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView direcao, @NonNull TextView endereco, @NonNull TextView enderecoLabel,
      @NonNull ImageView lojaImage, @NonNull TextView nomeLoja, @NonNull TextView regiaoLoja) {
    this.rootView = rootView;
    this.direcao = direcao;
    this.endereco = endereco;
    this.enderecoLabel = enderecoLabel;
    this.lojaImage = lojaImage;
    this.nomeLoja = nomeLoja;
    this.regiaoLoja = regiaoLoja;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySobreDetalhesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySobreDetalhesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sobre_detalhes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySobreDetalhesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.direcao;
      TextView direcao = ViewBindings.findChildViewById(rootView, id);
      if (direcao == null) {
        break missingId;
      }

      id = R.id.endereco;
      TextView endereco = ViewBindings.findChildViewById(rootView, id);
      if (endereco == null) {
        break missingId;
      }

      id = R.id.enderecoLabel;
      TextView enderecoLabel = ViewBindings.findChildViewById(rootView, id);
      if (enderecoLabel == null) {
        break missingId;
      }

      id = R.id.lojaImage;
      ImageView lojaImage = ViewBindings.findChildViewById(rootView, id);
      if (lojaImage == null) {
        break missingId;
      }

      id = R.id.nomeLoja;
      TextView nomeLoja = ViewBindings.findChildViewById(rootView, id);
      if (nomeLoja == null) {
        break missingId;
      }

      id = R.id.regiaoLoja;
      TextView regiaoLoja = ViewBindings.findChildViewById(rootView, id);
      if (regiaoLoja == null) {
        break missingId;
      }

      return new ActivitySobreDetalhesBinding((ConstraintLayout) rootView, direcao, endereco,
          enderecoLabel, lojaImage, nomeLoja, regiaoLoja);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
