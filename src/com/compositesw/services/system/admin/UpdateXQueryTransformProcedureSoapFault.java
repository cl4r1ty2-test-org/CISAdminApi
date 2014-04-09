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

import javax.xml.ws.WebFault;
import com.compositesw.services.system.util.common.Fault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "fault", targetNamespace = "http://www.compositesw.com/services/system/util/common")
public class UpdateXQueryTransformProcedureSoapFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Fault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UpdateXQueryTransformProcedureSoapFault(String message, Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UpdateXQueryTransformProcedureSoapFault(String message, Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.compositesw.services.system.util.common.Fault
     */
    public Fault getFaultInfo() {
        return faultInfo;
    }

}
