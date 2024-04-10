package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        // Create an instance of Player
        Player instance = new Player("TestPlayer");
        // Call the method being tested
        String expResult = "TestPlayer";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCards method, of class Player.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        // Create an instance of Player
        Player instance = new Player("TestPlayer");
        // Since the getCards method returns an ArrayList, you may want to test if it's not null initially
        assertNotNull(instance.getCards());
        // You may also want to test if the returned ArrayList is empty initially
        assertTrue(instance.getCards().isEmpty());
    }

}
