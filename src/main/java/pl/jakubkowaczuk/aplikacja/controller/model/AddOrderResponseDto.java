package pl.jakubkowaczuk.aplikacja.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddOrderResponseDto {
    private String name;
    private String price;
    private Integer amount;

}
