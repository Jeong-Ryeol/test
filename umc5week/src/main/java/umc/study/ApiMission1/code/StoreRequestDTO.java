package umc.study.ApiMission1.code;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class StoreRequestDTO {

    @NotBlank(message = "가게 이름은 필수입니다.")
    private String name;

    @NotBlank(message = "주소는 필수입니다.")
    private String address;

    @NotNull(message = "점수는 필수입니다.")
    private Float score;

    @NotNull(message = "regionId는 필수입니다.")
    private Long regionId;

    @NotNull(message = "userMainId는 필수입니다.")
    private Long userMainId;
}
