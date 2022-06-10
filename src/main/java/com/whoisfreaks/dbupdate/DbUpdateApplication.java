package com.whoisfreaks.dbupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DbUpdateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbUpdateApplication.class, args);
    }
}


