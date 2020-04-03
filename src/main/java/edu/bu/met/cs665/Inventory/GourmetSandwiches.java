package edu.bu.met.cs665.Inventory;

public class GourmetSandwiches extends RegisterProducts {

    /**
     * Create a Gourmet Sandwiches using the name and price
     * @param name name of the Gourmet Sandwiches as String
     * @param price price of the Gourmet Sandwiches as integer
     *
     */

    public GourmetSandwiches(String name, double price){
        super();

        this.name = "GourmetSandwiches";

        //setting the price to $30 for all of the sandwiches
        this.price = 30.0;
    }

}
