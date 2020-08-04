package ru.eshmakar.sheduledtask;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SheduledTask {
    private static final Logger log = LoggerFactory.getLogger(SheduledTask.class);
    int i = 1;
    @Scheduled(fixedRate = 100)
    public void reportCurrentTime(){
        log.info(String.valueOf(Math.pow(++i,++i)));
    }

}
