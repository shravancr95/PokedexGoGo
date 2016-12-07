package com.example.scanchiradhakrishna.pokedexgogo;

/**
 * Created by SCanchiRadhakrishna on 12/6/16.
 */
public class Pokemon {
    private int id;
    private String name;
    private String type2;
    private String type1;

    public Pokemon(int id, String name, String type1, String type2) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }
}
