package com.websystique.springmvc.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "aval")
public class Aval {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="avl_codigo")
	private Long avlId; //
	
	@Column(name="cic_id")
	private int cicId;
	@Column(name="ben_id")
	private int benId;
	@Column(name="ben_cedula")
	private String benCedula; //
	@Column(name="ben_apellidosnombres")
	private String benApellidosnombres; //
	@JsonIgnore
	@Column(name="pre_id")
	private int preId;
	@JsonIgnore
	@Column(name="ubi_id")
	private int ubiId;
	@Column(name="ubi_cod_inec_prov")
	private String ubiCodInecProv;//
	@Column(name="ubi_cod_inec_cant")
	private String ubiCodInecCant;//
	@Column(name="ubi_cod_inec_parr")
	private String ubiCodInecParr;//
	@Column(name="pre_nom_recinto")
	private String preNomRecinto;//
	@Column(name="pre_direccion")
	private String preDireccion;//
	@Column(name="pre_nombre")
	private String preNombre;//
	@JsonIgnore
	@Column(name="pc_id")
	private int pcId;
	@Column(name="cul_id")
	private int culId;// homologar 1=maiz duro 2 = arroz
	@Column(name="pc_coord_x")
	private String pcCoordX;//
	@Column(name="pc_coord_y")
	private String pcCoordY;//
	@Column(name="avl_hectareas_financiar")
	private int avalHectareasFinanciar;//
	@Column(name="avl_fecha_tentativa_siembra")
	private Date avalFechaTentativaSiembra;//
	// aval_documento blob NOT NULL,
	@Column(name="avl_estado")
	private int avalEstado;// validar en consulta especifica 11= activo 12=inactivo
	@Temporal(TemporalType.DATE)
	@Column(name="avl_reg_fecha")
	private Date avalRegFecha; //
	@Column(name="pc_posee_riego")
	private String poseeRiego;
	@JsonIgnore
	@Column(name="avl_ban_estado_proceso")
	private String avalEstadoProceso;
	@JsonIgnore
	@Column(name="avl_ban_fecha_proceso")
	private Date avlBanFechaProceso;
	
	

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

	public int getPreId() {
		return preId;
	}

	public void setPreId(int preId) {
		this.preId = preId;
	}

	public int getUbiId() {
		return ubiId;
	}

	public void setUbiId(int ubiId) {
		this.ubiId = ubiId;
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

	public int getPcId() {
		return pcId;
	}

	public void setPcId(int pcId) {
		this.pcId = pcId;
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

	public String getAvalEstadoProceso() {
		return avalEstadoProceso;
	}

	public void setAvalEstadoProceso(String avalEstadoProceso) {
		this.avalEstadoProceso = avalEstadoProceso;
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

	public Date getAvlBanFechaProceso() {
		return avlBanFechaProceso;
	}

	public void setAvlBanFechaProceso(Date avlBanFechaProceso) {
		this.avlBanFechaProceso = avlBanFechaProceso;
	}
	
	

}

