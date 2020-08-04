package ru.eshmakar.sheduledtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SheduledTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SheduledTaskApplication.class, args);
    }

}
