package edu.bu.met.cs665.Inventory;

public class HandmadeSuits extends RegisterProducts {

    /**
     * Create a HandmadeSuits using the name and price
     * @param name name of the HandmadeSuits as String
     * @param price price of the HandmadeSuits as integer
     *
     */

    public HandmadeSuits(String name, double price){
        super();

        this.name = "Custom handmade suits";

        //setting the price to $6000 for all of the suits for the winter collection
        this.price = 6000.0;
    }
}
