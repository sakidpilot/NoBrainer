package com.example.st_nobrainerquizapp.OwnQuiz;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuizDao_Impl implements QuizDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Quiz> __insertionAdapterOfQuiz;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Quiz> __deletionAdapterOfQuiz;

  private final SharedSQLiteStatement __preparedStmtOfUpdateQuizScore;

  public QuizDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuiz = new EntityInsertionAdapter<Quiz>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `quizzes` (`id`,`title`,`questions`,`score`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Quiz entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        final String _tmp = __converters.toString(entity.getQuestions());
        if (_tmp == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, _tmp);
        }
        statement.bindLong(4, entity.getScore());
      }
    };
    this.__deletionAdapterOfQuiz = new EntityDeletionOrUpdateAdapter<Quiz>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `quizzes` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Quiz entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfUpdateQuizScore = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE quizzes SET score = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertQuiz(final Quiz quiz, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfQuiz.insert(quiz);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteQuiz(final Quiz quiz, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfQuiz.handle(quiz);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateQuizScore(final int quizId, final int score,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateQuizScore.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, score);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, quizId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateQuizScore.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Quiz>> getAllQuizzes() {
    final String _sql = "SELECT * FROM quizzes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"quizzes"}, new Callable<List<Quiz>>() {
      @Override
      @NonNull
      public List<Quiz> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfQuestions = CursorUtil.getColumnIndexOrThrow(_cursor, "questions");
          final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(_cursor, "score");
          final List<Quiz> _result = new ArrayList<Quiz>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Quiz _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final List<Question> _tmpQuestions;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfQuestions)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfQuestions);
            }
            _tmpQuestions = __converters.fromString(_tmp);
            final int _tmpScore;
            _tmpScore = _cursor.getInt(_cursorIndexOfScore);
            _item = new Quiz(_tmpId,_tmpTitle,_tmpQuestions,_tmpScore);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getQuizById(final int quizId, final Continuation<? super Quiz> $completion) {
    final String _sql = "SELECT * FROM quizzes WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, quizId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Quiz>() {
      @Override
      @Nullable
      public Quiz call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfQuestions = CursorUtil.getColumnIndexOrThrow(_cursor, "questions");
          final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(_cursor, "score");
          final Quiz _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final List<Question> _tmpQuestions;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfQuestions)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfQuestions);
            }
            _tmpQuestions = __converters.fromString(_tmp);
            final int _tmpScore;
            _tmpScore = _cursor.getInt(_cursorIndexOfScore);
            _result = new Quiz(_tmpId,_tmpTitle,_tmpQuestions,_tmpScore);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
