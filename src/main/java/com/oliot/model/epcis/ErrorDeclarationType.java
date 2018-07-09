//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.10 at 02:39:29 PM KST 
//

package com.oliot.model.epcis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for ErrorDeclarationType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDeclarationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="declarationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reason" type="{urn:epcglobal:epcis:xsd:1}ErrorReasonIDType" minOccurs="0"/>
 *         &lt;element name="correctiveEventIDs" type="{urn:epcglobal:epcis:xsd:1}CorrectiveEventIDsType" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}ErrorDeclarationExtensionType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDeclarationType", propOrder = { "declarationTime", "reason", "correctiveEventIDs", "extension",
		"any" })
public class ErrorDeclarationType {

	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar declarationTime;
	protected String reason;
	protected CorrectiveEventIDsType correctiveEventIDs;
	protected ErrorDeclarationExtensionType extension;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the declarationTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDeclarationTime() {
		return declarationTime;
	}

	/**
	 * Sets the value of the declarationTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDeclarationTime(XMLGregorianCalendar value) {
		this.declarationTime = value;
	}

	/**
	 * Gets the value of the reason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the reason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReason(String value) {
		this.reason = value;
	}

	/**
	 * Gets the value of the correctiveEventIDs property.
	 * 
	 * @return possible object is {@link CorrectiveEventIDsType }
	 * 
	 */
	public CorrectiveEventIDsType getCorrectiveEventIDs() {
		return correctiveEventIDs;
	}

	/**
	 * Sets the value of the correctiveEventIDs property.
	 * 
	 * @param value
	 *            allowed object is {@link CorrectiveEventIDsType }
	 * 
	 */
	public void setCorrectiveEventIDs(CorrectiveEventIDsType value) {
		this.correctiveEventIDs = value;
	}

	/**
	 * Gets the value of the extension property.
	 * 
	 * @return possible object is {@link ErrorDeclarationExtensionType }
	 * 
	 */
	public ErrorDeclarationExtensionType getExtension() {
		return extension;
	}

	/**
	 * Sets the value of the extension property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorDeclarationExtensionType }
	 * 
	 */
	public void setExtension(ErrorDeclarationExtensionType value) {
		this.extension = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * {@link Element }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

	public void setAny(List<Object> any) {
		this.any = any;
	}

	public void setOtherAttributes(Map<QName, String> otherAttributes) {
		this.otherAttributes = otherAttributes;
	}

}
