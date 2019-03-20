
package ec.gob.dinardap.interoperacion.interoperadorws.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para institucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="institucion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosPrincipales" type="{http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/}datosPrincipales" minOccurs="0"/&gt;
 *         &lt;element name="detalle" type="{http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/}detalle" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "institucion", propOrder = {
    "datosPrincipales",
    "detalle",
    "mensaje",
    "nombre"
})
public class Institucion {

    protected DatosPrincipales datosPrincipales;
    protected Detalle detalle;
    protected String mensaje;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad datosPrincipales.
     * 
     * @return
     *     possible object is
     *     {@link DatosPrincipales }
     *     
     */
    public DatosPrincipales getDatosPrincipales() {
        return datosPrincipales;
    }

    /**
     * Define el valor de la propiedad datosPrincipales.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPrincipales }
     *     
     */
    public void setDatosPrincipales(DatosPrincipales value) {
        this.datosPrincipales = value;
    }

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link Detalle }
     *     
     */
    public Detalle getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link Detalle }
     *     
     */
    public void setDetalle(Detalle value) {
        this.detalle = value;
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

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
