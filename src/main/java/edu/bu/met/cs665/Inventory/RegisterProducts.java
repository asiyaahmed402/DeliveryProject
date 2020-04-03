package edu.bu.met.cs665.Inventory;

/**
 * @author Asiya Ahmed
 * This class represents the registered products in the inventory
 * */

public class RegisterProducts {

    // initial name for a product
    protected String name = "New Product";

    // initial price for a product

    protected double price = 0.0;
    /**
     * Create a registered product using the name and price
     * @param name name of the RegisteredProducts as String
     * @param price price of the RegisteredProducts as integer
     *
     */


    public RegisterProducts(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public RegisterProducts() {

    }

    /**
     * Getter method for name of the Registered Products.
     *
     * @return
     */

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for price of the RegisteredProducts.
     *
     * @return
     */

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

