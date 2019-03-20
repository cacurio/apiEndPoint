package com.websystique.springmvc.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ModelAval  {
	
	private Long avlId;
	private Integer cicId;
	private Integer psId;
	private Integer catTipoAval;
	private Integer avlCapitalTrabajo;
	private Integer avlSemillaInsumo;
	private Long avlCodigo;
	private String perCedula;
	private String perNombres;
	private String avlEstadoProceso;
	private Integer avlEstado;
	private boolean avlEliminado;
	private Integer avlRegUsu;
	private Date avlRegFecha;
	private Integer avl_act_usu;
	private Date avlActFecha;
	private String avlBanEstadoProceso;
	private Date avlBanFechaProceso;
	private Integer avlActivoFijo;
	
	private Set<ModelAvalAgricola> avalesAgricola= new HashSet<>();

	public Long getAvlId() {
		return avlId;
	}

	public void setAvlId(Long avlId) {
		this.avlId = avlId;
	}

	public Integer getCicId() {
		return cicId;
	}

	public void setCicId(Integer cicId) {
		this.cicId = cicId;
	}

	public Integer getPsId() {
		return psId;
	}

	public void setPsId(Integer psId) {
		this.psId = psId;
	}

	public Integer getCatTipoAval() {
		return catTipoAval;
	}

	public void setCatTipoAval(Integer catTipoAval) {
		this.catTipoAval = catTipoAval;
	}

	public Integer getAvlCapitalTrabajo() {
		return avlCapitalTrabajo;
	}

	public void setAvlCapitalTrabajo(Integer avlCapitalTrabajo) {
		this.avlCapitalTrabajo = avlCapitalTrabajo;
	}

	public Integer getAvlSemillaInsumo() {
		return avlSemillaInsumo;
	}

	public void setAvlSemillaInsumo(Integer avlSemillaInsumo) {
		this.avlSemillaInsumo = avlSemillaInsumo;
	}

	public Long getAvlCodigo() {
		return avlCodigo;
	}

	public void setAvlCodigo(Long avlCodigo) {
		this.avlCodigo = avlCodigo;
	}

	public String getPerCedula() {
		return perCedula;
	}

	public void setPerCedula(String perCedula) {
		this.perCedula = perCedula;
	}

	public String getPerNombres() {
		return perNombres;
	}

	public void setPerNombres(String perNombres) {
		this.perNombres = perNombres;
	}

	public String getAvlEstadoProceso() {
		return avlEstadoProceso;
	}

	public void setAvlEstadoProceso(String avlEstadoProceso) {
		this.avlEstadoProceso = avlEstadoProceso;
	}

	public Integer getAvlEstado() {
		return avlEstado;
	}

	public void setAvlEstado(Integer avlEstado) {
		this.avlEstado = avlEstado;
	}

	public boolean isAvlEliminado() {
		return avlEliminado;
	}

	public void setAvlEliminado(boolean avlEliminado) {
		this.avlEliminado = avlEliminado;
	}

	public Integer getAvlRegUsu() {
		return avlRegUsu;
	}

	public void setAvlRegUsu(Integer avlRegUsu) {
		this.avlRegUsu = avlRegUsu;
	}

	public Date getAvlRegFecha() {
		return avlRegFecha;
	}

	public void setAvlRegFecha(Date avlRegFecha) {
		this.avlRegFecha = avlRegFecha;
	}

	public Integer getAvl_act_usu() {
		return avl_act_usu;
	}

	public void setAvl_act_usu(Integer avl_act_usu) {
		this.avl_act_usu = avl_act_usu;
	}

	public Date getAvlActFecha() {
		return avlActFecha;
	}

	public void setAvlActFecha(Date avlActFecha) {
		this.avlActFecha = avlActFecha;
	}

	public String getAvlBanEstadoProceso() {
		return avlBanEstadoProceso;
	}

	public void setAvlBanEstadoProceso(String avlBanEstadoProceso) {
		this.avlBanEstadoProceso = avlBanEstadoProceso;
	}

	public Date getAvlBanFechaProceso() {
		return avlBanFechaProceso;
	}

	public void setAvlBanFechaProceso(Date avlBanFechaProceso) {
		this.avlBanFechaProceso = avlBanFechaProceso;
	}

	public Integer getAvlActivoFijo() {
		return avlActivoFijo;
	}

	public void setAvlActivoFijo(Integer avlActivoFijo) {
		this.avlActivoFijo = avlActivoFijo;
	}
	
	
	public Set<ModelAvalAgricola> getAvalesAgricola() {
		return avalesAgricola;
	}

	public void setAvalesAgricola(Set<ModelAvalAgricola> avalesAgricola) {
		this.avalesAgricola = avalesAgricola;
	}

	
	
	@Override
	public String toString() {
		return "ModelAval [avlId=" + avlId + ", cicId=" + cicId + ", psId=" + psId + ", catTipoAval=" + catTipoAval
				+ ", avlCapitalTrabajo=" + avlCapitalTrabajo + ", avlSemillaInsumo=" + avlSemillaInsumo + ", avlCodigo="
				+ avlCodigo + ", perCedula=" + perCedula + ", perNombres=" + perNombres + ", avlEstadoProceso="
				+ avlEstadoProceso + ", avlEstado=" + avlEstado + ", avlEliminado=" + avlEliminado + ", avlRegUsu="
				+ avlRegUsu + ", avlRegFecha=" + avlRegFecha + ", avl_act_usu=" + avl_act_usu + ", avlActFecha="
				+ avlActFecha + ", avlBanEstadoProceso=" + avlBanEstadoProceso + ", avlBanFechaProceso="
				+ avlBanFechaProceso + ", avlActivoFijo=" + avlActivoFijo + ", avalesAgricola=" + avalesAgricola + "]";
	}


}
