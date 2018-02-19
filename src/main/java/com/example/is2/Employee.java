//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.02.15 um 02:57:57 PM CET 
//


package com.example.is2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für employee complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="beruf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jahresgehalt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "name",
    "vorname",
    "alter",
    "beruf",
    "jahresgehalt"
})
public class Employee {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String vorname;
    protected int alter;
    @XmlElement(required = true)
    protected String beruf;
    protected int jahresgehalt;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der vorname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Legt den Wert der vorname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Ruft den Wert der alter-Eigenschaft ab.
     * 
     */
    public int getAlter() {
        return alter;
    }

    /**
     * Legt den Wert der alter-Eigenschaft fest.
     * 
     */
    public void setAlter(int value) {
        this.alter = value;
    }

    /**
     * Ruft den Wert der beruf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeruf() {
        return beruf;
    }

    /**
     * Legt den Wert der beruf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeruf(String value) {
        this.beruf = value;
    }

    /**
     * Ruft den Wert der jahresgehalt-Eigenschaft ab.
     * 
     */
    public int getJahresgehalt() {
        return jahresgehalt;
    }

    /**
     * Legt den Wert der jahresgehalt-Eigenschaft fest.
     * 
     */
    public void setJahresgehalt(int value) {
        this.jahresgehalt = value;
    }

}
