package edu.bu.met.cs665;

import edu.bu.met.cs665.ObserverClasses.*;
import edu.bu.met.cs665.Observable.*;
//import edu.bu.met.cs665.example1.Person;

import org.apache.log4j.PropertyConfigurator;

public class Main {



  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // SedanDriver(Int driverId , boolean hasFreezer
    DriverObserver driver0 = new SedanDriver(0, true);
    DriverObserver driver1 = new SedanDriver(1, true);
    DriverObserver driver2 = new SedanDriver(2, false);
    DriverObserver driver3 = new SedanDriver(3, false);
    DriverObserver driver4 = new SedanDriver(4, false);
    DriverObserver driver5 = new SprinterVan(5, true);
    DriverObserver driver6 = new SprinterVan(6, false);
    DriverObserver driver7 = new SprinterVan(7, false);
    DriverObserver driver8 = new SprinterVan(8, true);
    DriverObserver driver9 = new SprinterVan(9, true);

    ShopSystem shopSystem = new ShopSystem();

    shopSystem.registerObserver(driver0);
    shopSystem.registerObserver(driver1);
    shopSystem.registerObserver(driver2);
    shopSystem.registerObserver(driver3);
    shopSystem.registerObserver(driver4);
    shopSystem.registerObserver(driver5);
    shopSystem.registerObserver(driver6);
    shopSystem.registerObserver(driver7);
    shopSystem.registerObserver(driver8);
    shopSystem.registerObserver(driver9);

    // I just have 5 shops
    // Order(int orderId, int homeDistance, int shopNo, List<Product>
    // products,boolean needFreezer )
    Order order1 = new Order(1, 6, 2, null, false);
    Order order2 = new Order(2, 5, 5, null, true);
    Order order3 = new Order(3, 10, 1, null, false);
    Order order4 = new Order(4, 16, 3, null, true);
    Order order5 = new Order(5, 3, 2, null, false);
    Order order6 = new Order(6, 12, 5, null, true);
    Order order7 = new Order(7, 10, 1, null, false);
    Order order8 = new Order(8, 16, 4, null, true);
    Order order9 = new Order(9, 2, 3, null, false);
    Order order10 = new Order(10, 4, 5, null, true);
    Order order11 = new Order(11, 9, 1, null, false);
    Order order12 = new Order(12, 16, 4, null, true);

    shopSystem.setOrderData(order1);
    shopSystem.setOrderData(order2);
    shopSystem.setOrderData(order3);
    shopSystem.setOrderData(order4);
    shopSystem.setOrderData(order5);
    shopSystem.setOrderData(order6);
    shopSystem.setOrderData(order7);
    shopSystem.setOrderData(order8);
    shopSystem.setOrderData(order9);
    shopSystem.setOrderData(order10);
    shopSystem.setOrderData(order11);
    shopSystem.setOrderData(order12);
    // display the first status of the drivers
    shopSystem.displayAllDrivers();
    System.out.println("*****************************************************");
    shopSystem.displayAllOrder();
    System.out.println("*****************************************************");
    //Select driver for each order
    shopSystem.selectThisDriver();
    System.out.println("*****************************************************");
    //track all drivers status
    shopSystem.trackDriver();
    System.out.println("*****************************************************");

    //print the final status for drivers and orders
    shopSystem.displayAllDrivers();
    System.out.println("*****************************************************");
    shopSystem.displayAllOrder();

  }

}
































































































































