
package ec.gob.dinardap.interoperacion.interoperadorws.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fichaGeneral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fichaGeneral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instituciones" type="{http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/}institucion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fichaGeneral", propOrder = {
    "codigoPaquete",
    "instituciones",
    "mensaje"
})
public class FichaGeneral {

    protected String codigoPaquete;
    @XmlElement(nillable = true)
    protected List<Institucion> instituciones;
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad codigoPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    /**
     * Define el valor de la propiedad codigoPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaquete(String value) {
        this.codigoPaquete = value;
    }

    /**
     * Gets the value of the instituciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instituciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstituciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Institucion }
     * 
     * 
     */
    public List<Institucion> getInstituciones() {
        if (instituciones == null) {
            instituciones = new ArrayList<Institucion>();
        }
        return this.instituciones;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
