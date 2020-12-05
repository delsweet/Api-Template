package com.test.api.TestApi.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class HelloWorldScheduler {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldScheduler.class);

    @Autowired
    RestTemplate restTemplate;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        String quote = restTemplate.getForObject("http://localhost:8080/api/helloworld", String.class);
        log.info("{} {}",quote, dateFormat.format(new Date()));
    }

}
