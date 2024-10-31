package com.example.atividadeavaliativa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mydatabases.db";
    private static final int DATABASE_VERSION = 3;
    private static final String TABLE_USERS= "users";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_SOBRENOME = "sobrenome";
    private static final String COLUMN_TELEFONE = "telefone";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_USERS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    COLUMN_NAME + " TEXT NOT NULL, " +
                    COLUMN_SOBRENOME + " TEXT NOT NULL, "+
                    COLUMN_TELEFONE + " INTEGER NOT NULL UNIQUE, " +
                    COLUMN_EMAIL + " TEXT NOT NULL UNIQUE);";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }
}