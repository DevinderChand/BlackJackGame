package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the Blackjack game.
 *
 * @author devin
 */
public class Player {

    private final String name; // The unique name for this player 
    private final ArrayList<Card> cards; // The cards held by the player

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
