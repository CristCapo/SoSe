package it.univaq.disim.sose.cald.clients.accountmanager;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-12T22:48:27.581+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "AccountManagerService", 
                  wsdlLocation = "file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/clients/accountManager.wsdl",
                  targetNamespace = "http://it.univaq.disim.sose.cald/accountManager") 
public class AccountManagerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://it.univaq.disim.sose.cald/accountManager", "AccountManagerService");
    public final static QName AccountManagerPort = new QName("http://it.univaq.disim.sose.cald/accountManager", "accountManagerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/clients/accountManager.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AccountManagerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/Luca/Documents/Università/Magistrale/Primo%20Anno/Primo%20Semestre/Service-Oriented%20Software%20Engineering/Progetto/SoSe/enjoyreservation/src/main/resources/clients/accountManager.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AccountManagerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccountManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountManagerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AccountManagerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AccountManagerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AccountManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AccountManagerPT
     */
    @WebEndpoint(name = "accountManagerPort")
    public AccountManagerPT getAccountManagerPort() {
        return super.getPort(AccountManagerPort, AccountManagerPT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountManagerPT
     */
    @WebEndpoint(name = "accountManagerPort")
    public AccountManagerPT getAccountManagerPort(WebServiceFeature... features) {
        return super.getPort(AccountManagerPort, AccountManagerPT.class, features);
    }

}
