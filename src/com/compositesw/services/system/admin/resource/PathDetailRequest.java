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

package com.compositesw.services.system.admin.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.compositesw.services.system.util.common.BaseRequest;
import com.compositesw.services.system.util.common.DetailLevel;


/**
 * <p>Java class for pathDetailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pathDetailRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.compositesw.com/services/system/util/common}baseRequest">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detail" type="{http://www.compositesw.com/services/system/util/common}detailLevel"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pathDetailRequest", propOrder = {
    "path",
    "detail"
})
@XmlSeeAlso({
    UpdateXQueryProcedureRequest.class,
    UpdateBasicTransformProcedureRequest.class,
    UpdateImplementationContainerRequest.class,
    UpdateSqlScriptProcedureRequest.class,
    UpdateExternalSqlProcedureRequest.class,
    UpdateLinkRequest.class,
    UpdateDefinitionSetRequest.class,
    UpdateStreamTransformProcedureRequest.class,
    GetMostRecentIntrospectionStatusRequest.class,
    UpdateSqlTableRequest.class,
    UpdateXsltTransformProcedureRequest.class,
    UpdateTriggerRequest.class,
    UpdateTransformProcedureRequest.class,
    GetAllResourcesByPathRequest.class,
    UpdateDataSourceRequest.class,
    UpdateXQueryTransformProcedureRequest.class,
    UpdateBasePortRequest.class,
    UpdateOperationProcedureRequest.class
})
public class PathDetailRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected DetailLevel detail;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link DetailLevel }
     *     
     */
    public DetailLevel getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailLevel }
     *     
     */
    public void setDetail(DetailLevel value) {
        this.detail = value;
    }

}
