// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ifeira.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRecoveryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView IFeira;

  @NonNull
  public final View IconeVoltar;

  @NonNull
  public final TextView TextRedefinirSenha;

  @NonNull
  public final TextView TextRedefinirSenhaTitulo;

  @NonNull
  public final ToolbarBinding Toolbar;

  @NonNull
  public final View ViewContainerRecuperarsenha;

  @NonNull
  public final Button buttonSendEmail;

  @NonNull
  public final TextInputEditText inputEmail;

  private ActivityRecoveryBinding(@NonNull ConstraintLayout rootView, @NonNull TextView IFeira,
      @NonNull View IconeVoltar, @NonNull TextView TextRedefinirSenha,
      @NonNull TextView TextRedefinirSenhaTitulo, @NonNull ToolbarBinding Toolbar,
      @NonNull View ViewContainerRecuperarsenha, @NonNull Button buttonSendEmail,
      @NonNull TextInputEditText inputEmail) {
    this.rootView = rootView;
    this.IFeira = IFeira;
    this.IconeVoltar = IconeVoltar;
    this.TextRedefinirSenha = TextRedefinirSenha;
    this.TextRedefinirSenhaTitulo = TextRedefinirSenhaTitulo;
    this.Toolbar = Toolbar;
    this.ViewContainerRecuperarsenha = ViewContainerRecuperarsenha;
    this.buttonSendEmail = buttonSendEmail;
    this.inputEmail = inputEmail;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRecoveryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRecoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_recovery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRecoveryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.IFeira;
      TextView IFeira = ViewBindings.findChildViewById(rootView, id);
      if (IFeira == null) {
        break missingId;
      }

      id = R.id.Icone_voltar;
      View IconeVoltar = ViewBindings.findChildViewById(rootView, id);
      if (IconeVoltar == null) {
        break missingId;
      }

      id = R.id.Text_redefinir_senha;
      TextView TextRedefinirSenha = ViewBindings.findChildViewById(rootView, id);
      if (TextRedefinirSenha == null) {
        break missingId;
      }

      id = R.id.Text_redefinir_senha_titulo;
      TextView TextRedefinirSenhaTitulo = ViewBindings.findChildViewById(rootView, id);
      if (TextRedefinirSenhaTitulo == null) {
        break missingId;
      }

      id = R.id.Toolbar;
      View Toolbar = ViewBindings.findChildViewById(rootView, id);
      if (Toolbar == null) {
        break missingId;
      }
      ToolbarBinding binding_Toolbar = ToolbarBinding.bind(Toolbar);

      id = R.id.View_container_recuperarsenha;
      View ViewContainerRecuperarsenha = ViewBindings.findChildViewById(rootView, id);
      if (ViewContainerRecuperarsenha == null) {
        break missingId;
      }

      id = R.id.button_send_email;
      Button buttonSendEmail = ViewBindings.findChildViewById(rootView, id);
      if (buttonSendEmail == null) {
        break missingId;
      }

      id = R.id.input_email;
      TextInputEditText inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      return new ActivityRecoveryBinding((ConstraintLayout) rootView, IFeira, IconeVoltar,
          TextRedefinirSenha, TextRedefinirSenhaTitulo, binding_Toolbar,
          ViewContainerRecuperarsenha, buttonSendEmail, inputEmail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
