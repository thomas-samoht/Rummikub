package com.rummy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tile> pool = new ArrayList<>();

        System.out.println("This is Rummykub");
        pool = generateTiles();
        printAllTiles(pool);
    }

    public static ArrayList<Tile> generateTiles(){

        ArrayList<Tile> pool = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Black", "Orange", "Blue"));
        for(int i = 0; i<2; i++){
            for(int number=0; number<13; number++){
                for (String color: colors) {
                    Tile tile = new Tile(color, number);
                    pool.add(tile);
                }
            }
        }

        // Add jokers
        Tile tile = new Tile("Black", 0);
        pool.add(tile);
        tile = new Tile("Red", 0);
        pool.add(tile);
        return pool;
    }

    public static void printAllTiles(ArrayList<Tile> pool){
        for (Tile tile: pool) {
            System.out.println("Color: " + tile.color + "\t" + tile.number);
        }
        System.out.println(pool.size());
    }
}
