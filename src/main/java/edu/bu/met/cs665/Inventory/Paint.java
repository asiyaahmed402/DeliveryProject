package edu.bu.met.cs665.Inventory;

public class Paint extends RegisterProducts {

    /**
     * Create a Paint using the name and price
     * @param name name of the Paint as String
     * @param price price of the Paint as integer
     *
     */

    public Paint(String name, double price){
        super();

        this.name = "Paint";

        //setting the price to $20 for all of the paints
        this.price = 20.0;
    }


}
