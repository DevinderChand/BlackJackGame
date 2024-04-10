package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    
    public CardTest() {
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
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        // Create a Card instance
        Card instance = new Card("Spades", "10"); // Example values, replace with actual values
        String expResult = "Spades";
        String result = instance.getSuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        // Create a Card instance
        Card instance = new Card("Spades", "10"); // Example values, replace with actual values
        String expResult = "10";
        String result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        // Create a Card instance
        Card instance = new Card("Spades", "10"); // Example values, replace with actual values
        String expResult = "10 of Spades";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
