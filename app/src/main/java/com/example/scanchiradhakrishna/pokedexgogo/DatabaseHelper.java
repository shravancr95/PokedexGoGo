package com.example.scanchiradhakrishna.pokedexgogo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by SCanchiRadhakrishna on 12/6/16.
 */
public class DatabaseHelper extends SQLiteAssetHelper {
    public static final String DB_NAME = "Pokedex.db";
    private static int DB_VERSION = 1;
    //public static final String DB_LOCATION = "/data/data/com.example.scanchiradhakrishna.pokedexgogo/assets/";
    private Context mContext;
    private SQLiteDatabase db;

    public DatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
        this.mContext = mContext;
    }

    /*@Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void openDB(){
        //Log.d("DB_LOCATION")
        Log.d("DB_LOCATION", mContext.getDatabasePath(DB_LOCATION).getPath());
        String dbPath = mContext.getDatabasePath(DB_LOCATION).getPath();
        if(db != null && db.isOpen()){
            return;
        }
        db = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);

    }

    public void closeDB(){
        if(db!=null){
            db.close();
        }
    }

    public ArrayList<Pokemon> getList() {
        Pokemon p = null;
        ArrayList<Pokemon> pokedex = new ArrayList<>();
        openDB();
        Cursor cursor = db.rawQuery("SELECT id,name, type1, type2 FROM Pokemon", null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            p = new Pokemon(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
            pokedex.add(p);
            cursor.moveToNext();
        }
        cursor.close();
        closeDB();
        return pokedex;

    }*/

}
