// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class PerfilVendedorBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button5;

  @NonNull
  public final ConstraintLayout constraintVendorProf;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final TextView productxt;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView19;

  private PerfilVendedorBinding(@NonNull ScrollView rootView, @NonNull Button button,
      @NonNull Button button5, @NonNull ConstraintLayout constraintVendorProf,
      @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView7,
      @NonNull TextView productxt, @NonNull RatingBar ratingBar, @NonNull TextView textView11,
      @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14,
      @NonNull TextView textView16, @NonNull TextView textView19) {
    this.rootView = rootView;
    this.button = button;
    this.button5 = button5;
    this.constraintVendorProf = constraintVendorProf;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView7 = imageView7;
    this.productxt = productxt;
    this.ratingBar = ratingBar;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView16 = textView16;
    this.textView19 = textView19;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static PerfilVendedorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PerfilVendedorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.perfil_vendedor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PerfilVendedorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.constraintVendorProf;
      ConstraintLayout constraintVendorProf = ViewBindings.findChildViewById(rootView, id);
      if (constraintVendorProf == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.productxt;
      TextView productxt = ViewBindings.findChildViewById(rootView, id);
      if (productxt == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      return new PerfilVendedorBinding((ScrollView) rootView, button, button5, constraintVendorProf,
          imageView2, imageView3, imageView7, productxt, ratingBar, textView11, textView12,
          textView13, textView14, textView16, textView19);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}