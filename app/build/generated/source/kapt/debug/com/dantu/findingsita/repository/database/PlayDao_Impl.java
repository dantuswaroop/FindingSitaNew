package com.dantu.findingsita.repository.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class PlayDao_Impl implements PlayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPlay;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfPlay;

  public PlayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlay = new EntityInsertionAdapter<Play>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `play`(`play_id`,`score`,`game_id`,`player_id`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Play value) {
        stmt.bindLong(1, value.getPlayId());
        stmt.bindLong(2, value.getScore());
        stmt.bindLong(3, value.getGameId());
        stmt.bindLong(4, value.getPlayerId());
      }
    };
    this.__updateAdapterOfPlay = new EntityDeletionOrUpdateAdapter<Play>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `play` SET `play_id` = ?,`score` = ?,`game_id` = ?,`player_id` = ? WHERE `game_id` = ? AND `player_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Play value) {
        stmt.bindLong(1, value.getPlayId());
        stmt.bindLong(2, value.getScore());
        stmt.bindLong(3, value.getGameId());
        stmt.bindLong(4, value.getPlayerId());
        stmt.bindLong(5, value.getGameId());
        stmt.bindLong(6, value.getPlayerId());
      }
    };
  }

  @Override
  public void insertPlay(Play play) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPlay.insert(play);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertPlay(List<Play> plays) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPlay.insert(plays);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePlay(Play play) {
    __db.beginTransaction();
    try {
      __updateAdapterOfPlay.handle(play);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Play> getPlaysForGame(int gameId) {
    final String _sql = "SELECT * from play where game_id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, gameId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPlayId = _cursor.getColumnIndexOrThrow("play_id");
      final int _cursorIndexOfScore = _cursor.getColumnIndexOrThrow("score");
      final int _cursorIndexOfGameId = _cursor.getColumnIndexOrThrow("game_id");
      final int _cursorIndexOfPlayerId = _cursor.getColumnIndexOrThrow("player_id");
      final List<Play> _result = new ArrayList<Play>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Play _item;
        final int _tmpGameId;
        _tmpGameId = _cursor.getInt(_cursorIndexOfGameId);
        final int _tmpPlayerId;
        _tmpPlayerId = _cursor.getInt(_cursorIndexOfPlayerId);
        _item = new Play(_tmpGameId,_tmpPlayerId);
        final long _tmpPlayId;
        _tmpPlayId = _cursor.getLong(_cursorIndexOfPlayId);
        _item.setPlayId(_tmpPlayId);
        final int _tmpScore;
        _tmpScore = _cursor.getInt(_cursorIndexOfScore);
        _item.setScore(_tmpScore);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
