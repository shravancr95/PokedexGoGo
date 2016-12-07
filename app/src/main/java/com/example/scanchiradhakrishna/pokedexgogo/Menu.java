package com.example.scanchiradhakrishna.pokedexgogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private static Button pokedexButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        onClickPokedexButtonListener();
    }

    public void onClickPokedexButtonListener() {
        pokedexButton = (Button) findViewById(R.id.pokedexButton);
        pokedexButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.scanchiradhakrishna.pokedexgogo.pokedex");
                        startActivity(intent);

                    }
                });
    }

}