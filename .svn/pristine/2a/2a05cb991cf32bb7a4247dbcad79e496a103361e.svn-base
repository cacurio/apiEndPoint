package com.websystique.springmvc.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.websystique.springmvc.model.ModelRegistroCivil;
import com.websystique.springmvc.model.ModelServicioRentasInternas;

@Service("servicio")
public class ServicioRegistroCivilSriImpl implements ServicioRegistroCivilSri {

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
	
	@Override
	public ModelRegistroCivil getCiudadano(String cedula) {
		ModelRegistroCivil objModelRegistroCivil = new ModelRegistroCivil();
		try {
			
			Object object=new Object();
			RestTemplate restTemplate= new RestTemplate();
			HttpEntity<String> request = new HttpEntity<String>(getHeaders());
			String uriConsultaRegistroCivil="http://10.10.1.33:8080/apiserviciosexternos-0.0.1-SNAPSHOT/utilitarios/registrocivildatosciudadano/";
			ResponseEntity<ModelRegistroCivil> response = restTemplate.exchange(uriConsultaRegistroCivil+"/"+cedula,
					HttpMethod.GET, request, ModelRegistroCivil.class);
			
			if(response.getStatusCodeValue()!=404) {
				objModelRegistroCivil = response.getBody();
			}else {
				System.out.println(object.toString());
			}
			
		}catch (HttpClientErrorException e) {
			
			return objModelRegistroCivil;
		}
		
			
		return objModelRegistroCivil;
	}

	@Override
	public ModelServicioRentasInternas getContribuyente(String ruc) {
		ModelServicioRentasInternas servicioRentasInternas= new ModelServicioRentasInternas();
		try {
			RestTemplate restTemplate= new RestTemplate();
			HttpEntity<String> request = new HttpEntity<String>(getHeaders());
			String uriConsultaRegistroCivil="http://10.10.1.33:8080/apiserviciosexternos-0.0.1-SNAPSHOT/utilitarios/sridatoscontribuyente/";
			ResponseEntity<ModelServicioRentasInternas> response = restTemplate.exchange(uriConsultaRegistroCivil+"/"+ruc,
					HttpMethod.GET, request, ModelServicioRentasInternas.class);
			if(response.getStatusCodeValue()!=404) {
				servicioRentasInternas = response.getBody();
			}
		}catch (HttpClientErrorException e) {
			
			return servicioRentasInternas;
		}
		return servicioRentasInternas;
	}

}
