package pl.jakubkowaczuk.aplikacja.service.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
    private String name;
    private String price;
    private Integer amount;
}
