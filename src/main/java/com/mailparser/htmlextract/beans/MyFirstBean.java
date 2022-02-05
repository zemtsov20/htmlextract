package com.mailparser.htmlextract.beans;


import com.mailparser.htmlextract.entity.UrlEntity;
import com.mailparser.htmlextract.repository.UrlEntityRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

public class MyFirstBean {

    public MyFirstBean() {
        System.out.println("MyFirstBean created!");
    }

    @Bean
    ApplicationRunner init(UrlEntityRepository repos) {
        String[] data = {
                "https://en.wikipedia.org/wiki/Jakarta_Mail",
                "https://de.wikipedia.org/wiki/Jakarta_Mail"
        };

        return args -> Stream.of(data).forEach(url -> repos.save(new UrlEntity(url)));
    }

//    @PostConstruct
//    public void afterStart(){
////        while (true)
//        {
//            System.out.println("afterStart");
//        }
//    }
}
