package umc.study.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.study.domain.mapping.MemberAgree;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Terms extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String title;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private Boolean optional;

    @OneToMany(mappedBy = "terms", cascade=CascadeType.ALL)
    private List<MemberAgree> memberAgreeList = new ArrayList<>();
}