package org.gs1.epcglobal.epcis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

//import org.gs1.smartcity.datatype.bus.event.BusExtension;
//import org.gs1.smartcity.datatype.bus.event.DriverExtension;
import org.w3c.dom.Element;


/**
 * 
 *       Object Event captures information about an event pertaining to one or more
 *       objects identified by EPCs.
 *              
 * 
 * <p>ObjectEventType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="ObjectEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:epcglobal:epcis:xsd:1}EPCISEventType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="epcList" type="{urn:epcglobal:epcis:xsd:1}EPCListType"/&gt;
 *         &lt;element name="action" type="{urn:epcglobal:epcis:xsd:1}ActionType"/&gt;
 *         &lt;element name="bizStep" type="{urn:epcglobal:epcis:xsd:1}BusinessStepIDType" minOccurs="0"/&gt;
 *         &lt;element name="disposition" type="{urn:epcglobal:epcis:xsd:1}DispositionIDType" minOccurs="0"/&gt;
 *         &lt;element name="readPoint" type="{urn:epcglobal:epcis:xsd:1}ReadPointType" minOccurs="0"/&gt;
 *         &lt;element name="bizLocation" type="{urn:epcglobal:epcis:xsd:1}BusinessLocationType" minOccurs="0"/&gt;
 *         &lt;element name="bizTransactionList" type="{urn:epcglobal:epcis:xsd:1}BusinessTransactionListType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}ObjectEventExtensionType" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectEvent", propOrder = {
    "epcList",
    "action",
    "bizStep",
    "disposition",
    "readPoint",
    "bizLocation",
    "bizTransactionList",
    "extension",
    "busExtension",
    "driverExtension",
    "anies"
})
@XmlRootElement(name = "ObjectEvent")
public class ObjectEvent extends EPCISEventType {

		@XmlElement(required = true)
		protected EPCListType epcList;
		@XmlElement(required = true)
		protected ActionType action;
		protected String bizStep;
		protected String disposition;
		protected ReadPointType readPoint;
		protected BusinessLocationType bizLocation;
		protected BusinessTransactionListType bizTransactionList;
		protected ObjectEventExtensionType extension;
		@XmlAnyElement(lax = true)
		protected List<Object> any;

		/**
		 * Gets the value of the epcList property.
		 * 
		 * @return possible object is {@link EPCListType }
		 * 
		 */
		public EPCListType getEpcList() {
			return epcList;
		}

		/**
		 * Sets the value of the epcList property.
		 * 
		 * @param value
		 *            allowed object is {@link EPCListType }
		 * 
		 */
		public void setEpcList(EPCListType value) {
			this.epcList = value;
		}

		/**
		 * Gets the value of the action property.
		 * 
		 * @return possible object is {@link ActionType }
		 * 
		 */
		public ActionType getAction() {
			return action;
		}

		/**
		 * Sets the value of the action property.
		 * 
		 * @param value
		 *            allowed object is {@link ActionType }
		 * 
		 */
		public void setAction(ActionType value) {
			this.action = value;
		}

		/**
		 * Gets the value of the bizStep property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBizStep() {
			return bizStep;
		}

		/**
		 * Sets the value of the bizStep property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBizStep(String value) {
			this.bizStep = value;
		}

		/**
		 * Gets the value of the disposition property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDisposition() {
			return disposition;
		}

		/**
		 * Sets the value of the disposition property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDisposition(String value) {
			this.disposition = value;
		}

		/**
		 * Gets the value of the readPoint property.
		 * 
		 * @return possible object is {@link ReadPointType }
		 * 
		 */
		public ReadPointType getReadPoint() {
			return readPoint;
		}

		/**
		 * Sets the value of the readPoint property.
		 * 
		 * @param value
		 *            allowed object is {@link ReadPointType }
		 * 
		 */
		public void setReadPoint(ReadPointType value) {
			this.readPoint = value;
		}

		/**
		 * Gets the value of the bizLocation property.
		 * 
		 * @return possible object is {@link BusinessLocationType }
		 * 
		 */
		public BusinessLocationType getBizLocation() {
			return bizLocation;
		}

		/**
		 * Sets the value of the bizLocation property.
		 * 
		 * @param value
		 *            allowed object is {@link BusinessLocationType }
		 * 
		 */
		public void setBizLocation(BusinessLocationType value) {
			this.bizLocation = value;
		}

		/**
		 * Gets the value of the bizTransactionList property.
		 * 
		 * @return possible object is {@link BusinessTransactionListType }
		 * 
		 */
		public BusinessTransactionListType getBizTransactionList() {
			return bizTransactionList;
		}

		/**
		 * Sets the value of the bizTransactionList property.
		 * 
		 * @param value
		 *            allowed object is {@link BusinessTransactionListType }
		 * 
		 */
		public void setBizTransactionList(BusinessTransactionListType value) {
			this.bizTransactionList = value;
		}

		/**
		 * Gets the value of the extension property.
		 * 
		 * @return possible object is {@link ObjectEventExtensionType }
		 * 
		 */
		public ObjectEventExtensionType getExtension() {
			return extension;
		}

		/**
		 * Sets the value of the extension property.
		 * 
		 * @param value
		 *            allowed object is {@link ObjectEventExtensionType }
		 * 
		 */
		public void setExtension(ObjectEventExtensionType value) {
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

		public void setAny(List<Object> any) {
			this.any = any;
		}

	}

