package com.idiomasinternacionales.data.local.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.idiomasinternacionales.data.local.entities.RutaAprendizajeEntity;
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
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RutaAprendizajeDao_Impl implements RutaAprendizajeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RutaAprendizajeEntity> __insertionAdapterOfRutaAprendizajeEntity;

  private final EntityDeletionOrUpdateAdapter<RutaAprendizajeEntity> __updateAdapterOfRutaAprendizajeEntity;

  public RutaAprendizajeDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRutaAprendizajeEntity = new EntityInsertionAdapter<RutaAprendizajeEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `rutas_aprendizaje` (`id`,`nombre`,`adaptadaPorIA`,`fechaCreacion`,`fechaUltimaActualizacion`,`feedbackUsuario`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RutaAprendizajeEntity entity) {
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
        final int _tmp = entity.getAdaptadaPorIA() ? 1 : 0;
        statement.bindLong(3, _tmp);
        statement.bindLong(4, entity.getFechaCreacion());
        statement.bindLong(5, entity.getFechaUltimaActualizacion());
        if (entity.getFeedbackUsuario() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getFeedbackUsuario());
        }
      }
    };
    this.__updateAdapterOfRutaAprendizajeEntity = new EntityDeletionOrUpdateAdapter<RutaAprendizajeEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `rutas_aprendizaje` SET `id` = ?,`nombre` = ?,`adaptadaPorIA` = ?,`fechaCreacion` = ?,`fechaUltimaActualizacion` = ?,`feedbackUsuario` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RutaAprendizajeEntity entity) {
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
        final int _tmp = entity.getAdaptadaPorIA() ? 1 : 0;
        statement.bindLong(3, _tmp);
        statement.bindLong(4, entity.getFechaCreacion());
        statement.bindLong(5, entity.getFechaUltimaActualizacion());
        if (entity.getFeedbackUsuario() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getFeedbackUsuario());
        }
        if (entity.getId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getId());
        }
      }
    };
  }

  @Override
  public Object insertRutaAprendizaje(final RutaAprendizajeEntity ruta,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRutaAprendizajeEntity.insert(ruta);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateRutaAprendizaje(final RutaAprendizajeEntity ruta,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRutaAprendizajeEntity.handle(ruta);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<RutaAprendizajeEntity> getRutaAprendizajeById(final String rutaId) {
    final String _sql = "SELECT * FROM rutas_aprendizaje WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (rutaId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, rutaId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"rutas_aprendizaje"}, new Callable<RutaAprendizajeEntity>() {
      @Override
      @Nullable
      public RutaAprendizajeEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
          final int _cursorIndexOfAdaptadaPorIA = CursorUtil.getColumnIndexOrThrow(_cursor, "adaptadaPorIA");
          final int _cursorIndexOfFechaCreacion = CursorUtil.getColumnIndexOrThrow(_cursor, "fechaCreacion");
          final int _cursorIndexOfFechaUltimaActualizacion = CursorUtil.getColumnIndexOrThrow(_cursor, "fechaUltimaActualizacion");
          final int _cursorIndexOfFeedbackUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "feedbackUsuario");
          final RutaAprendizajeEntity _result;
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
            final boolean _tmpAdaptadaPorIA;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdaptadaPorIA);
            _tmpAdaptadaPorIA = _tmp != 0;
            final long _tmpFechaCreacion;
            _tmpFechaCreacion = _cursor.getLong(_cursorIndexOfFechaCreacion);
            final long _tmpFechaUltimaActualizacion;
            _tmpFechaUltimaActualizacion = _cursor.getLong(_cursorIndexOfFechaUltimaActualizacion);
            final String _tmpFeedbackUsuario;
            if (_cursor.isNull(_cursorIndexOfFeedbackUsuario)) {
              _tmpFeedbackUsuario = null;
            } else {
              _tmpFeedbackUsuario = _cursor.getString(_cursorIndexOfFeedbackUsuario);
            }
            _result = new RutaAprendizajeEntity(_tmpId,_tmpNombre,_tmpAdaptadaPorIA,_tmpFechaCreacion,_tmpFechaUltimaActualizacion,_tmpFeedbackUsuario);
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

  @Override
  public Flow<List<RutaAprendizajeEntity>> getAllRutasAprendizaje() {
    final String _sql = "SELECT * FROM rutas_aprendizaje";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"rutas_aprendizaje"}, new Callable<List<RutaAprendizajeEntity>>() {
      @Override
      @NonNull
      public List<RutaAprendizajeEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
          final int _cursorIndexOfAdaptadaPorIA = CursorUtil.getColumnIndexOrThrow(_cursor, "adaptadaPorIA");
          final int _cursorIndexOfFechaCreacion = CursorUtil.getColumnIndexOrThrow(_cursor, "fechaCreacion");
          final int _cursorIndexOfFechaUltimaActualizacion = CursorUtil.getColumnIndexOrThrow(_cursor, "fechaUltimaActualizacion");
          final int _cursorIndexOfFeedbackUsuario = CursorUtil.getColumnIndexOrThrow(_cursor, "feedbackUsuario");
          final List<RutaAprendizajeEntity> _result = new ArrayList<RutaAprendizajeEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final RutaAprendizajeEntity _item;
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
            final boolean _tmpAdaptadaPorIA;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdaptadaPorIA);
            _tmpAdaptadaPorIA = _tmp != 0;
            final long _tmpFechaCreacion;
            _tmpFechaCreacion = _cursor.getLong(_cursorIndexOfFechaCreacion);
            final long _tmpFechaUltimaActualizacion;
            _tmpFechaUltimaActualizacion = _cursor.getLong(_cursorIndexOfFechaUltimaActualizacion);
            final String _tmpFeedbackUsuario;
            if (_cursor.isNull(_cursorIndexOfFeedbackUsuario)) {
              _tmpFeedbackUsuario = null;
            } else {
              _tmpFeedbackUsuario = _cursor.getString(_cursorIndexOfFeedbackUsuario);
            }
            _item = new RutaAprendizajeEntity(_tmpId,_tmpNombre,_tmpAdaptadaPorIA,_tmpFechaCreacion,_tmpFechaUltimaActualizacion,_tmpFeedbackUsuario);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
