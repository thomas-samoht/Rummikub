package com.rummy;

// Tile class keeps track of the tiles, color and number on tile

public class Tile {
    String color;
    int number;

    public Tile(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}