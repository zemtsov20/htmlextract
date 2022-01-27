package com.mailparser.htmlextract.config;

import com.mailparser.htmlextract.beans.MyFirstBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class Config {

    @Bean
    public MyFirstBean getMyFirstBean(){
        return new MyFirstBean();
    }
}
