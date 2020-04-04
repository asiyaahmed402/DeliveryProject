package edu.bu.met.cs665.ObserverClasses;
/**
 * @author Asiya Ahmed
 * This class represents the regular drivers with smaller cars
 * * */
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
