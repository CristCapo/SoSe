
package it.univaq.disim.sose.cald.enjoyreservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-03T15:16:09.392+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "bookingRestaurantFault", targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation")
public class BookingRestaurantFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.enjoyreservation.BookingRestaurantFault bookingRestaurantFault;

    public BookingRestaurantFault_Exception() {
        super();
    }
    
    public BookingRestaurantFault_Exception(String message) {
        super(message);
    }
    
    public BookingRestaurantFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public BookingRestaurantFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.BookingRestaurantFault bookingRestaurantFault) {
        super(message);
        this.bookingRestaurantFault = bookingRestaurantFault;
    }

    public BookingRestaurantFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.BookingRestaurantFault bookingRestaurantFault, Throwable cause) {
        super(message, cause);
        this.bookingRestaurantFault = bookingRestaurantFault;
    }

    public it.univaq.disim.sose.cald.enjoyreservation.BookingRestaurantFault getFaultInfo() {
        return this.bookingRestaurantFault;
    }
}
