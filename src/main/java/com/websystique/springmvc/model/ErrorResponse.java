package com.websystique.springmvc.model;

public class ErrorResponse {

	private String errorCod;
	private String mensaje;
	private String errorObs;

	public String getErrorCod() {
		return errorCod;
	}

	public void setErrorCod(String errorCod) {
		this.errorCod = errorCod;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getErrorObs() {
		return errorObs;
	}

	public void setErrorObs(String errorObs) {
		this.errorObs = errorObs;
	}

}
