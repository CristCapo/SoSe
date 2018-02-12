
package it.univaq.disim.sose.cald.clients.accountmanager;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-12T22:48:27.536+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "userSignupFault", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager")
public class UserSignupFault_Exception extends Exception {
    public static final long serialVersionUID = 1L;
    
    private it.univaq.disim.sose.cald.clients.accountmanager.UserSignupFault userSignupFault;

    public UserSignupFault_Exception() {
        super();
    }
    
    public UserSignupFault_Exception(String message) {
        super(message);
    }
    
    public UserSignupFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UserSignupFault_Exception(String message, it.univaq.disim.sose.cald.clients.accountmanager.UserSignupFault userSignupFault) {
        super(message);
        this.userSignupFault = userSignupFault;
    }

    public UserSignupFault_Exception(String message, it.univaq.disim.sose.cald.clients.accountmanager.UserSignupFault userSignupFault, Throwable cause) {
        super(message, cause);
        this.userSignupFault = userSignupFault;
    }

    public it.univaq.disim.sose.cald.clients.accountmanager.UserSignupFault getFaultInfo() {
        return this.userSignupFault;
    }
}
