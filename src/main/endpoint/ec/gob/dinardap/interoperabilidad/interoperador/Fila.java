
package ec.gob.dinardap.interoperabilidad.interoperador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fila complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fila"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="columnas" type="{http://interoperabilidad.dinardap.gob.ec/interoperador/}columnas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fila", propOrder = {
    "columnas"
})
public class Fila {

    protected Columnas columnas;

    /**
     * Obtiene el valor de la propiedad columnas.
     * 
     * @return
     *     possible object is
     *     {@link Columnas }
     *     
     */
    public Columnas getColumnas() {
        return columnas;
    }

    /**
     * Define el valor de la propiedad columnas.
     * 
     * @param value
     *     allowed object is
     *     {@link Columnas }
     *     
     */
    public void setColumnas(Columnas value) {
        this.columnas = value;
    }

}
