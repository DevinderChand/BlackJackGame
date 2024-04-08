package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your Blackjack game.
 *
 * @author devin
 */
public class Game {

    private final String name; // The title of the game
    private final ArrayList<Player> players; // The players of the game
    private final GroupOfCards deck;
    private final Scanner scanner;

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.deck = new GroupOfCards(52);
        initializeDeck();
        deck.shuffle();
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players.clear();
        this.players.addAll(players);
    }

// Display the hand of Player 1 only
public void displayHands(Player currentPlayer) {
    System.out.println("Initial hands:");

    // Display Player 1's hand
    if (currentPlayer == players.get(1)) {
        System.out.println(players.get(1).getName() + "'s hand: " + players.get(1).getCards());
    }

    // Display dealer's face-up card
    System.out.println("Dealer's face-up card: " + players.get(0).getCards().get(1));
}





    // Main method to start and play the game
    public void play() {
        // Deal initial cards to players
        for (Player player : players) {
            dealCard(player);
        }
        for (Player player : players) {
            dealCard(player);
        }

        // Display initial hands for Player 1
        displayHands(players.get(1));

        // Allow Player 1 to take their turn
        playerTurn(players.get(1));

        // Display initial hands for Player 2
        displayHands(players.get(2));

        // Allow Player 2 to take their turn
        playerTurn(players.get(2));

        // Dealer's turn
        dealerTurn();

        // Declare the winner
        declareWinner();
    }

    // Helper method for player's turn
    private void playerTurn(Player player) {
        while (true) {
            // Display player's hand and ask for action
            System.out.println(player.getName() + "'s hand: " + player.getCards());
            System.out.println("Hand value: " + getHandValue(player));

            // Check if the player busts
            if (getHandValue(player) > 21) {
                 System.out.println("Bust! " + player.getName() + " loses.");
                break;
            }

            System.out.print("Do you want to (1) Hit or (2) Stand? ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Hit - deal a card to the player
                dealCard(player);
                System.out.println(player.getName() + " hits and gets a " + player.getCards().get(player.getCards().size() - 1));
            } else if (choice == 2) {
                // Stand - player's turn ends
                System.out.println(player.getName() + " stands.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 to Hit or 2 to Stand.");
            }
        }
    }

    // Dealer's turn
    private void dealerTurn() {
        System.out.println("Dealer's turn:");

        // Reveal the hidden card of the dealer
        Card hiddenCard = players.get(0).getCards().get(0);
        System.out.println("Dealer's face-up card: " + hiddenCard);

        // Dealer hits until hand value is at least 17
        while (getHandValue(players.get(0)) < 17) {
            dealCard(players.get(0));
            System.out.println("Dealer hits and gets a " + players.get(0).getCards().get(players.get(0).getCards().size() - 1));
        }

        // Display final dealer's hand
        System.out.println("Final dealer's hand: " + players.get(0).getCards());
        System.out.println("Final dealer's hand value: " + getHandValue(players.get(0)));
    }

    // Declare the winner based on hand values
    void declareWinner() {
        int dealerValue = getHandValue(players.get(0));

        for (Player player : players.subList(1, players.size())) {
            int playerValue = getHandValue(player);

            if (playerValue > 21) {
                System.out.println(player.getName() + " busts! " + player.getName() + " loses.");
            } else if (dealerValue > 21 || playerValue > dealerValue) {
                System.out.println(player.getName() + " wins!");
            } else if (playerValue == dealerValue) {
                System.out.println(player.getName() + " ties with the dealer. It's a push.");
            } else {
                System.out.println(player.getName() + " loses to the dealer.");
            }
        }
    }

    // Initialize the deck with standard 52 cards
    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.getCards().add(new Card(suit, rank));
            }
        }
    }

    // Get the total value of a player's hand, considering Aces as 1 or 11
    private int getHandValue(Player player) {
        int value = 0;
        int numAces = 0;

        for (Card card : player.getCards()) {
            String rank = card.getRank();

            if (rank.equals("Ace")) {
                value += 11;
                numAces++;
            } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
                value += 10;
            } else {
                value += Integer.parseInt(rank);
            }
        }

        // Adjust the value for Aces if needed
        while (value > 21 && numAces > 0) {
            value -= 10;
            numAces--;
        }

        return value;
    }

    public Scanner getScanner() {
        return scanner;
    }

    // Deal a card to a player
    public void dealCard(Player player) {
        Card card = deck.getCards().remove(0);
        player.getCards().add(card);
    }
public static void main(String[] args) {
    System.out.println("Welcome to Blackjack!");
    System.out.println("Rules:");
    System.out.println("1. Objective: Beat the dealer's hand without going over 21.");
    System.out.println("2. Players: At least two players - players and the dealer.");
    System.out.println("3. Card Values: Number cards have face value, face cards are 10, Aces are 1 or 11.");
    System.out.println("4. Initial Dealing: Each player gets two cards, one dealer card is face-up.");
    System.out.println("5. Player's Turn: Choose to hit (receive a card) or stand (keep current hand).");
    System.out.println();

    Scanner scanner = new Scanner(System.in);

    // Player registration
    System.out.print("Enter Player 1's name: ");
    String player1Name = scanner.nextLine();
    Player player1 = new Player(player1Name);

    System.out.print("Enter Player 2's name: ");
    String player2Name = scanner.nextLine();
    Player player2 = new Player(player2Name);

    Player dealer = new Player("Dealer");

    // Betting option
    System.out.print("Enter the bet amount for each player: ");
    double betAmount = scanner.nextDouble();

    // Start the game
    Game blackjackGame = new Game("Blackjack");
    blackjackGame.getPlayers().add(dealer);
    blackjackGame.getPlayers().add(player1);
    blackjackGame.getPlayers().add(player2);

    blackjackGame.play();

    scanner.close();
}

}
