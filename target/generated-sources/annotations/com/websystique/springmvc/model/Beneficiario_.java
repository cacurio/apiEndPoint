package com.websystique.springmvc.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Beneficiario.class)
public abstract class Beneficiario_ {

	public static volatile SingularAttribute<Beneficiario, String> benNombres;
	public static volatile SingularAttribute<Beneficiario, Timestamp> benRegFecha;
	public static volatile SingularAttribute<Beneficiario, String> benCelular;
	public static volatile SingularAttribute<Beneficiario, String> benOrigen;
	public static volatile SingularAttribute<Beneficiario, Integer> ubiId;
	public static volatile SingularAttribute<Beneficiario, String> benNombre;
	public static volatile SingularAttribute<Beneficiario, String> ben_apellido;
	public static volatile SingularAttribute<Beneficiario, Integer> benRegUsu;
	public static volatile SingularAttribute<Beneficiario, Integer> benEstado;
	public static volatile SingularAttribute<Beneficiario, String> benTelefono;
	public static volatile SingularAttribute<Beneficiario, String> benDireccion;
	public static volatile SingularAttribute<Beneficiario, Integer> benId;
	public static volatile SingularAttribute<Beneficiario, Integer> orgIdBen;
	public static volatile SingularAttribute<Beneficiario, Integer> benEliminado;
	public static volatile SingularAttribute<Beneficiario, Integer> catIdTipoOrgPer;
	public static volatile SingularAttribute<Beneficiario, Integer> catIdTipoNac;
	public static volatile SingularAttribute<Beneficiario, Integer> catIdTipoIdentificacion;
	public static volatile SingularAttribute<Beneficiario, String> benCorreo;
	public static volatile SingularAttribute<Beneficiario, String> benIdentificacion;

}

