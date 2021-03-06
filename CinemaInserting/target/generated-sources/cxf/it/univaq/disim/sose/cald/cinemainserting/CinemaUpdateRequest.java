
package it.univaq.disim.sose.cald.cinemainserting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cinemaUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cinemaUpdateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cinema" type="{http://it.univaq.disim.sose.cald/cinemaInserting}cinemaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cinemaUpdateRequest", propOrder = {
    "cinema"
})
public class CinemaUpdateRequest {

    @XmlElement(required = true)
    protected CinemaType cinema;

    /**
     * Gets the value of the cinema property.
     * 
     * @return
     *     possible object is
     *     {@link CinemaType }
     *     
     */
    public CinemaType getCinema() {
        return cinema;
    }

    /**
     * Sets the value of the cinema property.
     * 
     * @param value
     *     allowed object is
     *     {@link CinemaType }
     *     
     */
    public void setCinema(CinemaType value) {
        this.cinema = value;
    }

}
