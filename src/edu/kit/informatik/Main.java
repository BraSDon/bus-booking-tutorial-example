package edu.kit.informatik;

import edu.kit.informatik.cli.BookingSystemUI;

/**
 * Utility class only containing main method.
 *
 * @author Brandon Schühlein
 * @version 1.0
 */
public final class Main {

    private Main() {

    }

    /**
     * Main method
     * @param args commmand line input (ignored by this method)
     */
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        BookingSystemUI bookingSystemUI = new BookingSystemUI(bookingSystem);

        bookingSystemUI.interact();
    }
}
