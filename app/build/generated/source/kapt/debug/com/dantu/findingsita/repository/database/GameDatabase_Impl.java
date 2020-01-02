package com.dantu.findingsita.repository.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class GameDatabase_Impl extends GameDatabase {
  private volatile GameDao _gameDao;

  private volatile PlayDao _playDao;

  private volatile PlayerDao _playerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `game` (`game_name` TEXT NOT NULL, `saved` INTEGER NOT NULL, `game_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `play` (`play_id` INTEGER NOT NULL, `score` INTEGER NOT NULL, `game_id` INTEGER NOT NULL, `player_id` INTEGER NOT NULL, PRIMARY KEY(`game_id`, `player_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `players` (`playerId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `image` BLOB, `player_name` TEXT NOT NULL, `password` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"dfb71dec6f6040f9363f5e82ea6470f3\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `game`");
        _db.execSQL("DROP TABLE IF EXISTS `play`");
        _db.execSQL("DROP TABLE IF EXISTS `players`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGame = new HashMap<String, TableInfo.Column>(3);
        _columnsGame.put("game_name", new TableInfo.Column("game_name", "TEXT", true, 0));
        _columnsGame.put("saved", new TableInfo.Column("saved", "INTEGER", true, 0));
        _columnsGame.put("game_id", new TableInfo.Column("game_id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGame = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGame = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGame = new TableInfo("game", _columnsGame, _foreignKeysGame, _indicesGame);
        final TableInfo _existingGame = TableInfo.read(_db, "game");
        if (! _infoGame.equals(_existingGame)) {
          throw new IllegalStateException("Migration didn't properly handle game(com.dantu.findingsita.repository.database.Game).\n"
                  + " Expected:\n" + _infoGame + "\n"
                  + " Found:\n" + _existingGame);
        }
        final HashMap<String, TableInfo.Column> _columnsPlay = new HashMap<String, TableInfo.Column>(4);
        _columnsPlay.put("play_id", new TableInfo.Column("play_id", "INTEGER", true, 0));
        _columnsPlay.put("score", new TableInfo.Column("score", "INTEGER", true, 0));
        _columnsPlay.put("game_id", new TableInfo.Column("game_id", "INTEGER", true, 1));
        _columnsPlay.put("player_id", new TableInfo.Column("player_id", "INTEGER", true, 2));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlay = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlay = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlay = new TableInfo("play", _columnsPlay, _foreignKeysPlay, _indicesPlay);
        final TableInfo _existingPlay = TableInfo.read(_db, "play");
        if (! _infoPlay.equals(_existingPlay)) {
          throw new IllegalStateException("Migration didn't properly handle play(com.dantu.findingsita.repository.database.Play).\n"
                  + " Expected:\n" + _infoPlay + "\n"
                  + " Found:\n" + _existingPlay);
        }
        final HashMap<String, TableInfo.Column> _columnsPlayers = new HashMap<String, TableInfo.Column>(4);
        _columnsPlayers.put("playerId", new TableInfo.Column("playerId", "INTEGER", true, 1));
        _columnsPlayers.put("image", new TableInfo.Column("image", "BLOB", false, 0));
        _columnsPlayers.put("player_name", new TableInfo.Column("player_name", "TEXT", true, 0));
        _columnsPlayers.put("password", new TableInfo.Column("password", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlayers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlayers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlayers = new TableInfo("players", _columnsPlayers, _foreignKeysPlayers, _indicesPlayers);
        final TableInfo _existingPlayers = TableInfo.read(_db, "players");
        if (! _infoPlayers.equals(_existingPlayers)) {
          throw new IllegalStateException("Migration didn't properly handle players(com.dantu.findingsita.repository.database.Player).\n"
                  + " Expected:\n" + _infoPlayers + "\n"
                  + " Found:\n" + _existingPlayers);
        }
      }
    }, "dfb71dec6f6040f9363f5e82ea6470f3", "5840b85e81059d24d2b848d55c0d8865");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "game","play","players");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `game`");
      _db.execSQL("DELETE FROM `play`");
      _db.execSQL("DELETE FROM `players`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public GameDao getGameDao() {
    if (_gameDao != null) {
      return _gameDao;
    } else {
      synchronized(this) {
        if(_gameDao == null) {
          _gameDao = new GameDao_Impl(this);
        }
        return _gameDao;
      }
    }
  }

  @Override
  public PlayDao getPlayDao() {
    if (_playDao != null) {
      return _playDao;
    } else {
      synchronized(this) {
        if(_playDao == null) {
          _playDao = new PlayDao_Impl(this);
        }
        return _playDao;
      }
    }
  }

  @Override
  public PlayerDao getPlayerDao() {
    if (_playerDao != null) {
      return _playerDao;
    } else {
      synchronized(this) {
        if(_playerDao == null) {
          _playerDao = new PlayerDao_Impl(this);
        }
        return _playerDao;
      }
    }
  }
}
