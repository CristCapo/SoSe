
package it.univaq.disim.sose.cald.clients.restaurantinserting;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-14T18:25:23.863+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "restaurantDeleteFault", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting")
public class RestaurantDeleteFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.clients.restaurantinserting.RestaurantDeleteFault restaurantDeleteFault;

    public RestaurantDeleteFault_Exception() {
        super();
    }
    
    public RestaurantDeleteFault_Exception(String message) {
        super(message);
    }
    
    public RestaurantDeleteFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public RestaurantDeleteFault_Exception(String message, it.univaq.disim.sose.cald.clients.restaurantinserting.RestaurantDeleteFault restaurantDeleteFault) {
        super(message);
        this.restaurantDeleteFault = restaurantDeleteFault;
    }

    public RestaurantDeleteFault_Exception(String message, it.univaq.disim.sose.cald.clients.restaurantinserting.RestaurantDeleteFault restaurantDeleteFault, Throwable cause) {
        super(message, cause);
        this.restaurantDeleteFault = restaurantDeleteFault;
    }

    public it.univaq.disim.sose.cald.clients.restaurantinserting.RestaurantDeleteFault getFaultInfo() {
        return this.restaurantDeleteFault;
    }
}
