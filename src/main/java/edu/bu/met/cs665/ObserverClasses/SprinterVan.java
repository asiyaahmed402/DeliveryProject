package edu.bu.met.cs665.ObserverClasses;
/**
 * @author Asiya Ahmed
 * This class represents the drivers that operate bigger vans
 * */

public class SprinterVan extends DeliveryDriver {

    public SprinterVan(int driverId , boolean hasFreezer) {
        super();

        this.driverId= driverId;
        this.vehicleType="Van";
        this.hasFreezer = hasFreezer;

    }

    public SprinterVan() {

    }


}
