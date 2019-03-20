package com.websystique.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springmvc.model.ModelRegistroCivil;
import com.websystique.springmvc.model.ModelServicioRentasInternas;
import com.websystique.springmvc.service.ServicioRegistroCivilSri;

@RestController
public class ApiServiciosController {
	
	@Autowired
	private ServicioRegistroCivilSri servicioRegistroCivilSri;
	
	@RequestMapping(value = "/user/ciudadano/{cedula}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ModelRegistroCivil getCiudadano(@PathVariable ("cedula") String cedula) {
		ModelRegistroCivil modelRegistroCivil= new ModelRegistroCivil();
		modelRegistroCivil=servicioRegistroCivilSri.getCiudadano(cedula);
		return modelRegistroCivil;
	}
	
	@RequestMapping(value = "/user/contribuyente/{ruc}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ModelServicioRentasInternas getContribuyente(@PathVariable ("ruc") String ruc) {
	ModelServicioRentasInternas servicioRentasInternas= new ModelServicioRentasInternas();
	servicioRentasInternas=servicioRegistroCivilSri.getContribuyente(ruc);
		return servicioRentasInternas;
	}

}
