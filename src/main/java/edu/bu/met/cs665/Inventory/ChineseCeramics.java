package edu.bu.met.cs665.Inventory;

/**
 * @author Asiya Ahmed
 * This class represents the Chinese Ceramics in the inventory
 * */

public class ChineseCeramics extends RegisterProducts {

    /**
     * Create a Chinese Ceramics using the name and price
     * @param name name of the ChineseCeramics as String
     * @param price price of the ChineseCeramics as integer
     *
     */

    public ChineseCeramics(String name, double price){

        super();

        this.name = "Chinese Ceramics";

        //setting the price to $1000 for all of the imported chinese ceramics
        this.price = 1000.0;



    }
}
