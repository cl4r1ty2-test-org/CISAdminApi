
package com.compositesw.services.system.admin;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.compositesw.services.system.admin.execute.QueryPlanNode;
import com.compositesw.services.system.admin.execute.RequestStatus;
import com.compositesw.services.system.admin.execute.TabularValue;
import com.compositesw.services.system.admin.execute.ValueList;
import com.compositesw.services.system.admin.resource.ColumnList;
import com.compositesw.services.system.admin.resource.ResourceType;
import com.compositesw.services.system.admin.user.DomainMemberReferenceList;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "executePortType", targetNamespace = "http://www.compositesw.com/services/system/admin")
@XmlSeeAlso({
    com.compositesw.services.system.util.common.ObjectFactory.class,
    com.compositesw.services.system.admin.server.ObjectFactory.class,
    com.compositesw.services.system.util.security.ObjectFactory.class,
    com.compositesw.services.system.admin.archive.ObjectFactory.class,
    com.compositesw.services.system.admin.resource.ObjectFactory.class,
    com.compositesw.services.system.admin.execute.ObjectFactory.class,
    com.compositesw.services.system.admin.user.ObjectFactory.class
})
public interface ExecutePortType {


    /**
     * 
     * @param id
     * @throws CloseResultSoapFault
     */
    @WebMethod(action = "closeResult")
    @RequestWrapper(localName = "closeResult", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.CloseResultRequest")
    @ResponseWrapper(localName = "closeResultResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.CloseResultResponse")
    public void closeResult(
        @WebParam(name = "id", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String id)
        throws CloseResultSoapFault
    ;

    /**
     * 
     * @param result
     * @param requestStatus
     * @param includeMetadata
     * @param users
     * @param rowsAffected
     * @param requestId
     * @param sqlText
     * @param consumeRemainingRows
     * @param isBlocking
     * @param resultId
     * @param skipRows
     * @param dataSourcePath
     * @param maxRows
     * @param groups
     * @param completed
     * @param metadata
     * @throws ExecuteNativeSqlSoapFault
     */
    @WebMethod(action = "executeNativeSql")
    @RequestWrapper(localName = "executeNativeSql", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteNativeSqlRequest")
    @ResponseWrapper(localName = "executeNativeSqlResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteNativeSqlResponse")
    public void executeNativeSql(
        @WebParam(name = "sqlText", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String sqlText,
        @WebParam(name = "isBlocking", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean isBlocking,
        @WebParam(name = "includeMetadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean includeMetadata,
        @WebParam(name = "skipRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Integer skipRows,
        @WebParam(name = "maxRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Integer maxRows,
        @WebParam(name = "consumeRemainingRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean consumeRemainingRows,
        @WebParam(name = "users", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList users,
        @WebParam(name = "groups", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList groups,
        @WebParam(name = "dataSourcePath", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String dataSourcePath,
        @WebParam(name = "completed", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Boolean> completed,
        @WebParam(name = "requestStatus", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<RequestStatus> requestStatus,
        @WebParam(name = "metadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<ColumnList> metadata,
        @WebParam(name = "rowsAffected", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Integer> rowsAffected,
        @WebParam(name = "result", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<TabularValue> result,
        @WebParam(name = "resultId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<String> resultId,
        @WebParam(name = "requestId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Long> requestId)
        throws ExecuteNativeSqlSoapFault
    ;

    /**
     * 
     * @param requestStatus
     * @param includeMetadata
     * @param users
     * @param rowsAffected
     * @param requestId
     * @param isBlocking
     * @param dataServiceName
     * @param resultId
     * @param type
     * @param inputs
     * @param path
     * @param outputs
     * @param groups
     * @param completed
     * @param metadata
     * @throws ExecuteProcedureSoapFault
     */
    @WebMethod(action = "executeProcedure")
    @RequestWrapper(localName = "executeProcedure", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteProcedureRequest")
    @ResponseWrapper(localName = "executeProcedureResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteProcedureResponse")
    public void executeProcedure(
        @WebParam(name = "isBlocking", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean isBlocking,
        @WebParam(name = "includeMetadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean includeMetadata,
        @WebParam(name = "inputs", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        com.compositesw.services.system.admin.execute.ParameterList inputs,
        @WebParam(name = "dataServiceName", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String dataServiceName,
        @WebParam(name = "path", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String path,
        @WebParam(name = "type", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        ResourceType type,
        @WebParam(name = "users", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList users,
        @WebParam(name = "groups", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList groups,
        @WebParam(name = "completed", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Boolean> completed,
        @WebParam(name = "requestStatus", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<RequestStatus> requestStatus,
        @WebParam(name = "metadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<com.compositesw.services.system.admin.resource.ParameterList> metadata,
        @WebParam(name = "rowsAffected", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Integer> rowsAffected,
        @WebParam(name = "outputs", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<ValueList> outputs,
        @WebParam(name = "resultId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<String> resultId,
        @WebParam(name = "requestId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Long> requestId)
        throws ExecuteProcedureSoapFault
    ;

    /**
     * 
     * @param result
     * @param requestStatus
     * @param includeMetadata
     * @param users
     * @param rowsAffected
     * @param requestId
     * @param sqlText
     * @param consumeRemainingRows
     * @param isBlocking
     * @param dataServiceName
     * @param resultId
     * @param skipRows
     * @param maxRows
     * @param groups
     * @param completed
     * @param metadata
     * @throws ExecuteSqlSoapFault
     */
    @WebMethod(action = "executeSql")
    @RequestWrapper(localName = "executeSql", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteSqlRequest")
    @ResponseWrapper(localName = "executeSqlResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteSqlResponse")
    public void executeSql(
        @WebParam(name = "sqlText", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String sqlText,
        @WebParam(name = "isBlocking", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean isBlocking,
        @WebParam(name = "includeMetadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean includeMetadata,
        @WebParam(name = "skipRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Integer skipRows,
        @WebParam(name = "maxRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Integer maxRows,
        @WebParam(name = "consumeRemainingRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean consumeRemainingRows,
        @WebParam(name = "users", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList users,
        @WebParam(name = "groups", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList groups,
        @WebParam(name = "dataServiceName", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String dataServiceName,
        @WebParam(name = "completed", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Boolean> completed,
        @WebParam(name = "requestStatus", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<RequestStatus> requestStatus,
        @WebParam(name = "metadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<ColumnList> metadata,
        @WebParam(name = "rowsAffected", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Integer> rowsAffected,
        @WebParam(name = "result", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<TabularValue> result,
        @WebParam(name = "resultId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<String> resultId,
        @WebParam(name = "requestId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Long> requestId)
        throws ExecuteSqlSoapFault
    ;

    /**
     * 
     * @param requestStatus
     * @param includeMetadata
     * @param users
     * @param rowsAffected
     * @param requestId
     * @param isBlocking
     * @param scriptText
     * @param resultId
     * @param inputs
     * @param outputs
     * @param groups
     * @param completed
     * @param metadata
     * @throws ExecuteSqlScriptSoapFault
     */
    @WebMethod(action = "executeSqlScript")
    @RequestWrapper(localName = "executeSqlScript", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteSqlScriptRequest")
    @ResponseWrapper(localName = "executeSqlScriptResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ExecuteSqlScriptResponse")
    public void executeSqlScript(
        @WebParam(name = "isBlocking", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean isBlocking,
        @WebParam(name = "includeMetadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean includeMetadata,
        @WebParam(name = "inputs", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        com.compositesw.services.system.admin.execute.ParameterList inputs,
        @WebParam(name = "scriptText", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String scriptText,
        @WebParam(name = "users", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList users,
        @WebParam(name = "groups", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        DomainMemberReferenceList groups,
        @WebParam(name = "completed", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Boolean> completed,
        @WebParam(name = "requestStatus", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<RequestStatus> requestStatus,
        @WebParam(name = "metadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<com.compositesw.services.system.admin.resource.ParameterList> metadata,
        @WebParam(name = "rowsAffected", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Integer> rowsAffected,
        @WebParam(name = "outputs", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<ValueList> outputs,
        @WebParam(name = "resultId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<String> resultId,
        @WebParam(name = "requestId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Long> requestId)
        throws ExecuteSqlScriptSoapFault
    ;

    /**
     * 
     * @param requestStatus
     * @param rowsAffected
     * @param includeMetadata
     * @param isBlocking
     * @param outputs
     * @param resultId
     * @param metadata
     * @param completed
     * @throws GetProceduralResultSoapFault
     */
    @WebMethod(action = "getProceduralResult")
    @RequestWrapper(localName = "getProceduralResult", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetProceduralResultRequest")
    @ResponseWrapper(localName = "getProceduralResultResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetProceduralResultResponse")
    public void getProceduralResult(
        @WebParam(name = "resultId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String resultId,
        @WebParam(name = "isBlocking", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        boolean isBlocking,
        @WebParam(name = "includeMetadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean includeMetadata,
        @WebParam(name = "completed", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Boolean> completed,
        @WebParam(name = "requestStatus", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<RequestStatus> requestStatus,
        @WebParam(name = "metadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<com.compositesw.services.system.admin.resource.ParameterList> metadata,
        @WebParam(name = "rowsAffected", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Integer> rowsAffected,
        @WebParam(name = "outputs", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<ValueList> outputs)
        throws GetProceduralResultSoapFault
    ;

    /**
     * 
     * @param rootNodeTitle
     * @param path
     * @param parameters
     * @param type
     * @return
     *     returns com.compositesw.services.system.admin.execute.QueryPlanNode
     * @throws GetResourcePlanSoapFault
     */
    @WebMethod(action = "getResourcePlan")
    @WebResult(name = "queryPlanRoot", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
    @RequestWrapper(localName = "getResourcePlan", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetResourcePlanRequest")
    @ResponseWrapper(localName = "getResourcePlanResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetResourcePlanResponse")
    public QueryPlanNode getResourcePlan(
        @WebParam(name = "rootNodeTitle", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String rootNodeTitle,
        @WebParam(name = "path", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String path,
        @WebParam(name = "type", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        ResourceType type,
        @WebParam(name = "parameters", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        com.compositesw.services.system.admin.execute.ParameterList parameters)
        throws GetResourcePlanSoapFault
    ;

    /**
     * 
     * @param rootNodeTitle
     * @param resultId
     * @return
     *     returns com.compositesw.services.system.admin.execute.QueryPlanNode
     * @throws GetResultSetPlanSoapFault
     */
    @WebMethod(action = "getResultSetPlan")
    @WebResult(name = "queryPlanRoot", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
    @RequestWrapper(localName = "getResultSetPlan", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetResultSetPlanRequest")
    @ResponseWrapper(localName = "getResultSetPlanResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetResultSetPlanResponse")
    public QueryPlanNode getResultSetPlan(
        @WebParam(name = "rootNodeTitle", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String rootNodeTitle,
        @WebParam(name = "resultId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String resultId)
        throws GetResultSetPlanSoapFault
    ;

    /**
     * 
     * @param rootNodeTitle
     * @param sqlText
     * @param parameters
     * @return
     *     returns com.compositesw.services.system.admin.execute.QueryPlanNode
     * @throws GetSqlPlanSoapFault
     */
    @WebMethod(action = "getSqlPlan")
    @WebResult(name = "queryPlanRoot", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
    @RequestWrapper(localName = "getSqlPlan", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetSqlPlanRequest")
    @ResponseWrapper(localName = "getSqlPlanResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetSqlPlanResponse")
    public QueryPlanNode getSqlPlan(
        @WebParam(name = "rootNodeTitle", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String rootNodeTitle,
        @WebParam(name = "sqlText", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String sqlText,
        @WebParam(name = "parameters", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        com.compositesw.services.system.admin.execute.ParameterList parameters)
        throws GetSqlPlanSoapFault
    ;

    /**
     * 
     * @param result
     * @param requestStatus
     * @param rowsAffected
     * @param skipRows
     * @param includeMetadata
     * @param consumeRemainingRows
     * @param maxRows
     * @param isBlocking
     * @param resultId
     * @param metadata
     * @param completed
     * @throws GetTabularResultSoapFault
     */
    @WebMethod(action = "getTabularResult")
    @RequestWrapper(localName = "getTabularResult", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetTabularResultRequest")
    @ResponseWrapper(localName = "getTabularResultResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.GetTabularResultResponse")
    public void getTabularResult(
        @WebParam(name = "resultId", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String resultId,
        @WebParam(name = "isBlocking", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean isBlocking,
        @WebParam(name = "includeMetadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean includeMetadata,
        @WebParam(name = "skipRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Integer skipRows,
        @WebParam(name = "maxRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Integer maxRows,
        @WebParam(name = "consumeRemainingRows", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        Boolean consumeRemainingRows,
        @WebParam(name = "completed", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Boolean> completed,
        @WebParam(name = "requestStatus", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<RequestStatus> requestStatus,
        @WebParam(name = "metadata", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<ColumnList> metadata,
        @WebParam(name = "rowsAffected", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<Integer> rowsAffected,
        @WebParam(name = "result", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", mode = WebParam.Mode.OUT)
        Holder<TabularValue> result)
        throws GetTabularResultSoapFault
    ;

    /**
     * 
     * @param sqlText
     * @throws ParseSqlQuerySoapFault
     */
    @WebMethod(action = "parseSqlQuery")
    @RequestWrapper(localName = "parseSqlQuery", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ParseSqlQueryRequest")
    @ResponseWrapper(localName = "parseSqlQueryResponse", targetNamespace = "http://www.compositesw.com/services/system/admin/execute", className = "com.compositesw.services.system.admin.execute.ParseSqlQueryResponse")
    public void parseSqlQuery(
        @WebParam(name = "sqlText", targetNamespace = "http://www.compositesw.com/services/system/admin/execute")
        String sqlText)
        throws ParseSqlQuerySoapFault
    ;

}
