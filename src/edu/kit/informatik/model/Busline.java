package edu.kit.informatik.model;

import edu.kit.informatik.model.price.Price;

public class Busline {

    private final int busID;
    private String startingStation;
    private String endStation;
    private Price price;

    public Busline(int busID, String startingStation, String endStation, Price price) {
        this.busID = busID;
        this.startingStation = startingStation;
        this.endStation = endStation;
        this.price = price;
    }
}
