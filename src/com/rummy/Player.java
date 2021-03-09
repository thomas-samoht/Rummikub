package com.rummy;

import java.util.ArrayList;

public class Player {
    ArrayList<Tile> tiles;
    String name;

    public Player(ArrayList<Tile> tiles, String name) {
        this.tiles = tiles;
        this.name = name;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
