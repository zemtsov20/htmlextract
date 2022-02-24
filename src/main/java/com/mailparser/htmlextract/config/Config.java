package com.mailparser.htmlextract.config;

import com.mailparser.htmlextract.beans.GetHtmlBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class Config {

    @Bean
    public GetHtmlBean getMyFirstBean(){
        return new GetHtmlBean();
    }
}
