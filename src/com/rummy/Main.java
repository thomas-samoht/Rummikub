package com.rummy;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is Rummykub");
        Game game = new Game();
        game.start();
        game.setUpGame();

    }
}
