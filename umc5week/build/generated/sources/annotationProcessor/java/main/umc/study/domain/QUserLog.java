package umc.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserLog is a Querydsl query type for UserLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserLog extends EntityPathBase<UserLog> {

    private static final long serialVersionUID = -1417440201L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserLog userLog = new QUserLog("userLog");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> loginCount = createNumber("loginCount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> loginTime = createDateTime("loginTime", java.time.LocalDateTime.class);

    public final QMember member;

    public final DateTimePath<java.time.LocalDateTime> passwordChangeTime = createDateTime("passwordChangeTime", java.time.LocalDateTime.class);

    public final NumberPath<Integer> paymentCount = createNumber("paymentCount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> signUpTime = createDateTime("signUpTime", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUserMain userMain;

    public QUserLog(String variable) {
        this(UserLog.class, forVariable(variable), INITS);
    }

    public QUserLog(Path<? extends UserLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserLog(PathMetadata metadata, PathInits inits) {
        this(UserLog.class, metadata, inits);
    }

    public QUserLog(Class<? extends UserLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.userMain = inits.isInitialized("userMain") ? new QUserMain(forProperty("userMain"), inits.get("userMain")) : null;
    }

}

