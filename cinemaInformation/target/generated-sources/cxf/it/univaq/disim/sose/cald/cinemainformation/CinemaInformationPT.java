package it.univaq.disim.sose.cald.cinemainformation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-11T11:38:10.419+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInformation", name = "cinemaInformationPT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CinemaInformationPT {

    @WebMethod
    @WebResult(name = "singleCinemaInformationResponse", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInformation", partName = "parameters")
    public SingleCinemaInformationResponse singleCinemaInformation(
        @WebParam(partName = "parameters", name = "singleCinemaInformationRequest", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInformation")
        SingleCinemaInformationRequest parameters
    ) throws CinemaInformationFault_Exception;

    @WebMethod
    @WebResult(name = "cinemaInformationResponse", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInformation", partName = "parameters")
    public CinemaInformationResponse cinemaInformation(
        @WebParam(partName = "parameters", name = "cinemaInformationRequest", targetNamespace = "http://it.univaq.disim.sose.cald/cinemaInformation")
        CinemaInformationRequest parameters
    ) throws CinemaInformationFault_Exception;
}
