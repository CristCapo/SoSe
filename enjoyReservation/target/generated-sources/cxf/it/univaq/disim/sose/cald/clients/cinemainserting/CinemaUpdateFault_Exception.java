
package it.univaq.disim.sose.cald.clients.cinemainserting;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-12T16:16:24.877+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "cinemaUpdateFault", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting")
public class CinemaUpdateFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.clients.cinemainserting.CinemaUpdateFault cinemaUpdateFault;

    public CinemaUpdateFault_Exception() {
        super();
    }
    
    public CinemaUpdateFault_Exception(String message) {
        super(message);
    }
    
    public CinemaUpdateFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CinemaUpdateFault_Exception(String message, it.univaq.disim.sose.cald.clients.cinemainserting.CinemaUpdateFault cinemaUpdateFault) {
        super(message);
        this.cinemaUpdateFault = cinemaUpdateFault;
    }

    public CinemaUpdateFault_Exception(String message, it.univaq.disim.sose.cald.clients.cinemainserting.CinemaUpdateFault cinemaUpdateFault, Throwable cause) {
        super(message, cause);
        this.cinemaUpdateFault = cinemaUpdateFault;
    }

    public it.univaq.disim.sose.cald.clients.cinemainserting.CinemaUpdateFault getFaultInfo() {
        return this.cinemaUpdateFault;
    }
}
