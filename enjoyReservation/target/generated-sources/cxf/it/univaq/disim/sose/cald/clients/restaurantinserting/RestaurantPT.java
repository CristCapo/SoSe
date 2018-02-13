package it.univaq.disim.sose.cald.clients.restaurantinserting;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-13T12:50:47.148+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting", name = "restaurantPT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RestaurantPT {

    @WebMethod
    @Action(input = "http://it.univaq.disim.sose.cald/restaurantInserting/restaurantDeleteRequest", output = "http://it.univaq.disim.sose.cald/restaurantInserting/restaurantDeleteResponse", fault = {})
    @WebResult(name = "restaurantDeleteResponse", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting", partName = "parameters")
    public RestaurantDeleteResponse restaurantDelete(
        @WebParam(partName = "parameters", name = "restaurantDeleteRequest", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting")
        RestaurantDeleteRequest parameters
    ) throws RestaurantDeleteFault_Exception;

    @WebMethod
    @Action(input = "http://it.univaq.disim.sose.cald/restaurantInserting/restaurantInsertRequest", output = "http://it.univaq.disim.sose.cald/restaurantInserting/restaurantInsertResponse", fault = {})
    @WebResult(name = "restaurantInsertResponse", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting", partName = "parameters")
    public RestaurantInsertResponse restaurantInsert(
        @WebParam(partName = "parameters", name = "restaurantInsertRequest", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting")
        RestaurantInsertRequest parameters
    ) throws RestaurantInsertFault_Exception;

    @WebMethod
    @Action(input = "http://it.univaq.disim.sose.cald/restaurantInserting/restaurantUpdateRequest", output = "http://it.univaq.disim.sose.cald/restaurantInserting/restaurantUpdateResponse", fault = {})
    @WebResult(name = "restaurantUpdateResponse", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting", partName = "parameters")
    public RestaurantUpdateResponse restaurantUpdate(
        @WebParam(partName = "parameters", name = "restaurantUpdateRequest", targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInserting")
        RestaurantUpdateRequest parameters
    ) throws RestaurantUpdateFault_Exception;
}
