package com.dantu.findingsita.repository.database;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unchecked")
public final class GameDao_Impl implements GameDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGame;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfGame;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfGame;

  public GameDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGame = new EntityInsertionAdapter<Game>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `game`(`game_name`,`saved`,`game_id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Game value) {
        if (value.getGameName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getGameName());
        }
        final int _tmp;
        _tmp = value.getSaved() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        stmt.bindLong(3, value.getGameId());
      }
    };
    this.__deletionAdapterOfGame = new EntityDeletionOrUpdateAdapter<Game>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `game` WHERE `game_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Game value) {
        stmt.bindLong(1, value.getGameId());
      }
    };
    this.__updateAdapterOfGame = new EntityDeletionOrUpdateAdapter<Game>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `game` SET `game_name` = ?,`saved` = ?,`game_id` = ? WHERE `game_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Game value) {
        if (value.getGameName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getGameName());
        }
        final int _tmp;
        _tmp = value.getSaved() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        stmt.bindLong(3, value.getGameId());
        stmt.bindLong(4, value.getGameId());
      }
    };
  }

  @Override
  public void createGame(Game game) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfGame.insert(game);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteGame(Game game) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfGame.handle(game);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void saveGame(Game game) {
    __db.beginTransaction();
    try {
      __updateAdapterOfGame.handle(game);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
