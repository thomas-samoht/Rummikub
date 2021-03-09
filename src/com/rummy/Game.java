package com.rummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    int numberOfPlayers = 0;
    ArrayList<Tile> pool;
    ArrayList<Player> players;

    public void start(){
        Scanner sc=new Scanner(System.in);
        //How many players
        System.out.println("How many players play: ");
        numberOfPlayers = sc.nextInt();
    }
    public void setUpGame(){
        pool = generateTiles();
        Collections.shuffle(pool);

        //randomize who starts the game
        players = generatePlayers(numberOfPlayers);
        Collections.shuffle(players);
        System.out.println(players.get(0).name + " Can start the game!");
        Collections.shuffle(players);
        System.out.println(players.get(0).name + " Can start the game!");
        Collections.shuffle(players);
        System.out.println(players.get(0).name + " Can start the game!");
        Collections.shuffle(players);
        System.out.println(players.get(0).name + " Can start the game!");
    }

    public void turn(){}

    public static ArrayList<Player> generatePlayers(int numberOfPlayers){
        ArrayList<Player> players= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=numberOfPlayers;i++){
            System.out.println("Enter name of player " + i);
            String playerName = sc.nextLine();
            Player player = new Player(null, playerName);
            players.add(player);
        }
        return players;
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
}
