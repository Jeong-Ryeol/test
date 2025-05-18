package umc.study.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import umc.study.ApiMission2.code.ReviewRequestDTO;
import umc.study.ApiPayload.code.status.ErrorStatus;
import umc.study.repository.ReviewRepository;
import umc.study.validation.annotation.AlreadyReviewed;

@Component
@RequiredArgsConstructor
public class AlreadyReviewedValidator implements ConstraintValidator<AlreadyReviewed, ReviewRequestDTO> {

    private final ReviewRepository reviewRepository;

    @Override
    public boolean isValid(ReviewRequestDTO dto, ConstraintValidatorContext context) {
        boolean exists = reviewRepository.existsByUserMainIdAndStoreId(dto.getUserMainId(), dto.getStoreId());

        if (exists) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("이미 리뷰를 작성한 가게입니다.").addConstraintViolation();
            return false;
        }
        return true;
    }
}
