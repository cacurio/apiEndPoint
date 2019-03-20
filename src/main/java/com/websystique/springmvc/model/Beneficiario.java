package com.websystique.springmvc.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiario")
public class Beneficiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ben_id")
	private int benId;

	@Column(name = "cat_id_tipo_identificacion")
	private int catIdTipoIdentificacion;

	@Column(name = "ubi_id")
	private int ubiId;

	//
	@Column(name = "cat_id_tipo_org_per")
	private int catIdTipoOrgPer;

	@Column(name = "cat_id_tipo_nac")
	private int catIdTipoNac;

	@Column(name = "ben_identificacion")
	private String benIdentificacion;

	@Column(name = "ben_nombre")
	private String benNombre;

	@Column(name = "ben_apellido")
	private String ben_apellido;

	@Column(name = "ben_nombres")
	private String benNombres;

	// mandar null
	@Column(name = "org_id_ben")
	private int orgIdBen;

	@Column(name = "ben_direccion")
	private String benDireccion;

	@Column(name = "ben_correo")
	private String benCorreo;

	@Column(name = "ben_telefono")
	private String benTelefono;

	@Column(name = "ben_celular")
	private String benCelular;

	// 11
	@Column(name = "ben_estado")
	private int benEstado;

	// false
	@Column(name = "ben_eliminado")
	private int benEliminado;

	// Acreditaciones
	@Column(name = "ben_origen")
	private String benOrigen;

	@Column(name = "ben_reg_fecha")
	private Timestamp benRegFecha;

	@Column(name = "ben_reg_usu")
	private int benRegUsu;

	public int getBenId() {
		return benId;
	}

	public void setBenId(int benId) {
		this.benId = benId;
	}

	public int getCatIdTipoIdentificacion() {
		return catIdTipoIdentificacion;
	}

	public void setCatIdTipoIdentificacion(int catIdTipoIdentificacion) {
		this.catIdTipoIdentificacion = catIdTipoIdentificacion;
	}

	public int getUbiId() {
		return ubiId;
	}

	public void setUbiId(int ubiId) {
		this.ubiId = ubiId;
	}

	public int getCatIdTipoOrgPer() {
		return catIdTipoOrgPer;
	}

	public void setCatIdTipoOrgPer(int catIdTipoOrgPer) {
		this.catIdTipoOrgPer = catIdTipoOrgPer;
	}

	public int getCatIdTipoNac() {
		return catIdTipoNac;
	}

	public void setCatIdTipoNac(int catIdTipoNac) {
		this.catIdTipoNac = catIdTipoNac;
	}

	public String getBenIdentificacion() {
		return benIdentificacion;
	}

	public void setBenIdentificacion(String benIdentificacion) {
		this.benIdentificacion = benIdentificacion;
	}

	public String getBenNombre() {
		return benNombre;
	}

	public void setBenNombre(String benNombre) {
		this.benNombre = benNombre;
	}

	public String getBen_apellido() {
		return ben_apellido;
	}

	public void setBen_apellido(String ben_apellido) {
		this.ben_apellido = ben_apellido;
	}

	public String getBenNombres() {
		return benNombres;
	}

	public void setBenNombres(String benNombres) {
		this.benNombres = benNombres;
	}

	public int getOrgIdBen() {
		return orgIdBen;
	}

	public void setOrgIdBen(int orgIdBen) {
		this.orgIdBen = orgIdBen;
	}

	public String getBenDireccion() {
		return benDireccion;
	}

	public void setBenDireccion(String benDireccion) {
		this.benDireccion = benDireccion;
	}

	public String getBenCorreo() {
		return benCorreo;
	}

	public void setBenCorreo(String benCorreo) {
		this.benCorreo = benCorreo;
	}

	public String getBenTelefono() {
		return benTelefono;
	}

	public void setBenTelefono(String benTelefono) {
		this.benTelefono = benTelefono;
	}

	public String getBenCelular() {
		return benCelular;
	}

	public void setBenCelular(String benCelular) {
		this.benCelular = benCelular;
	}

	public int getBenEstado() {
		return benEstado;
	}

	public void setBenEstado(int benEstado) {
		this.benEstado = benEstado;
	}

	public int getBenEliminado() {
		return benEliminado;
	}

	public void setBenEliminado(int benEliminado) {
		this.benEliminado = benEliminado;
	}

	public String getBenOrigen() {
		return benOrigen;
	}

	public void setBenOrigen(String benOrigen) {
		this.benOrigen = benOrigen;
	}

	public Timestamp getBenRegFecha() {
		return benRegFecha;
	}

	public void setBenRegFecha(Timestamp benRegFecha) {
		this.benRegFecha = benRegFecha;
	}

	public int getBenRegUsu() {
		return benRegUsu;
	}

	public void setBenRegUsu(int benRegUsu) {
		this.benRegUsu = benRegUsu;
	}

}
