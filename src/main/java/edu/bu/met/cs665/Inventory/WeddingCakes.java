package edu.bu.met.cs665.Inventory;

public class WeddingCakes extends RegisterProducts {

    /**
     * Create a WeddingCakes using the name and price
     * @param name name of the WeddingCakes as String
     * @param price price of the WeddingCakes as integer
     *
     */

    public WeddingCakes(String name, double price){
        super();

        this.name = "Three Tier Cakes";

        //setting the price to $500 for all of the 3-tier cakes
        this.price = 500.0;
    }


}
