package ec.gob.dinardap.interoperacion.interoperadorws.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2019-03-07T10:56:46.274-05:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", name = "InteroperadorAnt")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InteroperadorAnt {

    @WebMethod(action = "licencia")
    @WebResult(name = "licenciaResponse", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", partName = "parameters")
    public LicenciaResponse licencia(
        @WebParam(partName = "parameters", name = "licencia", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
        Licencia parameters
    );

    @WebMethod(action = "infracciones")
    @WebResult(name = "infraccionesResponse", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", partName = "parameters")
    public InfraccionesResponse infracciones(
        @WebParam(partName = "parameters", name = "infracciones", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
        Infracciones parameters
    );

    @WebMethod(action = "restricciones")
    @WebResult(name = "restriccionesResponse", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", partName = "parameters")
    public RestriccionesResponse restricciones(
        @WebParam(partName = "parameters", name = "restricciones", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
        Restricciones parameters
    );

    @WebMethod(action = "vehiculoIdentificacion")
    @WebResult(name = "vehiculoIdentificacionResponse", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", partName = "parameters")
    public VehiculoIdentificacionResponse vehiculoIdentificacion(
        @WebParam(partName = "parameters", name = "vehiculoIdentificacion", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
        VehiculoIdentificacion parameters
    );

    @WebMethod(action = "historial")
    @WebResult(name = "historialResponse", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", partName = "parameters")
    public HistorialResponse historial(
        @WebParam(partName = "parameters", name = "historial", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
        Historial parameters
    );

    @WebMethod(action = "datosMatricula")
    @WebResult(name = "datosMatriculaResponse", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", partName = "parameters")
    public DatosMatriculaResponse datosMatricula(
        @WebParam(partName = "parameters", name = "datosMatricula", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
        DatosMatricula parameters
    );

    @WebMethod(action = "vehiculo")
    @WebResult(name = "vehiculoResponse", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/", partName = "parameters")
    public VehiculoResponse vehiculo(
        @WebParam(partName = "parameters", name = "vehiculo", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
        Vehiculo parameters
    );
}