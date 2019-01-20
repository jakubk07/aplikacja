package pl.jakubkowaczuk.aplikacja.service;

import ch.qos.logback.core.util.FixedDelay;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.jakubkowaczuk.aplikacja.component.ScheduledTasks;
import pl.jakubkowaczuk.aplikacja.controller.model.AddOrderRequestDto;
import pl.jakubkowaczuk.aplikacja.controller.model.AddOrderResponseDto;
import pl.jakubkowaczuk.aplikacja.controller.model.GetOrdersResponseDto;
import pl.jakubkowaczuk.aplikacja.service.model.Order;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@NoArgsConstructor

public class OrderService {


    private List<Order> orders = new ArrayList<>();


    public AddOrderResponseDto addOrder(AddOrderRequestDto request) {

        Order tmpOrder = Order.builder().name(request.getName()).build();
        orders.add(tmpOrder);


        return AddOrderResponseDto.builder()
                .name(tmpOrder.getName())
                .price(tmpOrder.getPrice())
                .amount(tmpOrder.getAmount()).build();
//        return AddOrder.builder().result("1212").build();
    }

    public List<GetOrdersResponseDto> getOrders() {

        return orders.stream().map(order -> GetOrdersResponseDto.builder()
                .name(order.getName())
                .price(order.getPrice())
                .amount(order.getAmount()).build()).collect(toList());
    }


    public void removeOrder(){
        if(!orders.isEmpty()){
            orders.remove(0);
        }
    }


}
