
package it.univaq.disim.sose.cald.enjoyreservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-13T16:54:39.621+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "accountSessionFault", targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation")
public class AccountSessionFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.enjoyreservation.AccountSessionFault accountSessionFault;

    public AccountSessionFault_Exception() {
        super();
    }
    
    public AccountSessionFault_Exception(String message) {
        super(message);
    }
    
    public AccountSessionFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountSessionFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.AccountSessionFault accountSessionFault) {
        super(message);
        this.accountSessionFault = accountSessionFault;
    }

    public AccountSessionFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.AccountSessionFault accountSessionFault, Throwable cause) {
        super(message, cause);
        this.accountSessionFault = accountSessionFault;
    }

    public it.univaq.disim.sose.cald.enjoyreservation.AccountSessionFault getFaultInfo() {
        return this.accountSessionFault;
    }
}
