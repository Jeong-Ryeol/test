package umc.study.service.ReviewService;

import umc.ApiMission2.code.ReviewRequestDTO;
import umc.study.domain.Review;

public interface ReviewCommandService {
    Review writeReview(ReviewRequestDTO request);
}