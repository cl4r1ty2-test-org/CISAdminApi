/*******************************************************************************
* Copyright (c) 2014 Cisco Systems
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* PDTool project commiters - initial release
*******************************************************************************/

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
@WebServiceClient(name = "server", targetNamespace = "http://www.compositesw.com/services/system/admin", wsdlLocation = "file:/E:/dev/Workspaces/DeployToolWorkspace/CisAdminApi_6_2/wsdl/CisAdminAPI-6.2.wsdl")
public class Server
    extends Service
{

    private final static URL SERVER_WSDL_LOCATION;
    private final static WebServiceException SERVER_EXCEPTION;
    private final static QName SERVER_QNAME = new QName("http://www.compositesw.com/services/system/admin", "server");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/dev/Workspaces/DeployToolWorkspace/CisAdminApi_6_2/wsdl/CisAdminAPI-6.2.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVER_WSDL_LOCATION = url;
        SERVER_EXCEPTION = e;
    }

    public Server() {
        super(__getWsdlLocation(), SERVER_QNAME);
    }

    public Server(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVER_QNAME, features);
    }

    public Server(URL wsdlLocation) {
        super(wsdlLocation, SERVER_QNAME);
    }

    public Server(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVER_QNAME, features);
    }

    public Server(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Server(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServerPortType
     */
    @WebEndpoint(name = "serverPort")
    public ServerPortType getServerPort() {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "serverPort"), ServerPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerPortType
     */
    @WebEndpoint(name = "serverPort")
    public ServerPortType getServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "serverPort"), ServerPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVER_EXCEPTION!= null) {
            throw SERVER_EXCEPTION;
        }
        return SERVER_WSDL_LOCATION;
    }

}
