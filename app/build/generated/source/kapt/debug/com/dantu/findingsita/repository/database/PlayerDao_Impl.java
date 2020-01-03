package com.dantu.findingsita.repository.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class PlayerDao_Impl implements PlayerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPlayer;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfPlayer;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfPlayer;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllPlayers;

  public PlayerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlayer = new EntityInsertionAdapter<Player>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `players`(`playerId`,`image`,`player_name`,`password`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Player value) {
        stmt.bindLong(1, value.getPlayerId());
        if (value.getImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindBlob(2, value.getImage());
        }
        if (value.getPlayerName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPlayerName());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPassword());
        }
      }
    };
    this.__deletionAdapterOfPlayer = new EntityDeletionOrUpdateAdapter<Player>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `players` WHERE `playerId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Player value) {
        stmt.bindLong(1, value.getPlayerId());
      }
    };
    this.__updateAdapterOfPlayer = new EntityDeletionOrUpdateAdapter<Player>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `players` SET `playerId` = ?,`image` = ?,`player_name` = ?,`password` = ? WHERE `playerId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Player value) {
        stmt.bindLong(1, value.getPlayerId());
        if (value.getImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindBlob(2, value.getImage());
        }
        if (value.getPlayerName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPlayerName());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPassword());
        }
        stmt.bindLong(5, value.getPlayerId());
      }
    };
    this.__preparedStmtOfDeleteAllPlayers = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM players";
        return _query;
      }
    };
  }

  @Override
  public void insert(Player player) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPlayer.insert(player);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Player player) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfPlayer.handle(player);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Player player) {
    __db.beginTransaction();
    try {
      __updateAdapterOfPlayer.handle(player);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllPlayers() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllPlayers.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllPlayers.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Player>> getPlayers() {
    final String _sql = "SELECT * FROM players";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Player>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Player> compute() {
        if (_observer == null) {
          _observer = new Observer("players") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfPlayerId = _cursor.getColumnIndexOrThrow("playerId");
          final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
          final int _cursorIndexOfPlayerName = _cursor.getColumnIndexOrThrow("player_name");
          final int _cursorIndexOfPassword = _cursor.getColumnIndexOrThrow("password");
          final List<Player> _result = new ArrayList<Player>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Player _item;
            final String _tmpPlayerName;
            _tmpPlayerName = _cursor.getString(_cursorIndexOfPlayerName);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            _item = new Player(_tmpPlayerName,_tmpPassword);
            final int _tmpPlayerId;
            _tmpPlayerId = _cursor.getInt(_cursorIndexOfPlayerId);
            _item.setPlayerId(_tmpPlayerId);
            final byte[] _tmpImage;
            _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
            _item.setImage(_tmpImage);
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
    }.getLiveData();
  }

  @Override
  public Player getPlayerById(int playerId) {
    final String _sql = "SELECT * FROM players WHERE playerId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playerId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPlayerId = _cursor.getColumnIndexOrThrow("playerId");
      final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
      final int _cursorIndexOfPlayerName = _cursor.getColumnIndexOrThrow("player_name");
      final int _cursorIndexOfPassword = _cursor.getColumnIndexOrThrow("password");
      final Player _result;
      if(_cursor.moveToFirst()) {
        final String _tmpPlayerName;
        _tmpPlayerName = _cursor.getString(_cursorIndexOfPlayerName);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        _result = new Player(_tmpPlayerName,_tmpPassword);
        final int _tmpPlayerId;
        _tmpPlayerId = _cursor.getInt(_cursorIndexOfPlayerId);
        _result.setPlayerId(_tmpPlayerId);
        final byte[] _tmpImage;
        _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        _result.setImage(_tmpImage);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
