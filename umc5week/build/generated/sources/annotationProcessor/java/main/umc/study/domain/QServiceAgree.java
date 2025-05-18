package umc.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceAgree is a Querydsl query type for ServiceAgree
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QServiceAgree extends EntityPathBase<ServiceAgree> {

    private static final long serialVersionUID = -932380935L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceAgree serviceAgree = new QServiceAgree("serviceAgree");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final DateTimePath<java.time.LocalDateTime> agreedAt = createDateTime("agreedAt", java.time.LocalDateTime.class);

    public final BooleanPath consentStatus = createBoolean("consentStatus");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final StringPath termsCode = createString("termsCode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUserMain userMain;

    public QServiceAgree(String variable) {
        this(ServiceAgree.class, forVariable(variable), INITS);
    }

    public QServiceAgree(Path<? extends ServiceAgree> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceAgree(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceAgree(PathMetadata metadata, PathInits inits) {
        this(ServiceAgree.class, metadata, inits);
    }

    public QServiceAgree(Class<? extends ServiceAgree> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.userMain = inits.isInitialized("userMain") ? new QUserMain(forProperty("userMain"), inits.get("userMain")) : null;
    }

}

