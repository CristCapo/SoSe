package it.univaq.disim.sose.cald.clients.accountmanager;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-14T17:20:34.616+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://it.univaq.disim.sose.cald/accountManager", name = "accountManagerPT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AccountManagerPT {

    @WebMethod
    @WebResult(name = "userLoginResponse", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager", partName = "parameters")
    public UserLoginResponse userLogin(
        @WebParam(partName = "parameters", name = "userLoginRequest", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager")
        UserLoginRequest parameters
    ) throws UserLoginFault_Exception;

    @WebMethod
    @WebResult(name = "checkRestaurantOwnerResponse", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager", partName = "parameters")
    public CheckRestaurantOwnerResponse checkRestaurantOwner(
        @WebParam(partName = "parameters", name = "checkRestaurantOwnerRequest", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager")
        CheckRestaurantOwnerRequest parameters
    ) throws CheckRestaurantOwnerFault_Exception;

    @WebMethod
    @WebResult(name = "userSignupResponse", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager", partName = "parameters")
    public UserSignupResponse userSignup(
        @WebParam(partName = "parameters", name = "userSignupRequest", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager")
        UserSignupRequest parameters
    ) throws UserSignupFault_Exception;

    @WebMethod
    @WebResult(name = "checkCinemaOwnerResponse", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager", partName = "parameters")
    public CheckCinemaOwnerResponse checkCinemaOwner(
        @WebParam(partName = "parameters", name = "checkCinemaOwnerRequest", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager")
        CheckCinemaOwnerRequest parameters
    ) throws CheckCinemaOwnerFault_Exception;

    @WebMethod
    @WebResult(name = "userLogoutResponse", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager", partName = "parameters")
    public UserLogoutResponse userLogout(
        @WebParam(partName = "parameters", name = "userLogoutRequest", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager")
        UserLogoutRequest parameters
    ) throws UserLogoutFault_Exception;

    @WebMethod
    @WebResult(name = "checkSessionResponse", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager", partName = "parameters")
    public CheckSessionResponse checkSession(
        @WebParam(partName = "parameters", name = "checkSessionRequest", targetNamespace = "http://it.univaq.disim.sose.cald/accountManager")
        CheckSessionRequest parameters
    ) throws CheckSessionFault_Exception;
}
