
package com.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SOAPMathOps", targetNamespace = "http://example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SOAPMathOps {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "squareIt", targetNamespace = "http://example.com/", className = "com.example.SquareIt")
    @ResponseWrapper(localName = "squareItResponse", targetNamespace = "http://example.com/", className = "com.example.SquareItResponse")
    @Action(input = "http://example.com/SOAPMathOps/squareItRequest", output = "http://example.com/SOAPMathOps/squareItResponse")
    public int squareIt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cubeIt", targetNamespace = "http://example.com/", className = "com.example.CubeIt")
    @ResponseWrapper(localName = "cubeItResponse", targetNamespace = "http://example.com/", className = "com.example.CubeItResponse")
    @Action(input = "http://example.com/SOAPMathOps/cubeItRequest", output = "http://example.com/SOAPMathOps/cubeItResponse")
    public int cubeIt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
