package pl.jakubkowaczuk.aplikacja.component;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pl.jakubkowaczuk.aplikacja.service.OrderService;

@Component
@RequiredArgsConstructor
public class ScheduledTasks {

    @Autowired
    private OrderService orr;


    @Scheduled(fixedRate = 30000)
    public void removeOrder() {
        orr.removeOrder();
        System.out.println("Dzialam co 5 sek");
    }

}
