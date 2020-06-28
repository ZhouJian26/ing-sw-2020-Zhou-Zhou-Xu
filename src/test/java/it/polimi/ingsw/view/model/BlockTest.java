package it.polimi.ingsw.view.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

public class BlockTest {
    @Test
    public void init() {
        Block b = new Block("type", "owner", "color");
        assertEquals("type", b.typeBlock);
        assertEquals("owner", b.owner);
        assertEquals("color", b.color);
        List<String> raw = b.getRawData();
        assertEquals(1, raw.size());
        assertEquals("color", raw.get(0));
    }

    @Test
    public void initNoOwner() {
        Block b = new Block("type", null, "color");
        assertEquals("type", b.typeBlock);
        assertEquals(null, b.owner);
        assertEquals("color", b.color);
        List<String> raw = b.getRawData();
        assertEquals(1, raw.size());
        assertEquals("type", raw.get(0));
    }
}