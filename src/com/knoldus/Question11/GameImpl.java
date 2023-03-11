package com.knoldus.Question11;
import Game.Player;
public class GameImpl {
    public static void main(String[] args) {
        Player player1 = new Player("Anshika", 100, 1);
        Player player2 = new Player("Vishesh", 200, 2);

        System.out.println("Player 1:");
        System.out.println("Name: " + player1.getName());
        System.out.println("Score: " + player1.getScore());
        System.out.println("Level: " + player1.getLevel());

        System.out.println("Player 2:");
        System.out.println("Name: " + player2.getName());
        System.out.println("Score: " + player2.getScore());
        System.out.println("Level: " + player2.getLevel());
    }
}
