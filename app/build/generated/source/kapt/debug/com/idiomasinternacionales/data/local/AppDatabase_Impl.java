package com.idiomasinternacionales.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao;
import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao_Impl;
import com.idiomasinternacionales.data.local.dao.UsuarioDao;
import com.idiomasinternacionales.data.local.dao.UsuarioDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile UsuarioDao _usuarioDao;

  private volatile RutaAprendizajeDao _rutaAprendizajeDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `usuarios` (`id` TEXT NOT NULL, `nombre` TEXT NOT NULL, `email` TEXT NOT NULL, `idiomaMeta` TEXT NOT NULL, `nivel` TEXT NOT NULL, `progreso` TEXT NOT NULL, `preferencias` TEXT NOT NULL, `estadisticas` TEXT NOT NULL, `notificaciones` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `rutas_aprendizaje` (`id` TEXT NOT NULL, `nombre` TEXT NOT NULL, `adaptadaPorIA` INTEGER NOT NULL, `fechaCreacion` INTEGER NOT NULL, `fechaUltimaActualizacion` INTEGER NOT NULL, `feedbackUsuario` TEXT, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c537b5b273a07274484328cc13ea8999')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `usuarios`");
        db.execSQL("DROP TABLE IF EXISTS `rutas_aprendizaje`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsUsuarios = new HashMap<String, TableInfo.Column>(9);
        _columnsUsuarios.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("nombre", new TableInfo.Column("nombre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("idiomaMeta", new TableInfo.Column("idiomaMeta", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("nivel", new TableInfo.Column("nivel", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("progreso", new TableInfo.Column("progreso", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("preferencias", new TableInfo.Column("preferencias", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("estadisticas", new TableInfo.Column("estadisticas", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsuarios.put("notificaciones", new TableInfo.Column("notificaciones", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsuarios = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsuarios = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUsuarios = new TableInfo("usuarios", _columnsUsuarios, _foreignKeysUsuarios, _indicesUsuarios);
        final TableInfo _existingUsuarios = TableInfo.read(db, "usuarios");
        if (!_infoUsuarios.equals(_existingUsuarios)) {
          return new RoomOpenHelper.ValidationResult(false, "usuarios(com.idiomasinternacionales.data.local.entities.UsuarioEntity).\n"
                  + " Expected:\n" + _infoUsuarios + "\n"
                  + " Found:\n" + _existingUsuarios);
        }
        final HashMap<String, TableInfo.Column> _columnsRutasAprendizaje = new HashMap<String, TableInfo.Column>(6);
        _columnsRutasAprendizaje.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutasAprendizaje.put("nombre", new TableInfo.Column("nombre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutasAprendizaje.put("adaptadaPorIA", new TableInfo.Column("adaptadaPorIA", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutasAprendizaje.put("fechaCreacion", new TableInfo.Column("fechaCreacion", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutasAprendizaje.put("fechaUltimaActualizacion", new TableInfo.Column("fechaUltimaActualizacion", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRutasAprendizaje.put("feedbackUsuario", new TableInfo.Column("feedbackUsuario", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRutasAprendizaje = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRutasAprendizaje = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRutasAprendizaje = new TableInfo("rutas_aprendizaje", _columnsRutasAprendizaje, _foreignKeysRutasAprendizaje, _indicesRutasAprendizaje);
        final TableInfo _existingRutasAprendizaje = TableInfo.read(db, "rutas_aprendizaje");
        if (!_infoRutasAprendizaje.equals(_existingRutasAprendizaje)) {
          return new RoomOpenHelper.ValidationResult(false, "rutas_aprendizaje(com.idiomasinternacionales.data.local.entities.RutaAprendizajeEntity).\n"
                  + " Expected:\n" + _infoRutasAprendizaje + "\n"
                  + " Found:\n" + _existingRutasAprendizaje);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c537b5b273a07274484328cc13ea8999", "6a4c77d805dea9bd8356b438281a4de3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "usuarios","rutas_aprendizaje");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `usuarios`");
      _db.execSQL("DELETE FROM `rutas_aprendizaje`");
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
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UsuarioDao.class, UsuarioDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RutaAprendizajeDao.class, RutaAprendizajeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public UsuarioDao usuarioDao() {
    if (_usuarioDao != null) {
      return _usuarioDao;
    } else {
      synchronized(this) {
        if(_usuarioDao == null) {
          _usuarioDao = new UsuarioDao_Impl(this);
        }
        return _usuarioDao;
      }
    }
  }

  @Override
  public RutaAprendizajeDao rutaAprendizajeDao() {
    if (_rutaAprendizajeDao != null) {
      return _rutaAprendizajeDao;
    } else {
      synchronized(this) {
        if(_rutaAprendizajeDao == null) {
          _rutaAprendizajeDao = new RutaAprendizajeDao_Impl(this);
        }
        return _rutaAprendizajeDao;
      }
    }
  }
}
