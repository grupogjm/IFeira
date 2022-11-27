// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button ButtonEntrar;

  @NonNull
  public final EditText EditEmail;

  @NonNull
  public final EditText EditSenha;

  @NonNull
  public final TextView IFeira;

  @NonNull
  public final View ViewContainer;

  @NonNull
  public final TextView textEsqueciSenhaLogin;

  @NonNull
  public final TextView welcome;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button ButtonEntrar,
      @NonNull EditText EditEmail, @NonNull EditText EditSenha, @NonNull TextView IFeira,
      @NonNull View ViewContainer, @NonNull TextView textEsqueciSenhaLogin,
      @NonNull TextView welcome) {
    this.rootView = rootView;
    this.ButtonEntrar = ButtonEntrar;
    this.EditEmail = EditEmail;
    this.EditSenha = EditSenha;
    this.IFeira = IFeira;
    this.ViewContainer = ViewContainer;
    this.textEsqueciSenhaLogin = textEsqueciSenhaLogin;
    this.welcome = welcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Button_entrar;
      Button ButtonEntrar = ViewBindings.findChildViewById(rootView, id);
      if (ButtonEntrar == null) {
        break missingId;
      }

      id = R.id.Edit_Email;
      EditText EditEmail = ViewBindings.findChildViewById(rootView, id);
      if (EditEmail == null) {
        break missingId;
      }

      id = R.id.Edit_Senha;
      EditText EditSenha = ViewBindings.findChildViewById(rootView, id);
      if (EditSenha == null) {
        break missingId;
      }

      id = R.id.IFeira;
      TextView IFeira = ViewBindings.findChildViewById(rootView, id);
      if (IFeira == null) {
        break missingId;
      }

      id = R.id.View_container;
      View ViewContainer = ViewBindings.findChildViewById(rootView, id);
      if (ViewContainer == null) {
        break missingId;
      }

      id = R.id.text_esqueciSenhaLogin;
      TextView textEsqueciSenhaLogin = ViewBindings.findChildViewById(rootView, id);
      if (textEsqueciSenhaLogin == null) {
        break missingId;
      }

      id = R.id.welcome;
      TextView welcome = ViewBindings.findChildViewById(rootView, id);
      if (welcome == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, ButtonEntrar, EditEmail,
          EditSenha, IFeira, ViewContainer, textEsqueciSenhaLogin, welcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}