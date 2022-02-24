package com.mailparser.htmlextract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HtmlextractApplication {
    public static void main(String[] args) {
        SpringApplication.run(HtmlextractApplication.class, args);
    }
}