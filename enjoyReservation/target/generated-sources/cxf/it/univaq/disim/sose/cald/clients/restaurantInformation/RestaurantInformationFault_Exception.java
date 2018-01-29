
package it.univaq.disim.sose.cald.clients.restaurantInformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-29T21:29:37.379+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "restaurantInformationFault", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInformation")
public class RestaurantInformationFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.clients.restaurantInformation.RestaurantInformationFault restaurantInformationFault;

    public RestaurantInformationFault_Exception() {
        super();
    }
    
    public RestaurantInformationFault_Exception(String message) {
        super(message);
    }
    
    public RestaurantInformationFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public RestaurantInformationFault_Exception(String message, it.univaq.disim.sose.cald.clients.restaurantInformation.RestaurantInformationFault restaurantInformationFault) {
        super(message);
        this.restaurantInformationFault = restaurantInformationFault;
    }

    public RestaurantInformationFault_Exception(String message, it.univaq.disim.sose.cald.clients.restaurantInformation.RestaurantInformationFault restaurantInformationFault, Throwable cause) {
        super(message, cause);
        this.restaurantInformationFault = restaurantInformationFault;
    }

    public it.univaq.disim.sose.cald.clients.restaurantInformation.RestaurantInformationFault getFaultInfo() {
        return this.restaurantInformationFault;
    }
}
