package pl.jakubkowaczuk.aplikacja.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.jakubkowaczuk.aplikacja.component.ScheduledTasks;
import pl.jakubkowaczuk.aplikacja.controller.model.AddOrderRequestDto;
import pl.jakubkowaczuk.aplikacja.controller.model.AddOrderResponseDto;
import pl.jakubkowaczuk.aplikacja.controller.model.GetOrdersResponseDto;
import pl.jakubkowaczuk.aplikacja.service.OrderService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @PostMapping(value = "orders")
    public AddOrderResponseDto addOrder(@RequestBody @Valid AddOrderRequestDto request) {
        AddOrderResponseDto addOrder = orderService.addOrder(request);

        return addOrder;

    }

    @GetMapping(value = "orders")
    public List<GetOrdersResponseDto> getOrders() {

        return orderService.getOrders();
    }



}
