package umc.study.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import umc.study.repository.MemberMissionRepository;
import umc.study.domain.enums.MissionStatus;
import umc.study.validation.annotation.AlreadyChallenging;

@Component
@RequiredArgsConstructor
public class AlreadyChallengingValidator implements ConstraintValidator<AlreadyChallenging, Long> {

    private final MemberMissionRepository memberMissionRepository;

    @Override
    public boolean isValid(Long missionId, ConstraintValidatorContext context) {


        return true;
    }
}
