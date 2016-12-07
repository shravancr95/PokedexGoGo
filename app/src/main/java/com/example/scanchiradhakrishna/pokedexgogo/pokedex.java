package com.example.scanchiradhakrishna.pokedexgogo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class pokedex extends AppCompatActivity {
    private ListView lvPokemon;
    private ListPokeAdapter adapter;
    private ArrayList<Pokemon> pkdex;
    private DatabaseHelper DBHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
        lvPokemon = (ListView)findViewById(R.id.pokemon_list);

        //DBHelper = new DatabaseHelper(this);
        //File database = getApplicationContext().getDatabasePath(DatabaseHelper.DB_NAME);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        ArrayList<Pokemon> pkmn = databaseAccess.getList();
        databaseAccess.close();
        ArrayAdapter<Pokemon> adapter = new ArrayAdapter<Pokemon>(this, R.layout.pkmn_listview, pkmn);
        this.lvPokemon.setAdapter(adapter);
    }

    private  boolean copyDB(Context context){
         /*try{
             InputStream inputStream = context.getAssets().open(DatabaseHelper.DB_NAME);
             String outFileName = DatabaseHelper.DB_LOCATION + DatabaseHelper.DB_NAME;
             OutputStream outputStream = new FileOutputStream(outFileName);
             byte[]buff = new byte[1024];
             int length = 0;
             while((length = inputStream.read(buff)) > 0) {
                 outputStream.write(buff, 0, length);
                 outputStream.flush();
                 outputStream.close();
             }
             Log.d("Pokedex", "Copied DB");
             return true;

         }
         catch(Exception e){
            e.printStackTrace();
             return false;
         }*/
        return false;
    }

}
