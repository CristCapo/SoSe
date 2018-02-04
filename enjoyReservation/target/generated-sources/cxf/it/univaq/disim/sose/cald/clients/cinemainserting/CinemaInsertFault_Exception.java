
package it.univaq.disim.sose.cald.clients.cinemainserting;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-03T11:03:12.358+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "cinemaInsertFault", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting")
public class CinemaInsertFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.clients.cinemainserting.CinemaInsertFault cinemaInsertFault;

    public CinemaInsertFault_Exception() {
        super();
    }
    
    public CinemaInsertFault_Exception(String message) {
        super(message);
    }
    
    public CinemaInsertFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CinemaInsertFault_Exception(String message, it.univaq.disim.sose.cald.clients.cinemainserting.CinemaInsertFault cinemaInsertFault) {
        super(message);
        this.cinemaInsertFault = cinemaInsertFault;
    }

    public CinemaInsertFault_Exception(String message, it.univaq.disim.sose.cald.clients.cinemainserting.CinemaInsertFault cinemaInsertFault, Throwable cause) {
        super(message, cause);
        this.cinemaInsertFault = cinemaInsertFault;
    }

    public it.univaq.disim.sose.cald.clients.cinemainserting.CinemaInsertFault getFaultInfo() {
        return this.cinemaInsertFault;
    }
}