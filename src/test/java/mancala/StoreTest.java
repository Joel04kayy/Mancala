/*
 These test cases are designed to verify the correct implementation of the API for the classes under test.
 They do not provide exhaustive coverage and thorough testing of all possible scenarios.
 Additional test cases should be added to cover  edge cases and behaviors.
 */
package mancala;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    private Store store;
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("Player One");
        store = new Store();
        store.setOwner(player);
    }

    @Test
    public void testSetOwner() {
        assertEquals(player, store.getOwner());
    }

    @Test
    public void testAddStones() {
        store.addStones(5);
        assertEquals(5, store.getTotalStones());
    }

    @Test
    public void testGetTotalStones() {
        store.addStones(3);
        assertEquals(3, store.getTotalStones());
    }

    @Test
    public void testEmptyStore() {
        store.addStones(4);
        int emptiedStones = store.emptyStore();
        assertEquals(4, emptiedStones);
        assertEquals(0, store.getTotalStones());
    }
}
