package com.farmshop;

import static org.junit.Assert.*;

import org.junit.Test;

public class FarmShopTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        FarmShop app = new FarmShop(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
