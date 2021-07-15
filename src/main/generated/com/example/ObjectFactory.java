
package com.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CubeIt_QNAME = new QName("http://example.com/", "cubeIt");
    private final static QName _CubeItResponse_QNAME = new QName("http://example.com/", "cubeItResponse");
    private final static QName _SquareIt_QNAME = new QName("http://example.com/", "squareIt");
    private final static QName _SquareItResponse_QNAME = new QName("http://example.com/", "squareItResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CubeIt }
     * 
     */
    public CubeIt createCubeIt() {
        return new CubeIt();
    }

    /**
     * Create an instance of {@link CubeItResponse }
     * 
     */
    public CubeItResponse createCubeItResponse() {
        return new CubeItResponse();
    }

    /**
     * Create an instance of {@link SquareIt }
     * 
     */
    public SquareIt createSquareIt() {
        return new SquareIt();
    }

    /**
     * Create an instance of {@link SquareItResponse }
     * 
     */
    public SquareItResponse createSquareItResponse() {
        return new SquareItResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CubeIt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CubeIt }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "cubeIt")
    public JAXBElement<CubeIt> createCubeIt(CubeIt value) {
        return new JAXBElement<CubeIt>(_CubeIt_QNAME, CubeIt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CubeItResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CubeItResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "cubeItResponse")
    public JAXBElement<CubeItResponse> createCubeItResponse(CubeItResponse value) {
        return new JAXBElement<CubeItResponse>(_CubeItResponse_QNAME, CubeItResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareIt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SquareIt }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "squareIt")
    public JAXBElement<SquareIt> createSquareIt(SquareIt value) {
        return new JAXBElement<SquareIt>(_SquareIt_QNAME, SquareIt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareItResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SquareItResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "squareItResponse")
    public JAXBElement<SquareItResponse> createSquareItResponse(SquareItResponse value) {
        return new JAXBElement<SquareItResponse>(_SquareItResponse_QNAME, SquareItResponse.class, null, value);
    }

}
