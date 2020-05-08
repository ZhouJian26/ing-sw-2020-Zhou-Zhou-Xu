package it.polimi.ingsw.utils.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void init() {
        new Player("username", "status", "color", "god", 0);
    }

    @Test
    public void initNull() {
        assertThrows(NullPointerException.class, () -> {
            new Player(null, "status", "color", "god", 0);
        });
        assertThrows(NullPointerException.class, () -> {
            new Player("", "status", "color", "god", 0);
        });
    }

}