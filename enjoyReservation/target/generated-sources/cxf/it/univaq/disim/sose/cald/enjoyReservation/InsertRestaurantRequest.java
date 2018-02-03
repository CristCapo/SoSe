
package it.univaq.disim.sose.cald.enjoyReservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertRestaurantRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertRestaurantRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restaurant" type="{http://it.univaq.disim.sose.cald/enjoyReservation}restaurantType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertRestaurantRequest", propOrder = {
    "restaurant"
})
public class InsertRestaurantRequest {

    @XmlElement(required = true)
    protected RestaurantType restaurant;

    /**
     * Gets the value of the restaurant property.
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType }
     *     
     */
    public RestaurantType getRestaurant() {
        return restaurant;
    }

    /**
     * Sets the value of the restaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType }
     *     
     */
    public void setRestaurant(RestaurantType value) {
        this.restaurant = value;
    }

}
