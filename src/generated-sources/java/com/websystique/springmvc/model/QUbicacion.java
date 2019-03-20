package com.websystique.springmvc.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUbicacion is a Querydsl query type for Ubicacion
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUbicacion extends EntityPathBase<Ubicacion> {

    private static final long serialVersionUID = -1940389199L;

    public static final QUbicacion ubicacion = new QUbicacion("ubicacion");

    public final StringPath ubiCodInec = createString("ubiCodInec");

    public final NumberPath<Integer> ubiId = createNumber("ubiId", Integer.class);

    public final StringPath ubiNombre = createString("ubiNombre");

    public QUbicacion(String variable) {
        super(Ubicacion.class, forVariable(variable));
    }

    public QUbicacion(Path<? extends Ubicacion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUbicacion(PathMetadata<?> metadata) {
        super(Ubicacion.class, metadata);
    }

}

