package umc.study.converter;

import umc.study.ApiMission2.code.ReviewRequestDTO;
import umc.study.ApiMission2.code.ReviewResponseDTO;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.domain.UserMain;

public class ReviewConverter {
    public static Review toReview(ReviewRequestDTO dto, Store store, UserMain user) {
        return Review.builder()
                .score(dto.getScore())
                .body(dto.getBody())
                .title(dto.getTitle())
                .store(store)
                .userMain(user)
                .build();
    }

    public static ReviewResponseDTO toResponseDTO(Review review) {
        return ReviewResponseDTO.builder()
                .reviewId(review.getId())
                .body(review.getBody())
                .score(review.getScore())
                .storeName(review.getStore().getName())
                .userName(review.getUserMain().getName())
                .build();
    }
}