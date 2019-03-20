package com.websystique.springmvc.service;

import com.websystique.springmvc.vo.RespuestaConsultaAval;
import com.websystique.springmvc.vo.voDatosActulizacionCredito;

public interface ServicioClienteAvalSiscomtec {

	public RespuestaConsultaAval getAval(Long codigoAval, String cedula);
	public Boolean  actulizarAvalSiscomtec (voDatosActulizacionCredito parametros);

}
