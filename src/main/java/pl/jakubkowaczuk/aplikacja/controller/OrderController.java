package pl.jakubkowaczuk.aplikacja.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.jakubkowaczuk.aplikacja.controller.model.OrderRequestDto;
import pl.jakubkowaczuk.aplikacja.controller.model.OrderResponseDto;
import pl.jakubkowaczuk.aplikacja.service.Order;
import pl.jakubkowaczuk.aplikacja.service.OrderService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping(value = "orders")
    public OrderResponseDto order(@RequestBody @Valid OrderRequestDto request) {
        Order order = orderService.order(request);


        return OrderResponseDto.builder().result(order.getResult())
                .build();

    }
}
