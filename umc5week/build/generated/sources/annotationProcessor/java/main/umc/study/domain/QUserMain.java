package umc.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserMain is a Querydsl query type for UserMain
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserMain extends EntityPathBase<UserMain> {

    private static final long serialVersionUID = -990956762L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserMain userMain = new QUserMain("userMain");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final ListPath<Alarm, QAlarm> alarms = this.<Alarm, QAlarm>createList("alarms", Alarm.class, QAlarm.class, PathInits.DIRECT2);

    public final NumberPath<Long> birthday = createNumber("birthday", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> gender = createNumber("gender", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<PreferFood, QPreferFood> preferFoods = this.<PreferFood, QPreferFood>createList("preferFoods", PreferFood.class, QPreferFood.class, PathInits.DIRECT2);

    public final ListPath<Review, QReview> reviews = this.<Review, QReview>createList("reviews", Review.class, QReview.class, PathInits.DIRECT2);

    public final ListPath<ServiceAgree, QServiceAgree> serviceAgreements = this.<ServiceAgree, QServiceAgree>createList("serviceAgreements", ServiceAgree.class, QServiceAgree.class, PathInits.DIRECT2);

    public final StringPath status = createString("status");

    public final ListPath<Store, QStore> stores = this.<Store, QStore>createList("stores", Store.class, QStore.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath userId = createString("userId");

    public final QUserLog userLog;

    public final StringPath userPwd = createString("userPwd");

    public QUserMain(String variable) {
        this(UserMain.class, forVariable(variable), INITS);
    }

    public QUserMain(Path<? extends UserMain> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserMain(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserMain(PathMetadata metadata, PathInits inits) {
        this(UserMain.class, metadata, inits);
    }

    public QUserMain(Class<? extends UserMain> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userLog = inits.isInitialized("userLog") ? new QUserLog(forProperty("userLog"), inits.get("userLog")) : null;
    }

}

