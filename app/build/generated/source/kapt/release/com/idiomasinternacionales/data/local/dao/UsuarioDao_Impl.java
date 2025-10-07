package com.idiomasinternacionales.data.local.dao;

import android.database.Cursor;
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
import com.idiomasinternacionales.data.local.Converters;
import com.idiomasinternacionales.data.local.entities.UsuarioEntity;
import com.idiomasinternacionales.model.Estadisticas;
import com.idiomasinternacionales.model.Nivel;
import com.idiomasinternacionales.model.Notificacion;
import com.idiomasinternacionales.model.Preferencias;
import com.idiomasinternacionales.model.Progreso;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class UsuarioDao_Impl implements UsuarioDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UsuarioEntity> __insertionAdapterOfUsuarioEntity;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<UsuarioEntity> __updateAdapterOfUsuarioEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllUsuarios;

  public UsuarioDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUsuarioEntity = new EntityInsertionAdapter<UsuarioEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `usuarios` (`id`,`nombre`,`email`,`idiomaMeta`,`nivel`,`progreso`,`preferencias`,`estadisticas`,`notificaciones`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UsuarioEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getNombre() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNombre());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEmail());
        }
        if (entity.getIdiomaMeta() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getIdiomaMeta());
        }
        statement.bindString(5, __Nivel_enumToString(entity.getNivel()));
        final String _tmp = __converters.fromProgreso(entity.getProgreso());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        final String _tmp_1 = __converters.fromPreferencias(entity.getPreferencias());
        if (_tmp_1 == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, _tmp_1);
        }
        final String _tmp_2 = __converters.fromEstadisticas(entity.getEstadisticas());
        if (_tmp_2 == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, _tmp_2);
        }
        final String _tmp_3 = __converters.fromNotificacionList(entity.getNotificaciones());
        if (_tmp_3 == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp_3);
        }
      }
    };
    this.__updateAdapterOfUsuarioEntity = new EntityDeletionOrUpdateAdapter<UsuarioEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `usuarios` SET `id` = ?,`nombre` = ?,`email` = ?,`idiomaMeta` = ?,`nivel` = ?,`progreso` = ?,`preferencias` = ?,`estadisticas` = ?,`notificaciones` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UsuarioEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getNombre() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNombre());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEmail());
        }
        if (entity.getIdiomaMeta() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getIdiomaMeta());
        }
        statement.bindString(5, __Nivel_enumToString(entity.getNivel()));
        final String _tmp = __converters.fromProgreso(entity.getProgreso());
        if (_tmp == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp);
        }
        final String _tmp_1 = __converters.fromPreferencias(entity.getPreferencias());
        if (_tmp_1 == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, _tmp_1);
        }
        final String _tmp_2 = __converters.fromEstadisticas(entity.getEstadisticas());
        if (_tmp_2 == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, _tmp_2);
        }
        final String _tmp_3 = __converters.fromNotificacionList(entity.getNotificaciones());
        if (_tmp_3 == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp_3);
        }
        if (entity.getId() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllUsuarios = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM usuarios";
        return _query;
      }
    };
  }

  @Override
  public Object insertUsuario(final UsuarioEntity usuario,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUsuarioEntity.insert(usuario);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateUsuario(final UsuarioEntity usuario,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUsuarioEntity.handle(usuario);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllUsuarios(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllUsuarios.acquire();
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
          __preparedStmtOfDeleteAllUsuarios.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<UsuarioEntity> getUsuarioById(final String id) {
    final String _sql = "SELECT * FROM usuarios WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"usuarios"}, new Callable<UsuarioEntity>() {
      @Override
      @Nullable
      public UsuarioEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfIdiomaMeta = CursorUtil.getColumnIndexOrThrow(_cursor, "idiomaMeta");
          final int _cursorIndexOfNivel = CursorUtil.getColumnIndexOrThrow(_cursor, "nivel");
          final int _cursorIndexOfProgreso = CursorUtil.getColumnIndexOrThrow(_cursor, "progreso");
          final int _cursorIndexOfPreferencias = CursorUtil.getColumnIndexOrThrow(_cursor, "preferencias");
          final int _cursorIndexOfEstadisticas = CursorUtil.getColumnIndexOrThrow(_cursor, "estadisticas");
          final int _cursorIndexOfNotificaciones = CursorUtil.getColumnIndexOrThrow(_cursor, "notificaciones");
          final UsuarioEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpIdiomaMeta;
            if (_cursor.isNull(_cursorIndexOfIdiomaMeta)) {
              _tmpIdiomaMeta = null;
            } else {
              _tmpIdiomaMeta = _cursor.getString(_cursorIndexOfIdiomaMeta);
            }
            final Nivel _tmpNivel;
            _tmpNivel = __Nivel_stringToEnum(_cursor.getString(_cursorIndexOfNivel));
            final Progreso _tmpProgreso;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfProgreso)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfProgreso);
            }
            _tmpProgreso = __converters.toProgreso(_tmp);
            final Preferencias _tmpPreferencias;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfPreferencias)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfPreferencias);
            }
            _tmpPreferencias = __converters.toPreferencias(_tmp_1);
            final Estadisticas _tmpEstadisticas;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfEstadisticas)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfEstadisticas);
            }
            _tmpEstadisticas = __converters.toEstadisticas(_tmp_2);
            final List<Notificacion> _tmpNotificaciones;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfNotificaciones)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfNotificaciones);
            }
            _tmpNotificaciones = __converters.toNotificacionList(_tmp_3);
            _result = new UsuarioEntity(_tmpId,_tmpNombre,_tmpEmail,_tmpIdiomaMeta,_tmpNivel,_tmpProgreso,_tmpPreferencias,_tmpEstadisticas,_tmpNotificaciones);
          } else {
            _result = null;
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __Nivel_enumToString(@NonNull final Nivel _value) {
    switch (_value) {
      case A1: return "A1";
      case A2: return "A2";
      case B1: return "B1";
      case B2: return "B2";
      case C1: return "C1";
      case C2: return "C2";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private Nivel __Nivel_stringToEnum(@NonNull final String _value) {
    switch (_value) {
      case "A1": return Nivel.A1;
      case "A2": return Nivel.A2;
      case "B1": return Nivel.B1;
      case "B2": return Nivel.B2;
      case "C1": return Nivel.C1;
      case "C2": return Nivel.C2;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
