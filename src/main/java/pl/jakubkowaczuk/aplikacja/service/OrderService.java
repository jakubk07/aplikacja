package pl.jakubkowaczuk.aplikacja.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.jakubkowaczuk.aplikacja.controller.model.OrderRequestDto;

@Service
@NoArgsConstructor

public class OrderService {
    public Order order(OrderRequestDto request) {

        return Order.builder().result("1212").build();
    }
}
