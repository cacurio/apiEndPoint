package com.websystique.springmvc.service;

import java.io.IOException;
import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.websystique.springmvc.model.AvalSiscomtec;
import com.websystique.springmvc.model.ErrorResponse;
import com.websystique.springmvc.model.ModelAval;
import com.websystique.springmvc.vo.RespuestaConsultaAval;
import com.websystique.springmvc.vo.VoAval;
import com.websystique.springmvc.vo.voDatosActulizacionCredito;

@Service
public class ServicioClienteAvalSiscomtecImpl implements ServicioClienteAvalSiscomtec {

	@Autowired
	private ServicioGenerico servicioGenerico;
	
	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

	@Override
	public RespuestaConsultaAval getAval(Long codigoAval, String cedula) {
		RestTemplate restTemplate = new RestTemplate();
		RespuestaConsultaAval respuestaConsultaAval = new RespuestaConsultaAval();
		VoAval aval = new VoAval();
		AvalSiscomtec avalSiscomtec = new AvalSiscomtec();
		HttpEntity<String> request = new HttpEntity<String>(getHeaders());
		ResponseEntity<AvalSiscomtec> response = null;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		RequestEntity<MultiValueMap<String, String>> requestEntity = new RequestEntity<>(getHeaders(), HttpMethod.GET,
				URI.create("http://10.10.1.33:8080/apiavalsiscomtec-0.0.1-SNAPSHOT/api/aval/" + codigoAval + "/"
						+ cedula));

		try {
			response = restTemplate.exchange(requestEntity, AvalSiscomtec.class);
			avalSiscomtec = response.getBody();
			aval.setAvalId(avalSiscomtec.getAvlId());
			aval.setBenCedula(avalSiscomtec.getBenCedula());
			aval.setBenApellidosnombres(avalSiscomtec.getBenApellidosnombres());
			aval.setUbiCodInecProv(avalSiscomtec.getUbiCodInecProv());
			aval.setUbiCodInecCant(avalSiscomtec.getUbiCodInecCant());
			aval.setUbiCodInecParr(avalSiscomtec.getUbiCodInecParr());
			aval.setPreNomRecinto(avalSiscomtec.getPreNomRecinto());
			aval.setPreDireccion(avalSiscomtec.getPreDireccion());
			aval.setPreNombre(avalSiscomtec.getPreNombre());
			aval.setCodCulBanEcuador(servicioGenerico.homologarCodigoBanEcuador(avalSiscomtec.getCulId()));
			aval.setDisponeRiego(avalSiscomtec.getPoseeRiego());
			// aval.setTipoRiego(avalSiscomtec);
			// aval.setOtroRiego(otroRiego);
			aval.setPcCoordX(avalSiscomtec.getPcCoordX());
			aval.setPcCoordY(avalSiscomtec.getPcCoordY());
			aval.setAvalHectareasFinanciar(avalSiscomtec.getAvalHectareasFinanciar());
			aval.setAvalFechaTentativaSiembra(df.format(avalSiscomtec.getAvalFechaTentativaSiembra()));
			respuestaConsultaAval.setCodigoRespuesta("001");
			respuestaConsultaAval.setMensajeRespuesta("Consulta exitosa");
			respuestaConsultaAval.setObjAval(aval);

		} catch (HttpClientErrorException e) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				ErrorResponse error = mapper.readValue(e.getResponseBodyAsString(), ErrorResponse.class);
				respuestaConsultaAval.setCodigoRespuesta("003");
				respuestaConsultaAval.setMensajeRespuesta(error.getErrorObs());
				e.printStackTrace();
			} catch (IOException e1) {
				respuestaConsultaAval.setCodigoRespuesta("003");
				respuestaConsultaAval.setMensajeRespuesta(e1.getMessage());
				e1.printStackTrace();
			}

		}
		return respuestaConsultaAval;
	}

	@Override
	public Boolean actulizarAvalSiscomtec(voDatosActulizacionCredito parametros) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<?> request = new HttpEntity<Object>(parametros, getHeaders());
		String url = "http://10.10.1.33:8080/apiavalsiscomtec-0.0.1-SNAPSHOT/api/aval";
		ResponseEntity<AvalSiscomtec> response = null;
		try {
			response = restTemplate.exchange(url, HttpMethod.PUT, request, AvalSiscomtec.class);
			if (response.getStatusCode().is2xxSuccessful()) {
				return true;
			}
		} catch (HttpClientErrorException e) {
			System.out.println(e.getStatusCode());
			System.out.println(e.getResponseBodyAsString());
			return false;
		}
		return false;
	}

}
