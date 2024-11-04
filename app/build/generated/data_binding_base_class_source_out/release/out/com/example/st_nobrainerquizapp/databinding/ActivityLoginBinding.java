// Generated by view binder compiler. Do not edit!
package com.example.st_nobrainerquizapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.st_nobrainerquizapp.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnSignIn;

  @NonNull
  public final CardView btnSignInWithGoogle;

  @NonNull
  public final EditText etSinInEmail;

  @NonNull
  public final EditText etSinInPassword;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextView tvForgotPassword;

  @NonNull
  public final TextView tvGoToRegister;

  @NonNull
  public final TextView tvQueryUser;

  @NonNull
  public final RelativeLayout viewLogin;

  private ActivityLoginBinding(@NonNull RelativeLayout rootView, @NonNull Button btnSignIn,
      @NonNull CardView btnSignInWithGoogle, @NonNull EditText etSinInEmail,
      @NonNull EditText etSinInPassword, @NonNull TextView textView2,
      @NonNull TextInputLayout tilEmail, @NonNull TextInputLayout tilPassword,
      @NonNull TextView tvForgotPassword, @NonNull TextView tvGoToRegister,
      @NonNull TextView tvQueryUser, @NonNull RelativeLayout viewLogin) {
    this.rootView = rootView;
    this.btnSignIn = btnSignIn;
    this.btnSignInWithGoogle = btnSignInWithGoogle;
    this.etSinInEmail = etSinInEmail;
    this.etSinInPassword = etSinInPassword;
    this.textView2 = textView2;
    this.tilEmail = tilEmail;
    this.tilPassword = tilPassword;
    this.tvForgotPassword = tvForgotPassword;
    this.tvGoToRegister = tvGoToRegister;
    this.tvQueryUser = tvQueryUser;
    this.viewLogin = viewLogin;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
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
      id = R.id.btnSignIn;
      Button btnSignIn = ViewBindings.findChildViewById(rootView, id);
      if (btnSignIn == null) {
        break missingId;
      }

      id = R.id.btnSignInWithGoogle;
      CardView btnSignInWithGoogle = ViewBindings.findChildViewById(rootView, id);
      if (btnSignInWithGoogle == null) {
        break missingId;
      }

      id = R.id.etSinInEmail;
      EditText etSinInEmail = ViewBindings.findChildViewById(rootView, id);
      if (etSinInEmail == null) {
        break missingId;
      }

      id = R.id.etSinInPassword;
      EditText etSinInPassword = ViewBindings.findChildViewById(rootView, id);
      if (etSinInPassword == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.tilEmail;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.tilPassword;
      TextInputLayout tilPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilPassword == null) {
        break missingId;
      }

      id = R.id.tvForgotPassword;
      TextView tvForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvForgotPassword == null) {
        break missingId;
      }

      id = R.id.tvGoToRegister;
      TextView tvGoToRegister = ViewBindings.findChildViewById(rootView, id);
      if (tvGoToRegister == null) {
        break missingId;
      }

      id = R.id.tvQueryUser;
      TextView tvQueryUser = ViewBindings.findChildViewById(rootView, id);
      if (tvQueryUser == null) {
        break missingId;
      }

      RelativeLayout viewLogin = (RelativeLayout) rootView;

      return new ActivityLoginBinding((RelativeLayout) rootView, btnSignIn, btnSignInWithGoogle,
          etSinInEmail, etSinInPassword, textView2, tilEmail, tilPassword, tvForgotPassword,
          tvGoToRegister, tvQueryUser, viewLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
