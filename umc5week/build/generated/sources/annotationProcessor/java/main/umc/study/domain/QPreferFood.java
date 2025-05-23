package umc.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPreferFood is a Querydsl query type for PreferFood
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPreferFood extends EntityPathBase<PreferFood> {

    private static final long serialVersionUID = -1690002160L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPreferFood preferFood = new QPreferFood("preferFood");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> foodId = createNumber("foodId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUserMain userMain;

    public QPreferFood(String variable) {
        this(PreferFood.class, forVariable(variable), INITS);
    }

    public QPreferFood(Path<? extends PreferFood> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPreferFood(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPreferFood(PathMetadata metadata, PathInits inits) {
        this(PreferFood.class, metadata, inits);
    }

    public QPreferFood(Class<? extends PreferFood> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.userMain = inits.isInitialized("userMain") ? new QUserMain(forProperty("userMain"), inits.get("userMain")) : null;
    }

}

