
package it.univaq.disim.sose.cald.enjoyreservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-10T22:59:48.521+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "bookingCinemaFault", targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation")
public class BookingCinemaFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.enjoyreservation.BookingCinemaFault bookingCinemaFault;

    public BookingCinemaFault_Exception() {
        super();
    }
    
    public BookingCinemaFault_Exception(String message) {
        super(message);
    }
    
    public BookingCinemaFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public BookingCinemaFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.BookingCinemaFault bookingCinemaFault) {
        super(message);
        this.bookingCinemaFault = bookingCinemaFault;
    }

    public BookingCinemaFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.BookingCinemaFault bookingCinemaFault, Throwable cause) {
        super(message, cause);
        this.bookingCinemaFault = bookingCinemaFault;
    }

    public it.univaq.disim.sose.cald.enjoyreservation.BookingCinemaFault getFaultInfo() {
        return this.bookingCinemaFault;
    }
}
