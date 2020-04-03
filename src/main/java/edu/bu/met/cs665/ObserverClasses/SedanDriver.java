package edu.bu.met.cs665.ObserverClasses;

public class SedanDriver extends DeliveryDriver {

    public SedanDriver(int driverId , boolean hasFreezer) {
        super();

        this.driverId= driverId;
        this.vehicleType= "Taxi";
        this.hasFreezer = hasFreezer;



    }

    public SedanDriver() {

    }
}
