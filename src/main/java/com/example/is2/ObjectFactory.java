//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.02.15 um 02:57:57 PM CET 
//


package com.example.is2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.is2 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.is2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateNettoByEmployeeNameRequest }
     * 
     */
    public CalculateNettoByEmployeeNameRequest createCalculateNettoByEmployeeNameRequest() {
        return new CalculateNettoByEmployeeNameRequest();
    }

    /**
     * Create an instance of {@link CalculateNettoByEmployeeNameResponse }
     * 
     */
    public CalculateNettoByEmployeeNameResponse createCalculateNettoByEmployeeNameResponse() {
        return new CalculateNettoByEmployeeNameResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeRequest }
     * 
     */
    public GetEmployeeRequest createGetEmployeeRequest() {
        return new GetEmployeeRequest();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

}
