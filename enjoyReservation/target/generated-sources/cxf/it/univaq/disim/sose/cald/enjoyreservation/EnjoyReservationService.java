package it.univaq.disim.sose.cald.enjoyreservation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-10T22:59:48.568+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "EnjoyReservationService", 
                  wsdlLocation = "file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/enjoyReservation.wsdl",
                  targetNamespace = "http://it.univaq.disim.sose.cald/enjoyReservation") 
public class EnjoyReservationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://it.univaq.disim.sose.cald/enjoyReservation", "EnjoyReservationService");
    public final static QName EnjoyReservationPort = new QName("http://it.univaq.disim.sose.cald/enjoyReservation", "enjoyReservationPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/enjoyReservation.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EnjoyReservationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/enjoyReservation.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EnjoyReservationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EnjoyReservationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EnjoyReservationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public EnjoyReservationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EnjoyReservationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EnjoyReservationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns EnjoyReservationPT
     */
    @WebEndpoint(name = "enjoyReservationPort")
    public EnjoyReservationPT getEnjoyReservationPort() {
        return super.getPort(EnjoyReservationPort, EnjoyReservationPT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EnjoyReservationPT
     */
    @WebEndpoint(name = "enjoyReservationPort")
    public EnjoyReservationPT getEnjoyReservationPort(WebServiceFeature... features) {
        return super.getPort(EnjoyReservationPort, EnjoyReservationPT.class, features);
    }

}
