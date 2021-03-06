//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 08:39:59 AM EDT 
//


package org.ncpdp.schema.script;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedFillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeniedFillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="ReferenceNumber" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *           &lt;element name="Note" type="{http://www.ncpdp.org/schema/SCRIPT}an..70M"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="FillReasonCode">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;pattern value="AA|AB|AC|AD|AE|AF|AG|AH|AJ|AK|AL|AM|AN|AO|AP"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ReferenceNumber" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *           &lt;element name="Note" type="{http://www.ncpdp.org/schema/SCRIPT}an..70M" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeniedFillType", propOrder = {
    "content"
})
public class DeniedFillType {

    @XmlElementRefs({
        @XmlElementRef(name = "Note", namespace = "http://www.ncpdp.org/schema/SCRIPT", type = JAXBElement.class),
        @XmlElementRef(name = "FillReasonCode", namespace = "http://www.ncpdp.org/schema/SCRIPT", type = JAXBElement.class),
        @XmlElementRef(name = "ReferenceNumber", namespace = "http://www.ncpdp.org/schema/SCRIPT", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "ReferenceNumber" is used by two different parts of a schema. See: 
     * line 4707 of file:/home/tobyc/Downloads/SCRIPT_10.6/SCRIPT_XML_10_6.xsd
     * line 4685 of file:/home/tobyc/Downloads/SCRIPT_10.6/SCRIPT_XML_10_6.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<String>>();
        }
        return this.content;
    }

}
