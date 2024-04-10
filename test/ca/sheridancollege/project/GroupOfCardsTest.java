package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GroupOfCardsTest {

    public GroupOfCardsTest() {
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
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        // Create an instance of GroupOfCards
        GroupOfCards instance = new GroupOfCards(52); // Adjust the constructor based on your implementation
        // Call the method being tested
        ArrayList<Card> result = instance.getCards();
        // Check if the returned ArrayList is not null
        assertNotNull(result);
        // You may also want to test if the returned ArrayList is empty initially
        assertTrue(result.isEmpty());
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        // Create an instance of GroupOfCards
        GroupOfCards instance = new GroupOfCards(52); // Adjust the constructor based on your implementation
        // Call the method being tested
        instance.shuffle();
        // No need to assert anything here as it's a void method
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        // Create an instance of GroupOfCards
        GroupOfCards instance = new GroupOfCards(52); // Adjust the constructor based on your implementation
        // Call the method being tested
        int result = instance.getSize();
        // Assert that the initial size matches the expected size
        assertEquals(52, result); // Adjust the expected size based on your implementation
    }

    /**
     * Test of setSize method, of class GroupOfCards.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        // Create an instance of GroupOfCards
        GroupOfCards instance = new GroupOfCards(52); // Adjust the constructor based on your implementation
        // Call the method being tested
        instance.setSize(10); // Set the size to some arbitrary value
        // Assert that the size has been set correctly
        assertEquals(10, instance.getSize()); // Adjust the expected size based on your implementation
    }

}
