package edu.bu.met.cs665.ObserverClasses;

import edu.bu.met.cs665.Observable.*;

/**
 * @author Asiya Ahmed
 * This class represents the Delivery Drivers
 * */
public class DeliveryDriver implements DriverObserver , DriverStatusObserver {

    protected int driverId;
    protected String vehicleType;
    protected int driverDistance;
    protected boolean hasFreezer;
    protected int totalDistance;
    protected int homeDistance;
    protected boolean OrderNeedFreezer;
    protected int totalTime;
    protected String orderStatus ;
    protected String status = "available";
    protected ShopSubject shopdata;
    protected int orderId;
    protected int shopNo;
    protected int distanceFromShop1;
    protected int distanceFromShop2;
    protected int distanceFromShop3;
    protected int distanceFromShop4;
    protected int distanceFromShop5;


    @Override
    public void setDriverData(int distanceFromShop1, int distanceFromShop2, int distanceFromShop3,
                              int distanceFromShop4, int distanceFromShop5) {
        // TODO Auto-generated method stub
        this.distanceFromShop1 = distanceFromShop1;
        this.distanceFromShop2 = distanceFromShop2;
        this.distanceFromShop3 = distanceFromShop3;
        this.distanceFromShop4 = distanceFromShop4;
        this.distanceFromShop5 = distanceFromShop5;

    }
    @Override
    public int getDriverDistanceFromShop( int shopNo) {
        if (shopNo == 1) {
            this.driverDistance = distanceFromShop1;
        } else if (shopNo == 2) {
            this.driverDistance = distanceFromShop2;
        }else if (shopNo == 3) {
            this.driverDistance = distanceFromShop3;
        }else if (shopNo == 4) {
            this.driverDistance = distanceFromShop4;
        }else if (shopNo == 5) {
            this.driverDistance = distanceFromShop5;
        }
        return driverDistance;
    }



    @Override
    public void update(int orderId, int shopNo , int totalDistance , String status ) {
        this.orderId = orderId;
        this.shopNo = shopNo;
        //for the totalDistance I need to add the user distance from order
        this.totalDistance = totalDistance;
        this.totalTime = totalDistance;
        this.status = status;
    }


    /**
     * Display Driver Data
     */
    @Override
    public void display() {

        System.out.println("Drive " + driverId + " has a "+ vehicleType +
                " his Distance from store  "+shopNo +" is  "+ driverDistance+ " he has order number "+
                orderId +" his status is "+ status + " the reminder distance for dilevery  "+
                totalDistance );

    }

    //DRIVERID
    public int getDriverId() {
        return driverId;
    }
    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }


    //VEHICLETIME
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    //DRIVERDISTANCE

    public int getDriverDistance() {
        return driverDistance;
    }


    public void setDriverDistance( int shopNo) {
        if (shopNo == 1) {
            this.driverDistance = distanceFromShop1;
        } else if (shopNo == 2) {
            this.driverDistance = distanceFromShop2;
        }else if (shopNo == 3) {
            this.driverDistance = distanceFromShop3;
        }else if (shopNo == 4) {
            this.driverDistance = distanceFromShop4;
        }else if (shopNo == 5) {
            this.driverDistance = distanceFromShop5;
        }
    }

    //ORDERID
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    // HASFREEZER
    public boolean isHasFreezer() {
        return hasFreezer;
    }


    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }

    //TOTAL TIME
    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    //TOTAL TIME
    public double getTotalTime() {
        return totalTime;
    }


    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    //STATUS
    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    //SHOPNO
    public int getShopNo() {
        return shopNo;
    }
    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }


}
