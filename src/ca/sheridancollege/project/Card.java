package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project.
 * Must be general enough to be instantiated for any Card game.
 *
 * @author [Your Name]
 */
public class Card {
    // Default modifier for child classes
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
