package edu.bu.met.cs665.Inventory;

import org.junit.*;

import static org.junit.Assert.*;

public class RegisterProductsTest {

    @Test
    public void getName() {

        RegisterProducts HandmadeTeaCup = new RegisterProducts("BlueCup", 25.0);
        assertEquals("BlueCup", HandmadeTeaCup.getName());
    }

    @Test
    public void setName() {
        RegisterProducts Tuxedo = new RegisterProducts("Tuxedo", 3000.0);
        Tuxedo.setName("Tux");

        assertEquals("Tux", Tuxedo.getName());
    }



}