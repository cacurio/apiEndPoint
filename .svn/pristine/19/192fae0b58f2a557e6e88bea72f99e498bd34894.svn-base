package com.websystique.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.websystique.springmvc.service.ServicioClienteAvalRna;
import com.websystique.springmvc.service.ServicioClienteAvalSiscomtec;
import com.websystique.springmvc.service.ServicioGenerico;
import com.websystique.springmvc.vo.RespuestaConsultaAval;
import com.websystique.springmvc.vo.voDatosActulizacionCredito;

@RestController
public class ApiAvalController {

	@Autowired
	private ServicioClienteAvalRna servicioClienteAvalRna;

	@Autowired
	private ServicioClienteAvalSiscomtec servicioClienteAvalSiscomtec;

	@Autowired
	private ServicioGenerico servicioGenerico;

	Logger logger = Logger.getLogger(ApiAvalController.class.getName());

	/**
	 * Consulta los avales
	 * 
	 * @author Cristhian Acurio
	 * @param codigoAval
	 * @param cedula
	 * @param request
	 * @return
	 */

	@GetMapping("/user/aval/{numcedula}/{numaval}")
	public ResponseEntity<RespuestaConsultaAval> getAval(@PathVariable("numaval") Long codigoAval,
			@PathVariable("numcedula") String cedula, HttpServletRequest request) {
		logger.info(request + ";" + request.getHeader("user-agent") + ";" + request.getHeader("host"));
		RespuestaConsultaAval respuestaConsultaAval = new RespuestaConsultaAval();
		switch (servicioGenerico.getCodigoProyecto(codigoAval)) {
		case "202":
			respuestaConsultaAval = servicioClienteAvalRna.getAval(codigoAval, cedula);
			break;
		case "204":
			respuestaConsultaAval = servicioClienteAvalSiscomtec.getAval(codigoAval, cedula);
			break;
		default:
			respuestaConsultaAval.setCodigoRespuesta("002");
			respuestaConsultaAval.setMensajeRespuesta("La consulta no obtuvo resultados");
			respuestaConsultaAval.setObjAval(null);
			break;
		}
		return new ResponseEntity<RespuestaConsultaAval>(respuestaConsultaAval, HttpStatus.OK);
	}

	/**
	 * Actulizar el estado del crédito de acuerdo al aval utilizado por BanEcuador
	 * 
	 * @author Cristhian Acurio
	 * @param parametros
	 * @param request
	 * @return
	 */

	@PutMapping("/user/aval")
	public ResponseEntity<RespuestaConsultaAval> updateEstadoCredito(@RequestBody voDatosActulizacionCredito parametros,
			HttpServletRequest request) {
		logger.info(request + ";" + request.getHeader("user-agent") + ";" + request.getHeader("host"));
		RespuestaConsultaAval respuestaConsultaAval = new RespuestaConsultaAval();
		switch (servicioGenerico.getCodigoProyecto((long) parametros.getNumAval())) {
		case "202":
			if (servicioClienteAvalRna.actulizarAvalRna(parametros)) {
				respuestaConsultaAval.setCodigoRespuesta("004");
				respuestaConsultaAval.setMensajeRespuesta("actulización exitosa");
				respuestaConsultaAval.setObjAval(null);
			} else {
				respuestaConsultaAval.setCodigoRespuesta("005");
				respuestaConsultaAval.setMensajeRespuesta("actulización no exitosa");
				respuestaConsultaAval.setObjAval(null);
			}
			break;
		case "204":
			if (servicioClienteAvalSiscomtec.actulizarAvalSiscomtec(parametros)) {
				respuestaConsultaAval.setCodigoRespuesta("004");
				respuestaConsultaAval.setMensajeRespuesta("actulización exitosa");
				respuestaConsultaAval.setObjAval(null);
			} else {
				respuestaConsultaAval.setCodigoRespuesta("005");
				respuestaConsultaAval.setMensajeRespuesta("actulización no exitosa");
				respuestaConsultaAval.setObjAval(null);
			}
			break;
		}

		return new ResponseEntity<RespuestaConsultaAval>(respuestaConsultaAval, HttpStatus.OK);

	}

}