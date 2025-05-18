package umc.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceRegister is a Querydsl query type for ServiceRegister
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QServiceRegister extends EntityPathBase<ServiceRegister> {

    private static final long serialVersionUID = 765338422L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceRegister serviceRegister = new QServiceRegister("serviceRegister");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUserMain userMain;

    public QServiceRegister(String variable) {
        this(ServiceRegister.class, forVariable(variable), INITS);
    }

    public QServiceRegister(Path<? extends ServiceRegister> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceRegister(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceRegister(PathMetadata metadata, PathInits inits) {
        this(ServiceRegister.class, metadata, inits);
    }

    public QServiceRegister(Class<? extends ServiceRegister> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userMain = inits.isInitialized("userMain") ? new QUserMain(forProperty("userMain"), inits.get("userMain")) : null;
    }

}

