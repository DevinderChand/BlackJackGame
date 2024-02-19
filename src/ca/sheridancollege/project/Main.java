package ca.sheridancollege.project;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create a Blackjack game
        Game blackjackGame = new Game("Blackjack");

        // Create players
        Player player1 = new Player("Player 1");
        

        // Add players to the game
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        

        blackjackGame.setPlayers(players);

        // Start the game
        blackjackGame.play();

        // Display hands and declare the winner
        // Since the displayHands and declareWinner methods are part of the Game class,
        // you can call them within the Game class's play() method
        // However, if you want to display hands and declare the winner separately, you can do so as follows:

        // Display hands after the game is played
        blackjackGame.displayHands(player1);

        // Declare the winner after the game is played
        blackjackGame.declareWinner();
    }
}
