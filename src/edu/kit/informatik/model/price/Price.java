package edu.kit.informatik.model.price;

public class Price {

    private final double value;
    private final Currency currency;

    public Price(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }
}
