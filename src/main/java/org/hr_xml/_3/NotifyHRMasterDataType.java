//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.BusinessObjectDocumentType;


/**
 *  
 *        NotifyHRMasterData is used to inform the receiving party that an event related to a HRMasterData has occurred or 
 *        a HRMasterData has been created or modified. 
 * 
 *        HRMasterData  Contains a broad set of information about a human resource. HRMasterData is not limited to a particular domain (for example, EPMParticipant and IndicativeData). Used to provision or synchronize data between and among HR systems. 
 * 
 *        Notify is a "Action Verb". ActionExpression(s) represent and communicate data management  
 *        instructions. XPath is the default expression language. The actionCode attribute (Add, Change, Delete,   
 *        Replace) specifies the action taken. The data entities being managed are represented as elements  
 *        of the HRMasterData noun in the BOD instance. 
 *        
 * 
 * <p>Java class for NotifyHRMasterDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyHRMasterDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/9}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.hr-xml.org/3}NotifyHRMasterDataDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyHRMasterDataType", propOrder = {
    "dataArea"
})
public class NotifyHRMasterDataType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected NotifyHRMasterDataDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyHRMasterDataDataAreaType }
     *     
     */
    public NotifyHRMasterDataDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyHRMasterDataDataAreaType }
     *     
     */
    public void setDataArea(NotifyHRMasterDataDataAreaType value) {
        this.dataArea = value;
    }

}
