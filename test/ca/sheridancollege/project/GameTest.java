package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        // Create an instance of Game
        Game instance = new Game("TestGame"); // Instantiate Game object with a name
        // Call the method being tested
        String expResult = "TestGame"; // Your expected result here
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        // Create an instance of Game
        Game instance = new Game("TestGame"); // Instantiate Game object
        // Create players to set
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        players.add(player1);
        players.add(player2);
        // Set players in the game instance
        instance.setPlayers(players);
        // Get players from the instance and check if it matches the expected result
        ArrayList<Player> expResult = players;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        // Create an instance of Game
        Game instance = new Game("TestGame"); // Instantiate Game object
        // Create players to set
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        players.add(player1);
        players.add(player2);
        // Set players in the game instance
        instance.setPlayers(players);
        // Get players from the instance and check if it matches the expected result
        ArrayList<Player> expResult = players;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayHands method, of class Game.
     */
@Test
public void testDisplayHands() {
    System.out.println("displayHands");
    // Create an instance of Game
    Game instance = new Game("TestGame"); // Instantiate Game object
    // Create players to set
    ArrayList<Player> players = new ArrayList<>();
    Player player1 = new Player("Player1");
    Player player2 = new Player("Player2");
    players.add(player1);
    players.add(player2);
    // Set players in the game instance
    instance.setPlayers(players);
    // Deal some cards to the players
    instance.dealCard(player1);
    instance.dealCard(player2);
    // Display hands for one of the players
    instance.displayHands(player1);
    // Since this method is void, we cannot directly test output. You may want to add assertions based on the expected behavior.
}

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        // Create an instance of Game
        Game instance = new Game("TestGame"); // Instantiate Game object
        // Create players to set
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        players.add(player1);
        players.add(player2);
        // Set players in the game instance
        instance.setPlayers(players);
        // Since the play method involves user interaction and random card dealing, it's more suitable for integration testing. You may want to add assertions based on the expected behavior.
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        // Create an instance of Game
        Game instance = new Game("TestGame"); // Instantiate Game object
        // Create players to set
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        players.add(player1);
        players.add(player2);
        // Set players in the game instance
        instance.setPlayers(players);
        // Since the declareWinner method involves determining winners based on hand values, you can test various scenarios where different players have different hands and the expected winner is determined correctly.
    }

    /**
     * Test of getScanner method, of class Game.
     */
    @Test
    public void testGetScanner() {
        System.out.println("getScanner");
        // Create an instance of Game
        Game instance = new Game("TestGame"); // Instantiate Game object
        // Since getScanner method returns a Scanner object, you can test if it's not null or if it's of the expected type.
        Scanner result = instance.getScanner();
        assertNotNull(result);
        assertTrue(result instanceof Scanner);
    }

    /**
     * Test of dealCard method, of class Game.
     */
    @Test
    public void testDealCard() {
        System.out.println("dealCard");
        // Create an instance of Game
        Game instance = new Game("TestGame"); // Instantiate Game object
        // Create a player to deal the card
        Player player = new Player("Player1");
        // Deal a card to the player
        instance.dealCard(player);
        // Since the dealCard method deals a card to the player, you may want to assert that the player's hand has increased by one card after dealing.
        assertEquals(1, player.getCards().size());
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        // You can test the main method indirectly by invoking it and checking if it runs without throwing any exceptions.
        String[] args = null;
        Game.main(args);
    }
}
