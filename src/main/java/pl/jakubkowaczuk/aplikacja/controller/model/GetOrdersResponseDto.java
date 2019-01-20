package pl.jakubkowaczuk.aplikacja.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetOrdersResponseDto {
    private String name;
    private String price;
    private Integer amount;


}
