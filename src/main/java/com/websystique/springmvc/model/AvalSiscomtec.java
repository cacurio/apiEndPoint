package com.websystique.springmvc.model;

import java.util.Date;

public class AvalSiscomtec {

	private Long avlId; //
	private int cicId;
	private int benId;
	private String benCedula; //
	private String benApellidosnombres; //
	private String ubiCodInecProv;//
	private String ubiCodInecCant;//
	private String ubiCodInecParr;//
	private String preNomRecinto;//
	private String preDireccion;//
	private String preNombre;//
	private int culId;// homologar 1=maiz duro 2 = arroz
	private String pcCoordX;//
	private String pcCoordY;//
	private int avalHectareasFinanciar;//
	private Date avalFechaTentativaSiembra;//
	// aval_documento blob NOT NULL,
	private int avalEstado;// validar en consulta especifica 11= activo 12=inactivo
	private Date avalRegFecha; //
	private String poseeRiego;

	public Long getAvlId() {
		return avlId;
	}

	public void setAvlId(Long avlId) {
		this.avlId = avlId;
	}

	public int getCicId() {
		return cicId;
	}

	public void setCicId(int cicId) {
		this.cicId = cicId;
	}

	public int getBenId() {
		return benId;
	}

	public void setBenId(int benId) {
		this.benId = benId;
	}

	public String getBenCedula() {
		return benCedula;
	}

	public void setBenCedula(String benCedula) {
		this.benCedula = benCedula;
	}

	public String getBenApellidosnombres() {
		return benApellidosnombres;
	}

	public void setBenApellidosnombres(String benApellidosnombres) {
		this.benApellidosnombres = benApellidosnombres;
	}

	public String getPreNomRecinto() {
		return preNomRecinto;
	}

	public void setPreNomRecinto(String preNomRecinto) {
		this.preNomRecinto = preNomRecinto;
	}

	public String getPreDireccion() {
		return preDireccion;
	}

	public void setPreDireccion(String preDireccion) {
		this.preDireccion = preDireccion;
	}

	public String getPreNombre() {
		return preNombre;
	}

	public void setPreNombre(String preNombre) {
		this.preNombre = preNombre;
	}

	public int getCulId() {
		return culId;
	}

	public void setCulId(int culId) {
		this.culId = culId;
	}

	public String getPcCoordX() {
		return pcCoordX;
	}

	public void setPcCoordX(String pcCoordX) {
		this.pcCoordX = pcCoordX;
	}

	public String getPcCoordY() {
		return pcCoordY;
	}

	public void setPcCoordY(String pcCoordY) {
		this.pcCoordY = pcCoordY;
	}

	public int getAvalHectareasFinanciar() {
		return avalHectareasFinanciar;
	}

	public void setAvalHectareasFinanciar(int avalHectareasFinanciar) {
		this.avalHectareasFinanciar = avalHectareasFinanciar;
	}

	public Date getAvalFechaTentativaSiembra() {
		return avalFechaTentativaSiembra;
	}

	public void setAvalFechaTentativaSiembra(Date avalFechaTentativaSiembra) {
		this.avalFechaTentativaSiembra = avalFechaTentativaSiembra;
	}

	public int getAvalEstado() {
		return avalEstado;
	}

	public void setAvalEstado(int avalEstado) {
		this.avalEstado = avalEstado;
	}

	public Date getAvalRegFecha() {
		return avalRegFecha;
	}

	public void setAvalRegFecha(Date avalRegFecha) {
		this.avalRegFecha = avalRegFecha;
	}

	public String getUbiCodInecProv() {
		return ubiCodInecProv;
	}

	public void setUbiCodInecProv(String ubiCodInecProv) {
		this.ubiCodInecProv = ubiCodInecProv;
	}

	public String getUbiCodInecCant() {
		return ubiCodInecCant;
	}

	public void setUbiCodInecCant(String ubiCodInecCant) {
		this.ubiCodInecCant = ubiCodInecCant;
	}

	public String getUbiCodInecParr() {
		return ubiCodInecParr;
	}

	public void setUbiCodInecParr(String ubiCodInecParr) {
		this.ubiCodInecParr = ubiCodInecParr;
	}

	public String getPoseeRiego() {
		return poseeRiego;
	}

	public void setPoseeRiego(String poseeRiego) {
		this.poseeRiego = poseeRiego;
	}

}
