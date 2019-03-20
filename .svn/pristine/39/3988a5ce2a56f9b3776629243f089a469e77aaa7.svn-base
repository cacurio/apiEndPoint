package com.websystique.springmvc.service.endpoint;

import java.util.HashMap;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import ec.gob.dinardap.interoperabilidad.interoperador.Columna;
import ec.gob.dinardap.interoperabilidad.interoperador.Columnas;
import ec.gob.dinardap.interoperabilidad.interoperador.Consultar;
import ec.gob.dinardap.interoperabilidad.interoperador.ConsultarFaultException;
import ec.gob.dinardap.interoperabilidad.interoperador.ConsultarResponse;
import ec.gob.dinardap.interoperabilidad.interoperador.Entidad;
import ec.gob.dinardap.interoperabilidad.interoperador.Fila;
import ec.gob.dinardap.interoperabilidad.interoperador.Interoperador;
import ec.gob.dinardap.interoperabilidad.interoperador.Paquete;
import ec.gob.dinardap.interoperabilidad.interoperador.Parametro;
import ec.gob.dinardap.interoperabilidad.interoperador.Parametros;





public class ConsumoDv2 {
	
	public void consulta (String cedula) {
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
         paramCodigoPaquete.setValor("1324");
         
         Parametro paramIdentficacion= new Parametro();
         paramIdentficacion.setNombre("identificacion");
         paramIdentficacion.setValor(cedula);
         
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
         
         
         
	}
	
}
