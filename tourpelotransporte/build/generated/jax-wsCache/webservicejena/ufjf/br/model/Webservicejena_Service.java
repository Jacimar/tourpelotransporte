
package ufjf.br.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "webservicejena", targetNamespace = "http://model.br.ufjf/", wsdlLocation = "http://localhost:8080/webservicetransporte/webservicejena?wsdl")
public class Webservicejena_Service
    extends Service
{

    private final static URL WEBSERVICEJENA_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICEJENA_EXCEPTION;
    private final static QName WEBSERVICEJENA_QNAME = new QName("http://model.br.ufjf/", "webservicejena");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/webservicetransporte/webservicejena?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEJENA_WSDL_LOCATION = url;
        WEBSERVICEJENA_EXCEPTION = e;
    }

    public Webservicejena_Service() {
        super(__getWsdlLocation(), WEBSERVICEJENA_QNAME);
    }

    public Webservicejena_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEJENA_QNAME, features);
    }

    public Webservicejena_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEJENA_QNAME);
    }

    public Webservicejena_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEJENA_QNAME, features);
    }

    public Webservicejena_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Webservicejena_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Webservicejena
     */
    @WebEndpoint(name = "webservicejenaPort")
    public Webservicejena getWebservicejenaPort() {
        return super.getPort(new QName("http://model.br.ufjf/", "webservicejenaPort"), Webservicejena.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Webservicejena
     */
    @WebEndpoint(name = "webservicejenaPort")
    public Webservicejena getWebservicejenaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://model.br.ufjf/", "webservicejenaPort"), Webservicejena.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEJENA_EXCEPTION!= null) {
            throw WEBSERVICEJENA_EXCEPTION;
        }
        return WEBSERVICEJENA_WSDL_LOCATION;
    }

}
