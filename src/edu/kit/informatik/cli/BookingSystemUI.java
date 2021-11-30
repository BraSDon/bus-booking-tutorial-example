package edu.kit.informatik.cli;

import edu.kit.informatik.BookingSystem;
import edu.kit.informatik.model.price.Currency;
import edu.kit.informatik.model.price.Price;

import java.util.Scanner;

/**
 * User Interface to interact with the booking system.
 *
 * @author Brandon Schühlein
 * @version 1.0
 */
public class BookingSystemUI {

    // Constants describing the commands
    private static final String ADD_BUSLINE_COMMAND = "add";
    private static final String QUIT_COMMAND = "quit";

    // Constants describing how to split input
    private static final String COMMAND_SEPERATOR = "\s";
    private static final String PARAMETER_SEPERATOR = ";";

    // Constants describing default messages
    private static final String MESSAGE_OK = "OK";

    private final BookingSystem bookingSystem;

    /**
     * Constructor.
     * @param bookingSystem the booking system object we are working on
     */
    public BookingSystemUI(BookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }

    /**
     * Method taking user input in an infinite loop, only exiting if user enters the corresponding command.
     */
    public void interact() {
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {
            // For this assignment we assume that the input is always valid (also important for the methods below)
            String input = sc.nextLine();
            String[] parts = input.split(COMMAND_SEPERATOR);
            String command = parts[0];
            String[] parameters = parts.length > 1 ? parts[1].split(PARAMETER_SEPERATOR) : null;

            switch (command) {
                case ADD_BUSLINE_COMMAND:
                    System.out.println(addBusline(parameters));
                    break;
                case QUIT_COMMAND:
                    running = false;
                    break;
                default:
                    // throw new IllegalArgumentException("Command not found");
            }
        }
        sc.close();
    }

    /**
     * Convert String array of parameters into variables with fitting types (for this command),
     * and call corresponding method in bookingSystem.
     * @param parameters input parameters given by user
     * @return the ok message
     */
    private String addBusline(String[] parameters) {
        int busID = Integer.parseInt(parameters[0]);
        String startStation = parameters[1];
        String endStation = parameters[2];
        int value = Integer.parseInt(parameters[3]);
        Currency currency = Currency.valueOf(parameters[4]);

        this.bookingSystem.addBusline(busID, startStation, endStation, new Price(value, currency));
        return MESSAGE_OK;
    }
}
