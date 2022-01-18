package com.mailparser.htmlextract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("ru.worker.config")
public class HtmlextractApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtmlextractApplication.class, args);
    }

}
