
package it.univaq.disim.sose.cald.enjoyreservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-12T22:47:34.614+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "getRestaurantInfoFault", targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation")
public class GetRestaurantInfoFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.enjoyreservation.GetRestaurantInfoFault getRestaurantInfoFault;

    public GetRestaurantInfoFault_Exception() {
        super();
    }
    
    public GetRestaurantInfoFault_Exception(String message) {
        super(message);
    }
    
    public GetRestaurantInfoFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public GetRestaurantInfoFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.GetRestaurantInfoFault getRestaurantInfoFault) {
        super(message);
        this.getRestaurantInfoFault = getRestaurantInfoFault;
    }

    public GetRestaurantInfoFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.GetRestaurantInfoFault getRestaurantInfoFault, Throwable cause) {
        super(message, cause);
        this.getRestaurantInfoFault = getRestaurantInfoFault;
    }

    public it.univaq.disim.sose.cald.enjoyreservation.GetRestaurantInfoFault getFaultInfo() {
        return this.getRestaurantInfoFault;
    }
}
