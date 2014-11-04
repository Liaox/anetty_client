package com.netty.client.android.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.netty.client.android.dao.Device;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table t_device.
*/
public class DeviceDao extends AbstractDao<Device, Long> {

    public static final String TABLENAME = "t_device";

    /**
     * Properties of entity Device.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AppKey = new Property(1, String.class, "appKey", false, "APP_KEY");
        public final static Property DeviceId = new Property(2, String.class, "deviceId", false, "DEVICE_ID");
        public final static Property Imei = new Property(3, String.class, "imei", false, "IMEI");
        public final static Property AppPackage = new Property(4, String.class, "appPackage", false, "APP_PACKAGE");
        public final static Property RegId = new Property(5, String.class, "regId", false, "REG_ID");
        public final static Property IsOnline = new Property(6, Integer.class, "isOnline", false, "IS_ONLINE");
    };


    public DeviceDao(DaoConfig config) {
        super(config);
    }
    
    public DeviceDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'t_device' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'APP_KEY' TEXT," + // 1: appKey
                "'DEVICE_ID' TEXT," + // 2: deviceId
                "'IMEI' TEXT," + // 3: imei
                "'APP_PACKAGE' TEXT," + // 4: appPackage
                "'REG_ID' TEXT," + // 5: regId
                "'IS_ONLINE' INTEGER);"); // 6: isOnline
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'t_device'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Device entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String appKey = entity.getAppKey();
        if (appKey != null) {
            stmt.bindString(2, appKey);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(3, deviceId);
        }
 
        String imei = entity.getImei();
        if (imei != null) {
            stmt.bindString(4, imei);
        }
 
        String appPackage = entity.getAppPackage();
        if (appPackage != null) {
            stmt.bindString(5, appPackage);
        }
 
        String regId = entity.getRegId();
        if (regId != null) {
            stmt.bindString(6, regId);
        }
 
        Integer isOnline = entity.getIsOnline();
        if (isOnline != null) {
            stmt.bindLong(7, isOnline);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Device readEntity(Cursor cursor, int offset) {
        Device entity = new Device( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // appKey
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // deviceId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // imei
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // appPackage
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // regId
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // isOnline
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Device entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAppKey(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDeviceId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImei(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAppPackage(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRegId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIsOnline(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Device entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Device entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
