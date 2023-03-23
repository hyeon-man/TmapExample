package kr.ac.kopo.tmapexample.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class SimpleResponseDto implements Serializable {

    private String city;

    private String cityCode;
    public static SimpleResponseDto get(String city, String cityCode) {
        return SimpleResponseDto.builder()
                .city(city)
                .cityCode(cityCode)
                .build();

    }
}
