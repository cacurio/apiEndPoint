package com.websystique.springmvc.service.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.stereotype.Service;
import com.websystique.springmvc.vo.VoRespuestaRegistroCivil;
import ec.gob.registrocivil.Ciudadano;
import ec.gob.registrocivil.ConsultaCiudadano;
import ec.gob.registrocivil.ConsultaCiudadano_Service;

@Service("ServiceEndPointRegistoCivil")
public class ServiceEndPointRegistroCivilImpl implements ServiceEndPointRegistoCivil {


	@Override
	public VoRespuestaRegistroCivil resposeRegistroCivilPuntoToPunto(String NUI) {
		Ciudadano ciudadano = new Ciudadano();
		VoRespuestaRegistroCivil respuestaRegistroCivil=new VoRespuestaRegistroCivil();
		try {
			String codigoInstitucion="51";
			String codigoAgencia="52";
			String usuario="magap12";
			String contrasenia="M@SzNj6%x";
			ConsultaCiudadano_Service servicio= new ConsultaCiudadano_Service(new URL("https://wsprodu.registrocivil.gob.ec/WsRegistroCivil/ConsultaCiudadano?wsdl"));
			ConsultaCiudadano port = servicio.getConsultaCiudadanoPort();
			ciudadano = port.busquedaPorNui(codigoInstitucion, codigoAgencia, usuario, contrasenia, NUI);
			if(ciudadano!=null) {
				respuestaRegistroCivil.setCalle(ciudadano.getCalle());
				respuestaRegistroCivil.setCodigoDomicilio(ciudadano.getCodigoDomicilio());
				respuestaRegistroCivil.setCodigoError(ciudadano.getCodigoError());
				respuestaRegistroCivil.setCondicionCedulado(ciudadano.getCondicionCedulado());
				respuestaRegistroCivil.setConyuge(ciudadano.getConyuge());
				respuestaRegistroCivil.setDomicilio(ciudadano.getDomicilio());
				respuestaRegistroCivil.setError(ciudadano.getError());
				respuestaRegistroCivil.setEstadoCivil(ciudadano.getEstadoCivil());
				respuestaRegistroCivil.setFechaDefuncion(ciudadano.getFechaFallecimiento());
				respuestaRegistroCivil.setFechaInscripcionGenero(ciudadano.getFechaInscripcionGenero());
				respuestaRegistroCivil.setFechaNacimiento(ciudadano.getFechaNacimiento());
				respuestaRegistroCivil.setGenero(ciudadano.getGenero());
				respuestaRegistroCivil.setInstruccion(ciudadano.getInstruccion());
				respuestaRegistroCivil.setLugarInscripcionGenero(ciudadano.getLugarNacimiento());
				respuestaRegistroCivil.setLugarInscripcionGenero(ciudadano.getLugarInscripcionGenero());
				respuestaRegistroCivil.setLugarNacimiento(ciudadano.getCodigoLugarNacimiento());
				respuestaRegistroCivil.setNacionalidad(ciudadano.getNacionalidad());
				respuestaRegistroCivil.setNombre(ciudadano.getNombre());
				respuestaRegistroCivil.setNombreMadre(ciudadano.getNombreMadre());
				respuestaRegistroCivil.setNombrePadre(ciudadano.getNombrePadre());
				respuestaRegistroCivil.setNUI(ciudadano.getNUI());
				respuestaRegistroCivil.setNumeroCasa(ciudadano.getNumeroCasa());
				respuestaRegistroCivil.setOrigen("Servicio web Registro Civil");
				respuestaRegistroCivil.setSexo(ciudadano.getSexo());
			}
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return respuestaRegistroCivil; 
	}

}
