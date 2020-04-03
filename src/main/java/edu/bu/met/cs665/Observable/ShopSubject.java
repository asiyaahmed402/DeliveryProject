package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.ObserverClasses.*;

/**
 * @author Asiya Ahmed
 * This interface represents the subject in the observer pattern
 * */

public interface ShopSubject {

    /**
     * Register an observer to our list of observers.
     *
     * @param driver the observer object
     */
    public void registerObserver(DriverObserver driver);

    /**
     * remove an observer from our observer list.
     *
     * @param driver
     */
    public void removeObserver(DriverObserver driver);

    /**
     * Notify all observers and Select one.
     */
    //  public void notifyObservers();

    // it come instead of notifyObserver
    public void selectThisDriver();


}
