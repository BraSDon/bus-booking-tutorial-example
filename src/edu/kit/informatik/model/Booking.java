package edu.kit.informatik.model;

public class Booking {
    private final Customer customer;
    private final int invoiceID;
    private final Busline busline;

    public Booking(Customer customer, int invoiceID, Busline busline) {
        this.customer = customer;
        this.invoiceID = invoiceID;
        this.busline = busline;
    }
}
