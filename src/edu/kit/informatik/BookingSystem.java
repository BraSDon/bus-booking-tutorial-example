package edu.kit.informatik;

import edu.kit.informatik.model.Booking;
import edu.kit.informatik.model.Customer;
import edu.kit.informatik.model.Busline;
import edu.kit.informatik.model.price.Price;

/**
 * Class that models the booking system itself.
 * It includes all the required logic for executing the commands.
 *
 * @author Brandon Schühlein
 * @version 1.0
 */
public class BookingSystem {
    private static final int MAX_BUSLINES = 100;
    private static final int MAX_CUSTOMERS = 100;
    private static final int MAX_BOOKINGS = 100;

    private int nextBuslineIndex;
    private int nextCustomerIndex;
    private int nextBookingIndex;

    private Busline[] buslines;
    private Customer[] customers;
    private Booking[] bookings;

    /**
     * Constructor. Initialize the attributes.
     */
    public BookingSystem() {
        this.buslines = new Busline[MAX_BUSLINES];
        this.customers = new Customer[MAX_CUSTOMERS];
        this.bookings = new Booking[MAX_BOOKINGS];
        this.nextBuslineIndex = 0;
        this.nextCustomerIndex = 0;
        this.nextBookingIndex = 0;
    }

    /**
     * Add a new busline to the array of buslines.
     * @param busID id of the bus
     * @param startStation start station of busline
     * @param endStation end station of busline
     * @param price price containing information about price(value) and currency
     */
    public void addBusline(int busID, String startStation, String endStation, Price price) {
        Busline busline = new Busline(busID, startStation, endStation, price);
        this.buslines[nextBuslineIndex] = busline;
        this.nextBuslineIndex++;
    }

    // Implement further methods
}
