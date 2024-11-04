// Generated by view binder compiler. Do not edit!
package com.example.st_nobrainerquizapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.st_nobrainerquizapp.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ScoreDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button finishBtn;

  @NonNull
  public final CircularProgressIndicator scoreProgressIndicator;

  @NonNull
  public final TextView scoreProgressText;

  @NonNull
  public final TextView scoreSubtitle;

  @NonNull
  public final TextView scoreTitle;

  private ScoreDialogBinding(@NonNull LinearLayout rootView, @NonNull Button finishBtn,
      @NonNull CircularProgressIndicator scoreProgressIndicator,
      @NonNull TextView scoreProgressText, @NonNull TextView scoreSubtitle,
      @NonNull TextView scoreTitle) {
    this.rootView = rootView;
    this.finishBtn = finishBtn;
    this.scoreProgressIndicator = scoreProgressIndicator;
    this.scoreProgressText = scoreProgressText;
    this.scoreSubtitle = scoreSubtitle;
    this.scoreTitle = scoreTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScoreDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScoreDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.score_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScoreDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.finish_btn;
      Button finishBtn = ViewBindings.findChildViewById(rootView, id);
      if (finishBtn == null) {
        break missingId;
      }

      id = R.id.score_progress_indicator;
      CircularProgressIndicator scoreProgressIndicator = ViewBindings.findChildViewById(rootView, id);
      if (scoreProgressIndicator == null) {
        break missingId;
      }

      id = R.id.score_progress_text;
      TextView scoreProgressText = ViewBindings.findChildViewById(rootView, id);
      if (scoreProgressText == null) {
        break missingId;
      }

      id = R.id.score_subtitle;
      TextView scoreSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (scoreSubtitle == null) {
        break missingId;
      }

      id = R.id.score_title;
      TextView scoreTitle = ViewBindings.findChildViewById(rootView, id);
      if (scoreTitle == null) {
        break missingId;
      }

      return new ScoreDialogBinding((LinearLayout) rootView, finishBtn, scoreProgressIndicator,
          scoreProgressText, scoreSubtitle, scoreTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
