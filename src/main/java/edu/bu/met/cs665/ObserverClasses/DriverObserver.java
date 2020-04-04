package edu.bu.met.cs665.ObserverClasses;
/**
 * @author Asiya Ahmed
 *
 * */
public interface DriverObserver {


    public void setDriverData(int distanceFromShop1, int distanceFromShop2,
                              int distanceFromShop3, int distanceFromShop4, int distanceFromShop5);

    public int getDriverDistanceFromShop(int shopNo);

    public void update(int orderId, int shopNo, int totalDistance, String status);





}
