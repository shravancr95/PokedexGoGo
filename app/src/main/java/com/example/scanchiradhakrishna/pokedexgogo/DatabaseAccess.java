package com.example.scanchiradhakrishna.pokedexgogo;

/**
 * Created by SCanchiRadhakrishna on 12/6/16.
 */
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public ArrayList<Pokemon> getList() {
        Pokemon p = null;
        ArrayList<Pokemon> pokedex = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT id,name, type1, type2 FROM pokemon", null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            p = new Pokemon(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
            Log.d("Name", p.getName());
            Log.d("Type: ", p.getType1() + ", " + p.getType2());
            pokedex.add(p);
            cursor.moveToNext();
        }
        cursor.close();
        return pokedex;
    }
}
