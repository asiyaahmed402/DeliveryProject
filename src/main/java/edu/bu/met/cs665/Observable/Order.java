package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.Inventory.*;

import java.util.*;

public class Order {

    protected int orderId;
    protected int homeDistance;
    protected int shopNo;
    protected List<RegisterProducts> products;
    protected boolean needFreezer;
    //Initialize order status
    protected String status ="waiting" ;


    public Order(int orderId, int homeDistance, int shopNo, List<RegisterProducts> products,boolean needFreezer ) {
        super();
        this.orderId = orderId;
        this.homeDistance = homeDistance;
        this.shopNo = shopNo;
        this.products = products;
        this.needFreezer = needFreezer;
        this.status = "waiting";
    }


    public int getOrderId() {
        return orderId;
    }


    public void setOrderId(int customerId) {
        this.orderId = customerId;
    }

    /**
     * Getter for homeDistance
     *
     * @return homeDistance
     */
    public int getHomeDistance() {
        return homeDistance;
    }

    /**
     * setter method for the customer homeDistance
     *
     * @param homeDistance
     */
    public void setHomeDistance(int homeDistance) {
        this.homeDistance = homeDistance;
    }

    /**
     * Getter for shopNo
     *
     *
     * @return shopNo
     */
    public int getShopNo() {
        return shopNo;
    }

    /**
     * setter method for the shop number
     *
     * @param shopNo
     */
    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }


    public List<RegisterProducts> getProducts() {
        return products;
    }

    public void setProducts(List<RegisterProducts> products) {
        this.products = products;
    }


    public boolean isNeedFreezer() {
        return needFreezer;
    }


    public void setNeedFreezer(boolean needFreezer) {
        this.needFreezer = needFreezer;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }




}
