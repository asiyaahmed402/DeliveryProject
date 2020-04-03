package edu.bu.met.cs665.ObserverClasses;

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
