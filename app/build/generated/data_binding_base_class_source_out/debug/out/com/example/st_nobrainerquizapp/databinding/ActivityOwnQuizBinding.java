// Generated by view binder compiler. Do not edit!
package com.example.st_nobrainerquizapp.databinding;

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
import com.example.st_nobrainerquizapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOwnQuizBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonNextQuestion;

  @NonNull
  public final Button buttonSave;

  @NonNull
  public final TextInputEditText editCorrectAnswer;

  @NonNull
  public final TextInputEditText editOption1;

  @NonNull
  public final TextInputEditText editOption2;

  @NonNull
  public final TextInputEditText editOption3;

  @NonNull
  public final TextInputEditText editOption4;

  @NonNull
  public final TextInputEditText editQuestion;

  @NonNull
  public final TextInputLayout editQuestion1;

  @NonNull
  public final TextInputEditText editQuizTitle;

  @NonNull
  public final TextInputLayout editQuizTitle1;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView tvCreateQuizTitle;

  @NonNull
  public final TextInputLayout txtHint;

  @NonNull
  public final TextInputLayout txtOption1;

  @NonNull
  public final TextInputLayout txtOption2;

  @NonNull
  public final TextInputLayout txtOption3;

  @NonNull
  public final TextInputLayout txtOption4;

  private ActivityOwnQuizBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonNextQuestion, @NonNull Button buttonSave,
      @NonNull TextInputEditText editCorrectAnswer, @NonNull TextInputEditText editOption1,
      @NonNull TextInputEditText editOption2, @NonNull TextInputEditText editOption3,
      @NonNull TextInputEditText editOption4, @NonNull TextInputEditText editQuestion,
      @NonNull TextInputLayout editQuestion1, @NonNull TextInputEditText editQuizTitle,
      @NonNull TextInputLayout editQuizTitle1, @NonNull ConstraintLayout main,
      @NonNull TextView tvCreateQuizTitle, @NonNull TextInputLayout txtHint,
      @NonNull TextInputLayout txtOption1, @NonNull TextInputLayout txtOption2,
      @NonNull TextInputLayout txtOption3, @NonNull TextInputLayout txtOption4) {
    this.rootView = rootView;
    this.buttonNextQuestion = buttonNextQuestion;
    this.buttonSave = buttonSave;
    this.editCorrectAnswer = editCorrectAnswer;
    this.editOption1 = editOption1;
    this.editOption2 = editOption2;
    this.editOption3 = editOption3;
    this.editOption4 = editOption4;
    this.editQuestion = editQuestion;
    this.editQuestion1 = editQuestion1;
    this.editQuizTitle = editQuizTitle;
    this.editQuizTitle1 = editQuizTitle1;
    this.main = main;
    this.tvCreateQuizTitle = tvCreateQuizTitle;
    this.txtHint = txtHint;
    this.txtOption1 = txtOption1;
    this.txtOption2 = txtOption2;
    this.txtOption3 = txtOption3;
    this.txtOption4 = txtOption4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOwnQuizBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOwnQuizBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_own_quiz, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOwnQuizBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_next_question;
      Button buttonNextQuestion = ViewBindings.findChildViewById(rootView, id);
      if (buttonNextQuestion == null) {
        break missingId;
      }

      id = R.id.button_save;
      Button buttonSave = ViewBindings.findChildViewById(rootView, id);
      if (buttonSave == null) {
        break missingId;
      }

      id = R.id.edit_correct_answer;
      TextInputEditText editCorrectAnswer = ViewBindings.findChildViewById(rootView, id);
      if (editCorrectAnswer == null) {
        break missingId;
      }

      id = R.id.edit_option1;
      TextInputEditText editOption1 = ViewBindings.findChildViewById(rootView, id);
      if (editOption1 == null) {
        break missingId;
      }

      id = R.id.edit_option2;
      TextInputEditText editOption2 = ViewBindings.findChildViewById(rootView, id);
      if (editOption2 == null) {
        break missingId;
      }

      id = R.id.edit_option3;
      TextInputEditText editOption3 = ViewBindings.findChildViewById(rootView, id);
      if (editOption3 == null) {
        break missingId;
      }

      id = R.id.edit_option4;
      TextInputEditText editOption4 = ViewBindings.findChildViewById(rootView, id);
      if (editOption4 == null) {
        break missingId;
      }

      id = R.id.edit_question;
      TextInputEditText editQuestion = ViewBindings.findChildViewById(rootView, id);
      if (editQuestion == null) {
        break missingId;
      }

      id = R.id.edit_question1;
      TextInputLayout editQuestion1 = ViewBindings.findChildViewById(rootView, id);
      if (editQuestion1 == null) {
        break missingId;
      }

      id = R.id.edit_quiz_title;
      TextInputEditText editQuizTitle = ViewBindings.findChildViewById(rootView, id);
      if (editQuizTitle == null) {
        break missingId;
      }

      id = R.id.edit_quiz_title1;
      TextInputLayout editQuizTitle1 = ViewBindings.findChildViewById(rootView, id);
      if (editQuizTitle1 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.tv_create_quiz_title;
      TextView tvCreateQuizTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvCreateQuizTitle == null) {
        break missingId;
      }

      id = R.id.txtHint;
      TextInputLayout txtHint = ViewBindings.findChildViewById(rootView, id);
      if (txtHint == null) {
        break missingId;
      }

      id = R.id.txtOption1;
      TextInputLayout txtOption1 = ViewBindings.findChildViewById(rootView, id);
      if (txtOption1 == null) {
        break missingId;
      }

      id = R.id.txtOption2;
      TextInputLayout txtOption2 = ViewBindings.findChildViewById(rootView, id);
      if (txtOption2 == null) {
        break missingId;
      }

      id = R.id.txtOption3;
      TextInputLayout txtOption3 = ViewBindings.findChildViewById(rootView, id);
      if (txtOption3 == null) {
        break missingId;
      }

      id = R.id.txtOption4;
      TextInputLayout txtOption4 = ViewBindings.findChildViewById(rootView, id);
      if (txtOption4 == null) {
        break missingId;
      }

      return new ActivityOwnQuizBinding((ConstraintLayout) rootView, buttonNextQuestion, buttonSave,
          editCorrectAnswer, editOption1, editOption2, editOption3, editOption4, editQuestion,
          editQuestion1, editQuizTitle, editQuizTitle1, main, tvCreateQuizTitle, txtHint,
          txtOption1, txtOption2, txtOption3, txtOption4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}