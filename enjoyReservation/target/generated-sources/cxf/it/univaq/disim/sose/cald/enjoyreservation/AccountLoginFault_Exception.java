
package it.univaq.disim.sose.cald.enjoyreservation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-13T16:54:39.647+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "accountLoginFault", targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation")
public class AccountLoginFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.enjoyreservation.AccountLoginFault accountLoginFault;

    public AccountLoginFault_Exception() {
        super();
    }
    
    public AccountLoginFault_Exception(String message) {
        super(message);
    }
    
    public AccountLoginFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountLoginFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.AccountLoginFault accountLoginFault) {
        super(message);
        this.accountLoginFault = accountLoginFault;
    }

    public AccountLoginFault_Exception(String message, it.univaq.disim.sose.cald.enjoyreservation.AccountLoginFault accountLoginFault, Throwable cause) {
        super(message, cause);
        this.accountLoginFault = accountLoginFault;
    }

    public it.univaq.disim.sose.cald.enjoyreservation.AccountLoginFault getFaultInfo() {
        return this.accountLoginFault;
    }
}
