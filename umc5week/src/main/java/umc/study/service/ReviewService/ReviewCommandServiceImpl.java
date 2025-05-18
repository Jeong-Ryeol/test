package umc.study.service.ReviewService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.ApiMission2.code.ReviewRequestDTO;
import umc.study.converter.ReviewConverter;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.domain.UserMain;
import umc.study.repository.StoreRepository.StoreRepository;
import umc.study.repository.UserMainRepository;

@Service
@RequiredArgsConstructor
public class ReviewCommandServiceImpl implements ReviewCommandService {

    private final StoreRepository storeRepository;
    private final UserMainRepository userMainRepository;
    private final ReviewRepository reviewRepository;

    @Override
    @Transactional
    public Review writeReview(ReviewRequestDTO request) {
        Store store = storeRepository.findById(request.getStoreId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 가게입니다."));

        UserMain user = userMainRepository.findById(request.getUserMainId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자입니다."));

        Review review = ReviewConverter.toReview(request, store, user);
        return reviewRepository.save(review);
    }
}