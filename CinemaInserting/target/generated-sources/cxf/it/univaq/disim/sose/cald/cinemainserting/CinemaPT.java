package it.univaq.disim.sose.cald.cinemainserting;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-15T15:08:21.039+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting", name = "cinemaPT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CinemaPT {

    @WebMethod
    @Action(input = "http://it.univaq.disim.sose.cald/cinemaInserting/cinemaInsertRequest", output = "http://it.univaq.disim.sose.cald/cinemaInserting/cinemaInsertResponse", fault = {})
    @WebResult(name = "cinemaInsertResponse", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting", partName = "parameters")
    public CinemaInsertResponse cinemaInsert(
        @WebParam(partName = "parameters", name = "cinemaInsertRequest", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting")
        CinemaInsertRequest parameters
    ) throws CinemaInsertFault_Exception;

    @WebMethod
    @Action(input = "http://it.univaq.disim.sose.cald/cinemaInserting/cinemaUpdateRequest", output = "http://it.univaq.disim.sose.cald/cinemaInserting/cinemaUpdateResponse", fault = {})
    @WebResult(name = "cinemaUpdateResponse", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting", partName = "parameters")
    public CinemaUpdateResponse cinemaUpdate(
        @WebParam(partName = "parameters", name = "cinemaUpdateRequest", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting")
        CinemaUpdateRequest parameters
    ) throws CinemaUpdateFault_Exception;

    @WebMethod
    @Action(input = "http://it.univaq.disim.sose.cald/cinemaInserting/cinemaDeleteRequest", output = "http://it.univaq.disim.sose.cald/cinemaInserting/cinemaDeleteResponse", fault = {})
    @WebResult(name = "cinemaDeleteResponse", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting", partName = "parameters")
    public CinemaDeleteResponse cinemaDelete(
        @WebParam(partName = "parameters", name = "cinemaDeleteRequest", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInserting")
        CinemaDeleteRequest parameters
    ) throws CinemaDeleteFault_Exception;
}
