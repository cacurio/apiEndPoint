package com.websystique.springmvc.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBeneficiario is a Querydsl query type for Beneficiario
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBeneficiario extends EntityPathBase<Beneficiario> {

    private static final long serialVersionUID = 1250790632L;

    public static final QBeneficiario beneficiario = new QBeneficiario("beneficiario");

    public final NumberPath<Integer> catEstadoCivil = createNumber("catEstadoCivil", Integer.class);

    public final NumberPath<Integer> catEtnia = createNumber("catEtnia", Integer.class);

    public final NumberPath<Integer> catGenero = createNumber("catGenero", Integer.class);

    public final NumberPath<Integer> catIdipoNac = createNumber("catIdipoNac", Integer.class);

    public final NumberPath<Integer> catPuebloIndigena = createNumber("catPuebloIndigena", Integer.class);

    public final NumberPath<Integer> catTipoIdentificacion = createNumber("catTipoIdentificacion", Integer.class);

    public final BooleanPath per_eliminado = createBoolean("per_eliminado");

    public final StringPath perApellido = createString("perApellido");

    public final StringPath perCelular = createString("perCelular");

    public final StringPath perCorreo = createString("perCorreo");

    public final StringPath perDirDomicilio = createString("perDirDomicilio");

    public final NumberPath<Integer> perEstado = createNumber("perEstado", Integer.class);

    public final DatePath<java.sql.Date> perFechaDefuncion = createDate("perFechaDefuncion", java.sql.Date.class);

    public final DatePath<java.sql.Date> perFechaechaNac = createDate("perFechaechaNac", java.sql.Date.class);

    public final StringPath perFuente = createString("perFuente");

    public final DateTimePath<java.sql.Timestamp> perFuenteFecha = createDateTime("perFuenteFecha", java.sql.Timestamp.class);

    public final NumberPath<Integer> perFuenteId = createNumber("perFuenteId", Integer.class);

    public final NumberPath<Integer> perId = createNumber("perId", Integer.class);

    public final StringPath perIdentificacion = createString("perIdentificacion");

    public final StringPath perNombre = createString("perNombre");

    public final StringPath perNombres = createString("perNombres");

    public final StringPath perRcCondicion = createString("perRcCondicion");

    public final DateTimePath<java.sql.Timestamp> perRegFecha = createDateTime("perRegFecha", java.sql.Timestamp.class);

    public final NumberPath<Integer> perRegUsu = createNumber("perRegUsu", Integer.class);

    public final StringPath perTelefono = createString("perTelefono");

    public final NumberPath<Integer> ubiIdDomicilio = createNumber("ubiIdDomicilio", Integer.class);

    public final NumberPath<Integer> ubiIdLugarNac = createNumber("ubiIdLugarNac", Integer.class);

    public QBeneficiario(String variable) {
        super(Beneficiario.class, forVariable(variable));
    }

    public QBeneficiario(Path<? extends Beneficiario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBeneficiario(PathMetadata<?> metadata) {
        super(Beneficiario.class, metadata);
    }

}

