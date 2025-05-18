package umc.study.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import umc.study.repository.StoreRepository.StoreRepository;
import umc.study.validation.annotation.ExistStore;

@Component
@RequiredArgsConstructor
public class ExistStoreValidator implements ConstraintValidator<ExistStore, Long> {

    private final StoreRepository storeRepository;

    @Override
    public boolean isValid(Long storeId, ConstraintValidatorContext context) {
        if (storeId == null) return false;

        boolean exists = storeRepository.existsById(storeId);

        if (!exists) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("존재하지 않는 가게입니다.").addConstraintViolation();
        }

        return exists;
    }
}
