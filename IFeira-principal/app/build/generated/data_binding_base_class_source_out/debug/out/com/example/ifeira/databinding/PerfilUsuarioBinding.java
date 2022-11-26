// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
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

public final class PerfilUsuarioBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final ConstraintLayout constraintUserProf;

  @NonNull
  public final EditText editUserAddr;

  @NonNull
  public final EditText editUserCep;

  @NonNull
  public final EditText editUserDesc;

  @NonNull
  public final EditText editUserEmail;

  @NonNull
  public final EditText editUserName;

  @NonNull
  public final TextView textChangePw;

  @NonNull
  public final TextView userAddrTitle;

  @NonNull
  public final TextView userCepTtitle;

  @NonNull
  public final TextView userDescTitle;

  @NonNull
  public final TextView userEmailTitle;

  @NonNull
  public final ImageView userImage;

  @NonNull
  public final RatingBar userRating;

  @NonNull
  public final TextView userRatingText;

  private PerfilUsuarioBinding(@NonNull ScrollView rootView, @NonNull Button btnSave,
      @NonNull ConstraintLayout constraintUserProf, @NonNull EditText editUserAddr,
      @NonNull EditText editUserCep, @NonNull EditText editUserDesc,
      @NonNull EditText editUserEmail, @NonNull EditText editUserName,
      @NonNull TextView textChangePw, @NonNull TextView userAddrTitle,
      @NonNull TextView userCepTtitle, @NonNull TextView userDescTitle,
      @NonNull TextView userEmailTitle, @NonNull ImageView userImage, @NonNull RatingBar userRating,
      @NonNull TextView userRatingText) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.constraintUserProf = constraintUserProf;
    this.editUserAddr = editUserAddr;
    this.editUserCep = editUserCep;
    this.editUserDesc = editUserDesc;
    this.editUserEmail = editUserEmail;
    this.editUserName = editUserName;
    this.textChangePw = textChangePw;
    this.userAddrTitle = userAddrTitle;
    this.userCepTtitle = userCepTtitle;
    this.userDescTitle = userDescTitle;
    this.userEmailTitle = userEmailTitle;
    this.userImage = userImage;
    this.userRating = userRating;
    this.userRatingText = userRatingText;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static PerfilUsuarioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PerfilUsuarioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.perfil_usuario, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PerfilUsuarioBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSave;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.constraintUserProf;
      ConstraintLayout constraintUserProf = ViewBindings.findChildViewById(rootView, id);
      if (constraintUserProf == null) {
        break missingId;
      }

      id = R.id.editUserAddr;
      EditText editUserAddr = ViewBindings.findChildViewById(rootView, id);
      if (editUserAddr == null) {
        break missingId;
      }

      id = R.id.editUserCep;
      EditText editUserCep = ViewBindings.findChildViewById(rootView, id);
      if (editUserCep == null) {
        break missingId;
      }

      id = R.id.editUserDesc;
      EditText editUserDesc = ViewBindings.findChildViewById(rootView, id);
      if (editUserDesc == null) {
        break missingId;
      }

      id = R.id.editUserEmail;
      EditText editUserEmail = ViewBindings.findChildViewById(rootView, id);
      if (editUserEmail == null) {
        break missingId;
      }

      id = R.id.editUserName;
      EditText editUserName = ViewBindings.findChildViewById(rootView, id);
      if (editUserName == null) {
        break missingId;
      }

      id = R.id.textChangePw;
      TextView textChangePw = ViewBindings.findChildViewById(rootView, id);
      if (textChangePw == null) {
        break missingId;
      }

      id = R.id.userAddrTitle;
      TextView userAddrTitle = ViewBindings.findChildViewById(rootView, id);
      if (userAddrTitle == null) {
        break missingId;
      }

      id = R.id.userCepTtitle;
      TextView userCepTtitle = ViewBindings.findChildViewById(rootView, id);
      if (userCepTtitle == null) {
        break missingId;
      }

      id = R.id.userDescTitle;
      TextView userDescTitle = ViewBindings.findChildViewById(rootView, id);
      if (userDescTitle == null) {
        break missingId;
      }

      id = R.id.userEmailTitle;
      TextView userEmailTitle = ViewBindings.findChildViewById(rootView, id);
      if (userEmailTitle == null) {
        break missingId;
      }

      id = R.id.userImage;
      ImageView userImage = ViewBindings.findChildViewById(rootView, id);
      if (userImage == null) {
        break missingId;
      }

      id = R.id.userRating;
      RatingBar userRating = ViewBindings.findChildViewById(rootView, id);
      if (userRating == null) {
        break missingId;
      }

      id = R.id.userRatingText;
      TextView userRatingText = ViewBindings.findChildViewById(rootView, id);
      if (userRatingText == null) {
        break missingId;
      }

      return new PerfilUsuarioBinding((ScrollView) rootView, btnSave, constraintUserProf,
          editUserAddr, editUserCep, editUserDesc, editUserEmail, editUserName, textChangePw,
          userAddrTitle, userCepTtitle, userDescTitle, userEmailTitle, userImage, userRating,
          userRatingText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
