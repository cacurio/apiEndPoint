package com.websystique.springmvc.service;

import java.io.IOException;
import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.util.JacksonJsonParser;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.websystique.springmvc.model.ErrorResponse;
import com.websystique.springmvc.model.ModelAval;
import com.websystique.springmvc.model.ModelAvalAgricola;
import com.websystique.springmvc.vo.RespuestaConsultaAval;
import com.websystique.springmvc.vo.VoAval;
import com.websystique.springmvc.vo.voDatosActulizacionCredito;

@Service
public class ServicioClienteAvalRnaImpl implements ServicioClienteAvalRna {

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
		ModelAval modelAval = new ModelAval();
		ModelAvalAgricola modelAvalAgricola = new ModelAvalAgricola();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		HttpEntity<String> request = new HttpEntity<String>(getHeaders());

		// ResponseEntity<ModelAval> response = null;
		RequestEntity<MultiValueMap<String, String>> requestEntity = new RequestEntity<>(getHeaders(), HttpMethod.GET,
				URI.create(
						"http://10.10.1.33:8080/apiavalesccma-0.0.1-SNAPSHOT/api/aval/" + codigoAval + "/" + cedula));
		ResponseEntity<ModelAval> response = null;
		try {
			response = restTemplate.exchange(requestEntity, ModelAval.class);

			if (response.getStatusCode().is2xxSuccessful()) {
				modelAval = response.getBody();
				aval.setAvalId(modelAval.getAvlCodigo());
				aval.setBenCedula(modelAval.getPerCedula());
				aval.setBenApellidosnombres(modelAval.getPerNombres());

				for (ModelAvalAgricola avalAgricola : modelAval.getAvalesAgricola()) {
					modelAvalAgricola = avalAgricola;
				}
				aval.setUbiCodInecProv(modelAvalAgricola.getUbiCodInecProv());
				aval.setUbiCodInecCant(modelAvalAgricola.getUbiCodInecCant());
				aval.setUbiCodInecParr(modelAvalAgricola.getUbiCodInecParr());
				aval.setPreNomRecinto(modelAvalAgricola.getPreNomRecinto());
				aval.setPreDireccion(modelAvalAgricola.getPreDireccion());
				aval.setPreNombre(modelAvalAgricola.getPreNombre());
				aval.setCodCulBanEcuador(servicioGenerico.homologarCodigosBanEcuadorPerenne(modelAvalAgricola.getSemId()));
				aval.setDisponeRiego(modelAvalAgricola.getPcPoseeRiego());
				aval.setTipoRiego(modelAvalAgricola.getPcTipoRiego());
				// aval.setOtroRiego();
				aval.setPcCoordX(modelAvalAgricola.getPcCoordX());
				aval.setPcCoordY(modelAvalAgricola.getPcCoordY());
				aval.setAvalHectareasFinanciar(modelAvalAgricola.getAvaHectareasFinanciar().intValue());
				aval.setAvalFechaTentativaSiembra(df.format(modelAvalAgricola.getAvaFechaTentativaSiembra()));
				respuestaConsultaAval.setCodigoRespuesta("001");
				respuestaConsultaAval.setMensajeRespuesta("Consulta exitosa");
				respuestaConsultaAval.setObjAval(aval);
			}
		} catch (HttpClientErrorException e) {
//			System.out.println(e.getStatusCode());
//			System.out.println(e.getResponseBodyAsString());
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
	public Boolean actulizarAvalRna(voDatosActulizacionCredito parametros) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<?> request = new HttpEntity<Object>(parametros, getHeaders());
		String url = "http://10.10.1.33:8080/apiavalesccma-0.0.1-SNAPSHOT/api/aval/";
		ResponseEntity<ModelAval> response = null;
		try {
			response = restTemplate.exchange(url, HttpMethod.PUT, request, ModelAval.class);
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
