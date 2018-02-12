
package it.univaq.disim.sose.cald.enjoyreservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-12T22:47:34.638+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "updateRestaurantFault", targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation")
public class UpdateRestaurantFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.enjoyreservation.UpdateRestaurantFault updateRestaurantFault;

    public UpdateRestaurantFault_Exception() {
        super();
    }
    
    public UpdateRestaurantFault_Exception(String message) {
        super(message);
    }
    
    public UpdateRestaurantFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateRestaurantFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.UpdateRestaurantFault updateRestaurantFault) {
        super(message);
        this.updateRestaurantFault = updateRestaurantFault;
    }

    public UpdateRestaurantFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.UpdateRestaurantFault updateRestaurantFault, Throwable cause) {
        super(message, cause);
        this.updateRestaurantFault = updateRestaurantFault;
    }

    public it.univaq.disim.sose.cald.enjoyreservation.UpdateRestaurantFault getFaultInfo() {
        return this.updateRestaurantFault;
    }
}
