package edu.bu.met.cs665.Inventory;

public class OrganicSkincare extends RegisterProducts {

    /**
     * Create a OrganicSkincare using the name and price
     * @param name name of the OrganicSkincare as String
     * @param price price of the OrganicSkincare as integer
     *
     */

    public OrganicSkincare(String name, double price){
        super();

        this.name = "Organic Skincare";

        //setting the price to $10 for all of the skincare products
        this.price = 10.0;
    }


}
