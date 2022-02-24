package com.mailparser.htmlextract.schedule;

import com.mailparser.htmlextract.beans.GetHtmlBean;
import com.mailparser.htmlextract.repository.UrlDataEntityRepository;
import com.mailparser.htmlextract.repository.UrlEntityRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScheduledTask {

//    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Autowired
    private UrlEntityRepository urlEntityRepository;
    @Autowired
    private UrlDataEntityRepository urlDataEntityRepository;
    @Autowired
    private GetHtmlBean getHtmlBean;

    @Scheduled(fixedRate = 1000 * 10)
    //@Scheduled(fixedRate = 1000 * 60 * 60)
    public void getHtml() {
        if(urlEntityRepository.findById(2L).isPresent()) {
            urlDataEntityRepository.
                    save(getHtmlBean.
                            getHtmlByUrl(urlEntityRepository.
                                    findById(2L).get().getUrl()));
//            log.info(urlEntityRepository.findById(1L).get().getUrl());
        }
//        log.info(String.valueOf(urlEntityRepository.findById(0L).get()));
//        log.info(String.valueOf(urlEntityRepository.findById(1L).get()));

    }
}
