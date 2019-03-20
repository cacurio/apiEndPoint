
package ec.gob.dinardap.interoperacion.interoperadorws.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.gob.dinardap.interoperacion.interoperadorws.servicio package. 
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

    private final static QName _Vehiculo_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "vehiculo");
    private final static QName _VehiculoResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "vehiculoResponse");
    private final static QName _Infracciones_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "infracciones");
    private final static QName _InfraccionesResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "infraccionesResponse");
    private final static QName _DatosMatricula_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "datosMatricula");
    private final static QName _DatosMatriculaResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "datosMatriculaResponse");
    private final static QName _VehiculoIdentificacion_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "vehiculoIdentificacion");
    private final static QName _VehiculoIdentificacionResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "vehiculoIdentificacionResponse");
    private final static QName _Licencia_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "licencia");
    private final static QName _LicenciaResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "licenciaResponse");
    private final static QName _Restricciones_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "restricciones");
    private final static QName _RestriccionesResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "restriccionesResponse");
    private final static QName _Historial_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "historial");
    private final static QName _HistorialResponse_QNAME = new QName("http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", "historialResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.dinardap.interoperacion.interoperadorws.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link VehiculoResponse }
     * 
     */
    public VehiculoResponse createVehiculoResponse() {
        return new VehiculoResponse();
    }

    /**
     * Create an instance of {@link Infracciones }
     * 
     */
    public Infracciones createInfracciones() {
        return new Infracciones();
    }

    /**
     * Create an instance of {@link InfraccionesResponse }
     * 
     */
    public InfraccionesResponse createInfraccionesResponse() {
        return new InfraccionesResponse();
    }

    /**
     * Create an instance of {@link DatosMatricula }
     * 
     */
    public DatosMatricula createDatosMatricula() {
        return new DatosMatricula();
    }

    /**
     * Create an instance of {@link DatosMatriculaResponse }
     * 
     */
    public DatosMatriculaResponse createDatosMatriculaResponse() {
        return new DatosMatriculaResponse();
    }

    /**
     * Create an instance of {@link VehiculoIdentificacion }
     * 
     */
    public VehiculoIdentificacion createVehiculoIdentificacion() {
        return new VehiculoIdentificacion();
    }

    /**
     * Create an instance of {@link VehiculoIdentificacionResponse }
     * 
     */
    public VehiculoIdentificacionResponse createVehiculoIdentificacionResponse() {
        return new VehiculoIdentificacionResponse();
    }

    /**
     * Create an instance of {@link Licencia }
     * 
     */
    public Licencia createLicencia() {
        return new Licencia();
    }

    /**
     * Create an instance of {@link LicenciaResponse }
     * 
     */
    public LicenciaResponse createLicenciaResponse() {
        return new LicenciaResponse();
    }

    /**
     * Create an instance of {@link Restricciones }
     * 
     */
    public Restricciones createRestricciones() {
        return new Restricciones();
    }

    /**
     * Create an instance of {@link RestriccionesResponse }
     * 
     */
    public RestriccionesResponse createRestriccionesResponse() {
        return new RestriccionesResponse();
    }

    /**
     * Create an instance of {@link Historial }
     * 
     */
    public Historial createHistorial() {
        return new Historial();
    }

    /**
     * Create an instance of {@link HistorialResponse }
     * 
     */
    public HistorialResponse createHistorialResponse() {
        return new HistorialResponse();
    }

    /**
     * Create an instance of {@link FichaGeneral }
     * 
     */
    public FichaGeneral createFichaGeneral() {
        return new FichaGeneral();
    }

    /**
     * Create an instance of {@link Institucion }
     * 
     */
    public Institucion createInstitucion() {
        return new Institucion();
    }

    /**
     * Create an instance of {@link DatosPrincipales }
     * 
     */
    public DatosPrincipales createDatosPrincipales() {
        return new DatosPrincipales();
    }

    /**
     * Create an instance of {@link Registro }
     * 
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link Detalle }
     * 
     */
    public Detalle createDetalle() {
        return new Detalle();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "vehiculo")
    public JAXBElement<Vehiculo> createVehiculo(Vehiculo value) {
        return new JAXBElement<Vehiculo>(_Vehiculo_QNAME, Vehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "vehiculoResponse")
    public JAXBElement<VehiculoResponse> createVehiculoResponse(VehiculoResponse value) {
        return new JAXBElement<VehiculoResponse>(_VehiculoResponse_QNAME, VehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Infracciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "infracciones")
    public JAXBElement<Infracciones> createInfracciones(Infracciones value) {
        return new JAXBElement<Infracciones>(_Infracciones_QNAME, Infracciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfraccionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "infraccionesResponse")
    public JAXBElement<InfraccionesResponse> createInfraccionesResponse(InfraccionesResponse value) {
        return new JAXBElement<InfraccionesResponse>(_InfraccionesResponse_QNAME, InfraccionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "datosMatricula")
    public JAXBElement<DatosMatricula> createDatosMatricula(DatosMatricula value) {
        return new JAXBElement<DatosMatricula>(_DatosMatricula_QNAME, DatosMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosMatriculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "datosMatriculaResponse")
    public JAXBElement<DatosMatriculaResponse> createDatosMatriculaResponse(DatosMatriculaResponse value) {
        return new JAXBElement<DatosMatriculaResponse>(_DatosMatriculaResponse_QNAME, DatosMatriculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoIdentificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "vehiculoIdentificacion")
    public JAXBElement<VehiculoIdentificacion> createVehiculoIdentificacion(VehiculoIdentificacion value) {
        return new JAXBElement<VehiculoIdentificacion>(_VehiculoIdentificacion_QNAME, VehiculoIdentificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoIdentificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "vehiculoIdentificacionResponse")
    public JAXBElement<VehiculoIdentificacionResponse> createVehiculoIdentificacionResponse(VehiculoIdentificacionResponse value) {
        return new JAXBElement<VehiculoIdentificacionResponse>(_VehiculoIdentificacionResponse_QNAME, VehiculoIdentificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Licencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "licencia")
    public JAXBElement<Licencia> createLicencia(Licencia value) {
        return new JAXBElement<Licencia>(_Licencia_QNAME, Licencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "licenciaResponse")
    public JAXBElement<LicenciaResponse> createLicenciaResponse(LicenciaResponse value) {
        return new JAXBElement<LicenciaResponse>(_LicenciaResponse_QNAME, LicenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restricciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "restricciones")
    public JAXBElement<Restricciones> createRestricciones(Restricciones value) {
        return new JAXBElement<Restricciones>(_Restricciones_QNAME, Restricciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestriccionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "restriccionesResponse")
    public JAXBElement<RestriccionesResponse> createRestriccionesResponse(RestriccionesResponse value) {
        return new JAXBElement<RestriccionesResponse>(_RestriccionesResponse_QNAME, RestriccionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Historial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "historial")
    public JAXBElement<Historial> createHistorial(Historial value) {
        return new JAXBElement<Historial>(_Historial_QNAME, Historial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "historialResponse")
    public JAXBElement<HistorialResponse> createHistorialResponse(HistorialResponse value) {
        return new JAXBElement<HistorialResponse>(_HistorialResponse_QNAME, HistorialResponse.class, null, value);
    }

}
