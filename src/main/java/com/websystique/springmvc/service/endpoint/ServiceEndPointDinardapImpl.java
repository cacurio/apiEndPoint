package com.websystique.springmvc.service.endpoint;

import java.net.Authenticator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.stereotype.Service;
import com.websystique.springmvc.security.Auth;
import com.websystique.springmvc.vo.VoRespuestaRegistroCivil;

import ec.gob.dinardap.interoperabilidad.interoperador.Columna;
import ec.gob.dinardap.interoperabilidad.interoperador.Consultar;
import ec.gob.dinardap.interoperabilidad.interoperador.ConsultarFaultException;
import ec.gob.dinardap.interoperabilidad.interoperador.Entidad;
import ec.gob.dinardap.interoperabilidad.interoperador.Fila;
import ec.gob.dinardap.interoperabilidad.interoperador.Interoperador;
import ec.gob.dinardap.interoperabilidad.interoperador.Paquete;
import ec.gob.dinardap.interoperabilidad.interoperador.Parametro;
import ec.gob.dinardap.interoperabilidad.interoperador.Parametros;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.DatosMatricula;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.DatosMatriculaResponse;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.DatosPrincipales;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.FichaGeneral;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.GetFichaGeneral;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.GetFichaGeneralResponse;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.Institucion;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.InteroperadorAnt;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.InteroperadorAntService;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.InteroperadorlImpl;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.InteroperadorlImplService;
import ec.gob.dinardap.interoperacion.interoperadorws.servicio.Registro;

@Service("ServiceEndPointDinardap")
public class ServiceEndPointDinardapImpl implements ServiceEndPointDinardap {

	/**
	 * Registro civil DINARDAP
	 * @author Cristhian Acurio
	 * @param  NUI
	 * @return VoRespuestaRegistroCivil
	 */
	@Override
	public VoRespuestaRegistroCivil resposeRegistroCivilDinardap(String NUI) {
		VoRespuestaRegistroCivil respuestaRegistroCivil=new VoRespuestaRegistroCivil();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map=invocacionWebServiceDinardapV2("48", NUI);
		respuestaRegistroCivil.setNUI(map.get("cedula"));
		respuestaRegistroCivil.setCondicionCedulado(map.get("condicionCiudadano"));
		respuestaRegistroCivil.setConyuge(map.get("conyuge"));
		respuestaRegistroCivil.setEstadoCivil(map.get("estadoCivil"));
		respuestaRegistroCivil.setFechaDefuncion(map.get("fechaDefuncion"));
		respuestaRegistroCivil.setFechaNacimiento(map.get("fechaNacimiento"));
		respuestaRegistroCivil.setLugarNacimiento(map.get("lugarNacimiento"));
		respuestaRegistroCivil.setNacionalidad(map.get("nacionalidad"));
		respuestaRegistroCivil.setNombre(map.get("nombre"));
		respuestaRegistroCivil.setNombreMadre(map.get("nombreMadre"));
		respuestaRegistroCivil.setNombrePadre(map.get("nombrePadre"));
		
		/*DatosPrincipales  datosPrincipales= new DatosPrincipales();
		datosPrincipales=invocacionWebServiceDinardap("48", NUI);
			for (Registro regis : datosPrincipales.getRegistros()) {
				if(regis.getCodigo().contentEquals("1")) respuestaRegistroCivil.setNUI(regis.getValor());
				if(regis.getCodigo().contentEquals("2")) respuestaRegistroCivil.setNombre(regis.getValor());
				if(regis.getCodigo().contentEquals("4")) respuestaRegistroCivil.setCondicionCedulado(regis.getValor());
				if(regis.getCodigo().contentEquals("5")) respuestaRegistroCivil.setFechaNacimiento(regis.getValor());
				if(regis.getCodigo().contentEquals("6")) respuestaRegistroCivil.setLugarNacimiento(regis.getValor());
				if(regis.getCodigo().contentEquals("7")) respuestaRegistroCivil.setNacionalidad(regis.getValor());
				if(regis.getCodigo().contentEquals("8")) respuestaRegistroCivil.setEstadoCivil(regis.getValor());
				if(regis.getCodigo().contentEquals("10")) respuestaRegistroCivil.setConyuge(regis.getValor());
				if(regis.getCodigo().contentEquals("11")) respuestaRegistroCivil.setNombrePadre(regis.getValor());
				if(regis.getCodigo().contentEquals("13")) respuestaRegistroCivil.setNombreMadre(regis.getValor());
				if(regis.getCodigo().contentEquals("20")) respuestaRegistroCivil.setFechaDefuncion(regis.getValor());
				respuestaRegistroCivil.setOrigen("Servicio web DINARDAP");
			}*/
		return respuestaRegistroCivil;
	}


	/**
	 * Metodo Wrapper DINARDAP
	 * @author Cristhian Acurio
	 * @param paquete
	 * @param parametro
	 * @return HashMap<String, String>
	 */
	
	@Override
	public HashMap<String, String> fichaDinardap(String paquete, String parametro) {
		DatosPrincipales  datosPrincipales= new DatosPrincipales();
		HashMap<String, String> map = new HashMap<String, String>();
		datosPrincipales=invocacionWebServiceDinardap(paquete, parametro);
		for (Registro registro : datosPrincipales.getRegistros()) {
			map.put(registro.getCampo(), registro.getValor());
		}
		return map;
	}
	
	/**
	 * Consumo Servicio Web DINARDAP
	 * @author Cristhian Acurio
	 * @param paquete
	 * @param parametro
	 * @return DatosPrincipales
	 */
	
	private DatosPrincipales invocacionWebServiceDinardap(String paquete, String parametro ) {
		Auth auth = new Auth("wsmagapint", "Uo)oj4/83x");
		Authenticator.setDefault(auth);
		FichaGeneral fichaGeneral = new FichaGeneral();
		DatosPrincipales  datosPrincipales= new DatosPrincipales();
		InteroperadorlImplService servicio = new InteroperadorlImplService();
		InteroperadorlImpl interoperador= servicio.getPort(InteroperadorlImpl.class);
		GetFichaGeneral getFichaGeneral = new GetFichaGeneral();
		getFichaGeneral.setCodigoPaquete(paquete);
		getFichaGeneral.setNumeroIdentificacion(parametro);
		GetFichaGeneralResponse fichaGeneralResponse = interoperador.getFichaGeneral(getFichaGeneral);
		fichaGeneral= fichaGeneralResponse.getReturn();
		for (Institucion inst : fichaGeneral.getInstituciones()) {
			datosPrincipales= inst.getDatosPrincipales();
		}
		return datosPrincipales;
	}
	
	@Override
	public HashMap<String, String> invocacionWebServiceDinardapANT(String paquete, String paramemtro) {
		Auth auth = new Auth("wsmagapint", "Uo)oj4/83x");
		Authenticator.setDefault(auth);
		InteroperadorAntService servicio= new InteroperadorAntService();
		InteroperadorAnt interoperador=servicio.getPort(InteroperadorAnt.class);
		DatosMatricula datosMatricula= new DatosMatricula();
		DatosMatriculaResponse datosMatriculaResponse =new DatosMatriculaResponse();
		DatosPrincipales  datosPrincipales= new DatosPrincipales();
		FichaGeneral fichaGeneral = new FichaGeneral();
		datosMatricula.setCodigoPaquete(paquete);
		datosMatricula.setValorConsulta(paramemtro);
		datosMatriculaResponse=interoperador.datosMatricula(datosMatricula);
		fichaGeneral=datosMatriculaResponse.getReturn();
		HashMap<String, String> map = new HashMap<String, String>();
		for (Institucion inst : fichaGeneral.getInstituciones()) {
			datosPrincipales=inst.getDatosPrincipales();
			for (Registro registro : datosPrincipales.getRegistros()) {
				map.put(registro.getCampo(), registro.getValor());
			}
			
		}
		return map;
		
	}
	
	@Override
	public HashMap<String, String> invocacionWebServiceDinardapV2 (String paquete, String parametro) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		 factory.setServiceClass(Interoperador.class);
         factory.setAddress("https://interoperabilidad.dinardap.gob.ec/interoperador-v2?wsdl");
         factory.setUsername("wsmagapint");
         factory.setPassword("Uo)oj4/83x");
         
         HashMap<String, String> map = new HashMap<String, String>();
         
         Interoperador port=(Interoperador) factory.create();
         Client cliente= ClientProxy.getClient(port);
         if (cliente != null) {
             HTTPConduit conduit = (HTTPConduit) cliente.getConduit();
             HTTPClientPolicy policy = new HTTPClientPolicy();
           //policy.setConnectionTimeout(ParametrosUtil.CONNECTION_TIMEOUT);
             //policy.setReceiveTimeout(ParametrosUtil.RECEIVE_TIMEOUT);
             policy.setAllowChunking(false);
             conduit.setClient(policy);

         }
         
         Parametro paramCodigoPaquete= new Parametro();
         paramCodigoPaquete.setNombre("codigoPaquete");
         paramCodigoPaquete.setValor(paquete);
         
         Parametro paramIdentficacion= new Parametro();
         paramIdentficacion.setNombre("identificacion");
         paramIdentficacion.setValor(parametro);
         
         Parametros parametros = new Parametros();
         parametros.getParametro().add(paramCodigoPaquete);
         parametros.getParametro().add(paramIdentficacion);
         
         Consultar consultar= new Consultar();
         consultar.setParametros(parametros);
         try {
			Paquete response=port.consultar(parametros);
			
			List<Entidad> entidades = response.getEntidades().getEntidad();
			for(Entidad entidad: entidades) {
				//filas
				System.out.println("Información de:" + entidad.getNombre());
                System.out.println("------------------------------------------------------------");
                
                for(Fila fila: entidad.getFilas().getFila()) {
                	//Columnas
                	for(Columna columna: fila.getColumnas().getColumna()) {
                		 System.out.println(columna.getCampo() + " = " + columna.getValor());
                		 map.put(columna.getCampo(), columna.getValor());
                	}
                	 System.out.println("------------------------------------------------------------");
                }
			}
			
			
			
			} catch (ConsultarFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         return map;
         
         
         
	}
	
	
}
