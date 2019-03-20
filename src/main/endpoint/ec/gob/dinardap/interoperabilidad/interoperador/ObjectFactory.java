
package ec.gob.dinardap.interoperabilidad.interoperador;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.gob.dinardap.interoperabilidad.interoperador package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Consultar_QNAME = new QName("http://interoperabilidad.dinardap.gob.ec/interoperador/", "consultar");
    private final static QName _ConsultarResponse_QNAME = new QName("http://interoperabilidad.dinardap.gob.ec/interoperador/", "consultarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.dinardap.interoperabilidad.interoperador
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link ConsultarFault }
     * 
     */
    public ConsultarFault createConsultarFault() {
        return new ConsultarFault();
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

    /**
     * Create an instance of {@link Parametros }
     * 
     */
    public Parametros createParametros() {
        return new Parametros();
    }

    /**
     * Create an instance of {@link Parametro }
     * 
     */
    public Parametro createParametro() {
        return new Parametro();
    }

    /**
     * Create an instance of {@link Paquete }
     * 
     */
    public Paquete createPaquete() {
        return new Paquete();
    }

    /**
     * Create an instance of {@link Entidades }
     * 
     */
    public Entidades createEntidades() {
        return new Entidades();
    }

    /**
     * Create an instance of {@link Entidad }
     * 
     */
    public Entidad createEntidad() {
        return new Entidad();
    }

    /**
     * Create an instance of {@link Filas }
     * 
     */
    public Filas createFilas() {
        return new Filas();
    }

    /**
     * Create an instance of {@link Fila }
     * 
     */
    public Fila createFila() {
        return new Fila();
    }

    /**
     * Create an instance of {@link Columnas }
     * 
     */
    public Columnas createColumnas() {
        return new Columnas();
    }

    /**
     * Create an instance of {@link Columna }
     * 
     */
    public Columna createColumna() {
        return new Columna();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consultar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interoperabilidad.dinardap.gob.ec/interoperador/", name = "consultar")
    public JAXBElement<Consultar> createConsultar(Consultar value) {
        return new JAXBElement<Consultar>(_Consultar_QNAME, Consultar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interoperabilidad.dinardap.gob.ec/interoperador/", name = "consultarResponse")
    public JAXBElement<ConsultarResponse> createConsultarResponse(ConsultarResponse value) {
        return new JAXBElement<ConsultarResponse>(_ConsultarResponse_QNAME, ConsultarResponse.class, null, value);
    }

}
