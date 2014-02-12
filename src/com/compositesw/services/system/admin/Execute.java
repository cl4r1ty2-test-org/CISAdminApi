
package com.compositesw.services.system.admin;

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
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "execute", targetNamespace = "http://www.compositesw.com/services/system/admin", wsdlLocation = "file:/E:/dev/Workspaces/DeployToolWorkspace/CisAdminApi_6_2/wsdl/CisAdminAPI-6.2.wsdl")
public class Execute
    extends Service
{

    private final static URL EXECUTE_WSDL_LOCATION;
    private final static WebServiceException EXECUTE_EXCEPTION;
    private final static QName EXECUTE_QNAME = new QName("http://www.compositesw.com/services/system/admin", "execute");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/dev/Workspaces/DeployToolWorkspace/CisAdminApi_6_2/wsdl/CisAdminAPI-6.2.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXECUTE_WSDL_LOCATION = url;
        EXECUTE_EXCEPTION = e;
    }

    public Execute() {
        super(__getWsdlLocation(), EXECUTE_QNAME);
    }

    public Execute(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXECUTE_QNAME, features);
    }

    public Execute(URL wsdlLocation) {
        super(wsdlLocation, EXECUTE_QNAME);
    }

    public Execute(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXECUTE_QNAME, features);
    }

    public Execute(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Execute(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExecutePortType
     */
    @WebEndpoint(name = "executePort")
    public ExecutePortType getExecutePort() {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "executePort"), ExecutePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExecutePortType
     */
    @WebEndpoint(name = "executePort")
    public ExecutePortType getExecutePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "executePort"), ExecutePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXECUTE_EXCEPTION!= null) {
            throw EXECUTE_EXCEPTION;
        }
        return EXECUTE_WSDL_LOCATION;
    }

}
