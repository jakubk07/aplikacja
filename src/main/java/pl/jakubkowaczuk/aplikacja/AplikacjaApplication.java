package pl.jakubkowaczuk.aplikacja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AplikacjaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AplikacjaApplication.class, args);
    }

}

