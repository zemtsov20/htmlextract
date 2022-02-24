package com.mailparser.htmlextract.beans;

import com.mailparser.htmlextract.entity.UrlEntity;
import com.mailparser.htmlextract.repository.UrlEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitBean implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(InitBean.class);

    @Autowired
    private UrlEntityRepository urlEntityRepository;

    @Override
    public void run(ApplicationArguments args) {
        try {
            urlEntityRepository.save(new UrlEntity("https://en.wikipedia.org/wiki/Jakarta_Mail"));
        }
        catch (Exception e) {
            log.error("Error while trying to save url: " + e);
        }
    }

}
