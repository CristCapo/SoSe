
package it.univaq.disim.sose.cald.clients.cinemainserting;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-15T15:08:13.618+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "cinemaDeleteFault", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting")
public class CinemaDeleteFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.clients.cinemainserting.CinemaDeleteFault cinemaDeleteFault;

    public CinemaDeleteFault_Exception() {
        super();
    }
    
    public CinemaDeleteFault_Exception(String message) {
        super(message);
    }
    
    public CinemaDeleteFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CinemaDeleteFault_Exception(String message, it.univaq.disim.sose.cald.clients.cinemainserting.CinemaDeleteFault cinemaDeleteFault) {
        super(message);
        this.cinemaDeleteFault = cinemaDeleteFault;
    }

    public CinemaDeleteFault_Exception(String message, it.univaq.disim.sose.cald.clients.cinemainserting.CinemaDeleteFault cinemaDeleteFault, Throwable cause) {
        super(message, cause);
        this.cinemaDeleteFault = cinemaDeleteFault;
    }

    public it.univaq.disim.sose.cald.clients.cinemainserting.CinemaDeleteFault getFaultInfo() {
        return this.cinemaDeleteFault;
    }
}
