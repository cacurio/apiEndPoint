package com.websystique.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ubicacion")
public class Ubicacion {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ubi_id")
	private int ubiId; 
	
	@Column(name="ubi_cod_inec")
	private String ubiCodInec;
	
	@Column(name="ubi_nombre")
	private String ubiNombre;

	public int getUbiId() {
		return ubiId;
	}

	public void setUbiId(int ubiId) {
		this.ubiId = ubiId;
	}

	public String getUbiCodInec() {
		return ubiCodInec;
	}

	public void setUbiCodInec(String ubiCodInec) {
		this.ubiCodInec = ubiCodInec;
	}

	public String getUbiNombre() {
		return ubiNombre;
	}

	public void setUbiNombre(String ubiNombre) {
		this.ubiNombre = ubiNombre;
	} 
	
	
	
	
}

