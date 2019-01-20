package pl.jakubkowaczuk.aplikacja.controller.model;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class OrderRequestDto {
    @NotNull
    private String name;
    @NotNull
    private String price;

}
