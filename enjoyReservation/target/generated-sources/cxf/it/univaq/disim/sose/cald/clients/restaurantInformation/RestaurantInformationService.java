package it.univaq.disim.sose.cald.clients.restaurantinformation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-02T16:39:48.085+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "RestaurantInformationService", 
                  wsdlLocation = "file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/clients/restaurantInformation.wsdl",
                  targetNamespace = "http://it.univaq.disim.sose.cald/restaurantInformation") 
public class RestaurantInformationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://it.univaq.disim.sose.cald/restaurantInformation", "RestaurantInformationService");
    public final static QName RestaurantInformationPort = new QName("http://it.univaq.disim.sose.cald/restaurantInformation", "restaurantInformationPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/clients/restaurantInformation.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RestaurantInformationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/clients/restaurantInformation.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RestaurantInformationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RestaurantInformationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RestaurantInformationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public RestaurantInformationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RestaurantInformationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RestaurantInformationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RestaurantInformationPT
     */
    @WebEndpoint(name = "restaurantInformationPort")
    public RestaurantInformationPT getRestaurantInformationPort() {
        return super.getPort(RestaurantInformationPort, RestaurantInformationPT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RestaurantInformationPT
     */
    @WebEndpoint(name = "restaurantInformationPort")
    public RestaurantInformationPT getRestaurantInformationPort(WebServiceFeature... features) {
        return super.getPort(RestaurantInformationPort, RestaurantInformationPT.class, features);
    }

}
