
package it.univaq.disim.sose.cald.restaurantbooking;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-03T15:59:41.165+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "restaurantBookingFault", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantBooking")
public class RestaurantBookingFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingFault restaurantBookingFault;

    public RestaurantBookingFault_Exception() {
        super();
    }
    
    public RestaurantBookingFault_Exception(String message) {
        super(message);
    }
    
    public RestaurantBookingFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public RestaurantBookingFault_Exception(String message, it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingFault restaurantBookingFault) {
        super(message);
        this.restaurantBookingFault = restaurantBookingFault;
    }

    public RestaurantBookingFault_Exception(String message, it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingFault restaurantBookingFault, Throwable cause) {
        super(message, cause);
        this.restaurantBookingFault = restaurantBookingFault;
    }

    public it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingFault getFaultInfo() {
        return this.restaurantBookingFault;
    }
}