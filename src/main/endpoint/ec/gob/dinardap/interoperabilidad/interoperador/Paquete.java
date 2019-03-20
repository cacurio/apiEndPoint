
package ec.gob.dinardap.interoperabilidad.interoperador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paquete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paquete"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entidades" type="{http://interoperabilidad.dinardap.gob.ec/interoperador/}entidades" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paquete", propOrder = {
    "numeroPaquete",
    "entidades"
})
public class Paquete {

    protected String numeroPaquete;
    protected Entidades entidades;

    /**
     * Obtiene el valor de la propiedad numeroPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPaquete() {
        return numeroPaquete;
    }

    /**
     * Define el valor de la propiedad numeroPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPaquete(String value) {
        this.numeroPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad entidades.
     * 
     * @return
     *     possible object is
     *     {@link Entidades }
     *     
     */
    public Entidades getEntidades() {
        return entidades;
    }

    /**
     * Define el valor de la propiedad entidades.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidades }
     *     
     */
    public void setEntidades(Entidades value) {
        this.entidades = value;
    }

}
