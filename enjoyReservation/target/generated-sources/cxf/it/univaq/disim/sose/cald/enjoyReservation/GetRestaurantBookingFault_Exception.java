
package it.univaq.disim.sose.cald.enjoyReservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-29T21:29:37.007+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "getRestaurantBookingFault", targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation")
public class GetRestaurantBookingFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.enjoyReservation.GetRestaurantBookingFault getRestaurantBookingFault;

    public GetRestaurantBookingFault_Exception() {
        super();
    }
    
    public GetRestaurantBookingFault_Exception(String message) {
        super(message);
    }
    
    public GetRestaurantBookingFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public GetRestaurantBookingFault_Exception(String message, it.univaq.disim.sose.cald.enjoyReservation.GetRestaurantBookingFault getRestaurantBookingFault) {
        super(message);
        this.getRestaurantBookingFault = getRestaurantBookingFault;
    }

    public GetRestaurantBookingFault_Exception(String message, it.univaq.disim.sose.cald.enjoyReservation.GetRestaurantBookingFault getRestaurantBookingFault, Throwable cause) {
        super(message, cause);
        this.getRestaurantBookingFault = getRestaurantBookingFault;
    }

    public it.univaq.disim.sose.cald.enjoyReservation.GetRestaurantBookingFault getFaultInfo() {
        return this.getRestaurantBookingFault;
    }
}
