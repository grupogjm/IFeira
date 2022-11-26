// Generated by view binder compiler. Do not edit!
package com.example.ifeira.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

public final class ActivityHistoricoDePedidosBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout ConteinerLayout01;

  @NonNull
  public final LinearLayout ConteinerLayout02;

  @NonNull
  public final TextView Data01;

  @NonNull
  public final TextView Data02;

  @NonNull
  public final TextView Hora01;

  @NonNull
  public final TextView Hora02;

  @NonNull
  public final View IconeParaVoltar;

  @NonNull
  public final TextView Item12;

  @NonNull
  public final TextView L1Item1;

  @NonNull
  public final TextView L1Item2;

  @NonNull
  public final TextView L1Item3;

  @NonNull
  public final LinearLayout L1Total;

  @NonNull
  public final TextView L1Total1;

  @NonNull
  public final TextView L1Totalvalor1;

  @NonNull
  public final TextView L1Valor1;

  @NonNull
  public final TextView L1Valor2;

  @NonNull
  public final TextView L1Valor3;

  @NonNull
  public final TextView L2Item1;

  @NonNull
  public final TextView L2Item3;

  @NonNull
  public final LinearLayout L2Total;

  @NonNull
  public final TextView L2Total2;

  @NonNull
  public final TextView L2Totalvalor2;

  @NonNull
  public final TextView L2Valor1;

  @NonNull
  public final TextView L2Valor3;

  @NonNull
  public final LinearLayout Linear1Item1;

  @NonNull
  public final LinearLayout Linear1Item2;

  @NonNull
  public final LinearLayout Linear1Item3;

  @NonNull
  public final LinearLayout Linear2Item1;

  @NonNull
  public final LinearLayout Linear2Item2;

  @NonNull
  public final LinearLayout Linear2Item3;

  @NonNull
  public final LinearLayout LinearDataHora1;

  @NonNull
  public final LinearLayout LinearDataHora2;

  @NonNull
  public final TextView TextChat;

  @NonNull
  public final ToolbarBinding Toolbar;

  @NonNull
  public final TextView valor12;

  private ActivityHistoricoDePedidosBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout ConteinerLayout01, @NonNull LinearLayout ConteinerLayout02,
      @NonNull TextView Data01, @NonNull TextView Data02, @NonNull TextView Hora01,
      @NonNull TextView Hora02, @NonNull View IconeParaVoltar, @NonNull TextView Item12,
      @NonNull TextView L1Item1, @NonNull TextView L1Item2, @NonNull TextView L1Item3,
      @NonNull LinearLayout L1Total, @NonNull TextView L1Total1, @NonNull TextView L1Totalvalor1,
      @NonNull TextView L1Valor1, @NonNull TextView L1Valor2, @NonNull TextView L1Valor3,
      @NonNull TextView L2Item1, @NonNull TextView L2Item3, @NonNull LinearLayout L2Total,
      @NonNull TextView L2Total2, @NonNull TextView L2Totalvalor2, @NonNull TextView L2Valor1,
      @NonNull TextView L2Valor3, @NonNull LinearLayout Linear1Item1,
      @NonNull LinearLayout Linear1Item2, @NonNull LinearLayout Linear1Item3,
      @NonNull LinearLayout Linear2Item1, @NonNull LinearLayout Linear2Item2,
      @NonNull LinearLayout Linear2Item3, @NonNull LinearLayout LinearDataHora1,
      @NonNull LinearLayout LinearDataHora2, @NonNull TextView TextChat,
      @NonNull ToolbarBinding Toolbar, @NonNull TextView valor12) {
    this.rootView = rootView;
    this.ConteinerLayout01 = ConteinerLayout01;
    this.ConteinerLayout02 = ConteinerLayout02;
    this.Data01 = Data01;
    this.Data02 = Data02;
    this.Hora01 = Hora01;
    this.Hora02 = Hora02;
    this.IconeParaVoltar = IconeParaVoltar;
    this.Item12 = Item12;
    this.L1Item1 = L1Item1;
    this.L1Item2 = L1Item2;
    this.L1Item3 = L1Item3;
    this.L1Total = L1Total;
    this.L1Total1 = L1Total1;
    this.L1Totalvalor1 = L1Totalvalor1;
    this.L1Valor1 = L1Valor1;
    this.L1Valor2 = L1Valor2;
    this.L1Valor3 = L1Valor3;
    this.L2Item1 = L2Item1;
    this.L2Item3 = L2Item3;
    this.L2Total = L2Total;
    this.L2Total2 = L2Total2;
    this.L2Totalvalor2 = L2Totalvalor2;
    this.L2Valor1 = L2Valor1;
    this.L2Valor3 = L2Valor3;
    this.Linear1Item1 = Linear1Item1;
    this.Linear1Item2 = Linear1Item2;
    this.Linear1Item3 = Linear1Item3;
    this.Linear2Item1 = Linear2Item1;
    this.Linear2Item2 = Linear2Item2;
    this.Linear2Item3 = Linear2Item3;
    this.LinearDataHora1 = LinearDataHora1;
    this.LinearDataHora2 = LinearDataHora2;
    this.TextChat = TextChat;
    this.Toolbar = Toolbar;
    this.valor12 = valor12;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHistoricoDePedidosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHistoricoDePedidosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_historico_de_pedidos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHistoricoDePedidosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ConteinerLayout01;
      LinearLayout ConteinerLayout01 = ViewBindings.findChildViewById(rootView, id);
      if (ConteinerLayout01 == null) {
        break missingId;
      }

      id = R.id.ConteinerLayout02;
      LinearLayout ConteinerLayout02 = ViewBindings.findChildViewById(rootView, id);
      if (ConteinerLayout02 == null) {
        break missingId;
      }

      id = R.id.Data01;
      TextView Data01 = ViewBindings.findChildViewById(rootView, id);
      if (Data01 == null) {
        break missingId;
      }

      id = R.id.Data02;
      TextView Data02 = ViewBindings.findChildViewById(rootView, id);
      if (Data02 == null) {
        break missingId;
      }

      id = R.id.Hora01;
      TextView Hora01 = ViewBindings.findChildViewById(rootView, id);
      if (Hora01 == null) {
        break missingId;
      }

      id = R.id.Hora02;
      TextView Hora02 = ViewBindings.findChildViewById(rootView, id);
      if (Hora02 == null) {
        break missingId;
      }

      id = R.id.Icone_para_voltar;
      View IconeParaVoltar = ViewBindings.findChildViewById(rootView, id);
      if (IconeParaVoltar == null) {
        break missingId;
      }

      id = R.id.Item12;
      TextView Item12 = ViewBindings.findChildViewById(rootView, id);
      if (Item12 == null) {
        break missingId;
      }

      id = R.id.L1_item1;
      TextView L1Item1 = ViewBindings.findChildViewById(rootView, id);
      if (L1Item1 == null) {
        break missingId;
      }

      id = R.id.L1_item2;
      TextView L1Item2 = ViewBindings.findChildViewById(rootView, id);
      if (L1Item2 == null) {
        break missingId;
      }

      id = R.id.L1_item3;
      TextView L1Item3 = ViewBindings.findChildViewById(rootView, id);
      if (L1Item3 == null) {
        break missingId;
      }

      id = R.id.L1_total;
      LinearLayout L1Total = ViewBindings.findChildViewById(rootView, id);
      if (L1Total == null) {
        break missingId;
      }

      id = R.id.L1_total1;
      TextView L1Total1 = ViewBindings.findChildViewById(rootView, id);
      if (L1Total1 == null) {
        break missingId;
      }

      id = R.id.L1_totalvalor1;
      TextView L1Totalvalor1 = ViewBindings.findChildViewById(rootView, id);
      if (L1Totalvalor1 == null) {
        break missingId;
      }

      id = R.id.L1_valor1;
      TextView L1Valor1 = ViewBindings.findChildViewById(rootView, id);
      if (L1Valor1 == null) {
        break missingId;
      }

      id = R.id.L1_valor2;
      TextView L1Valor2 = ViewBindings.findChildViewById(rootView, id);
      if (L1Valor2 == null) {
        break missingId;
      }

      id = R.id.L1_valor3;
      TextView L1Valor3 = ViewBindings.findChildViewById(rootView, id);
      if (L1Valor3 == null) {
        break missingId;
      }

      id = R.id.L2_item1;
      TextView L2Item1 = ViewBindings.findChildViewById(rootView, id);
      if (L2Item1 == null) {
        break missingId;
      }

      id = R.id.L2_item3;
      TextView L2Item3 = ViewBindings.findChildViewById(rootView, id);
      if (L2Item3 == null) {
        break missingId;
      }

      id = R.id.L2_total;
      LinearLayout L2Total = ViewBindings.findChildViewById(rootView, id);
      if (L2Total == null) {
        break missingId;
      }

      id = R.id.L2_total2;
      TextView L2Total2 = ViewBindings.findChildViewById(rootView, id);
      if (L2Total2 == null) {
        break missingId;
      }

      id = R.id.L2_totalvalor2;
      TextView L2Totalvalor2 = ViewBindings.findChildViewById(rootView, id);
      if (L2Totalvalor2 == null) {
        break missingId;
      }

      id = R.id.L2_valor1;
      TextView L2Valor1 = ViewBindings.findChildViewById(rootView, id);
      if (L2Valor1 == null) {
        break missingId;
      }

      id = R.id.L2_valor3;
      TextView L2Valor3 = ViewBindings.findChildViewById(rootView, id);
      if (L2Valor3 == null) {
        break missingId;
      }

      id = R.id.Linear1Item1;
      LinearLayout Linear1Item1 = ViewBindings.findChildViewById(rootView, id);
      if (Linear1Item1 == null) {
        break missingId;
      }

      id = R.id.Linear1Item2;
      LinearLayout Linear1Item2 = ViewBindings.findChildViewById(rootView, id);
      if (Linear1Item2 == null) {
        break missingId;
      }

      id = R.id.Linear1Item3;
      LinearLayout Linear1Item3 = ViewBindings.findChildViewById(rootView, id);
      if (Linear1Item3 == null) {
        break missingId;
      }

      id = R.id.Linear2Item1;
      LinearLayout Linear2Item1 = ViewBindings.findChildViewById(rootView, id);
      if (Linear2Item1 == null) {
        break missingId;
      }

      id = R.id.Linear2Item2;
      LinearLayout Linear2Item2 = ViewBindings.findChildViewById(rootView, id);
      if (Linear2Item2 == null) {
        break missingId;
      }

      id = R.id.Linear2Item3;
      LinearLayout Linear2Item3 = ViewBindings.findChildViewById(rootView, id);
      if (Linear2Item3 == null) {
        break missingId;
      }

      id = R.id.LinearDataHora1;
      LinearLayout LinearDataHora1 = ViewBindings.findChildViewById(rootView, id);
      if (LinearDataHora1 == null) {
        break missingId;
      }

      id = R.id.LinearDataHora2;
      LinearLayout LinearDataHora2 = ViewBindings.findChildViewById(rootView, id);
      if (LinearDataHora2 == null) {
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

      id = R.id.valor12;
      TextView valor12 = ViewBindings.findChildViewById(rootView, id);
      if (valor12 == null) {
        break missingId;
      }

      return new ActivityHistoricoDePedidosBinding((ConstraintLayout) rootView, ConteinerLayout01,
          ConteinerLayout02, Data01, Data02, Hora01, Hora02, IconeParaVoltar, Item12, L1Item1,
          L1Item2, L1Item3, L1Total, L1Total1, L1Totalvalor1, L1Valor1, L1Valor2, L1Valor3, L2Item1,
          L2Item3, L2Total, L2Total2, L2Totalvalor2, L2Valor1, L2Valor3, Linear1Item1, Linear1Item2,
          Linear1Item3, Linear2Item1, Linear2Item2, Linear2Item3, LinearDataHora1, LinearDataHora2,
          TextChat, binding_Toolbar, valor12);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
