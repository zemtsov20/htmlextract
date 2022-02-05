package com.mailparser.htmlextract;

import com.mailparser.htmlextract.entity.UrlEntity;
import com.mailparser.htmlextract.repository.UrlEntityRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.ParseException;
import java.util.stream.Stream;

@SpringBootApplication
@EnableScheduling
//@ComponentScan("ru.worker.config")
public class HtmlextractApplication {
    public static void main(String[] args) {
        SpringApplication.run(HtmlextractApplication.class, args);

    }
}