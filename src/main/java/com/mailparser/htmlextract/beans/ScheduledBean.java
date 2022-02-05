package com.mailparser.htmlextract.beans;

import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledBean {
    @Scheduled(fixedRate = 1000 * 60 * 60)
    public String sheduledTask(String url) {
        //getUrlFromDB();
        //extractHtmlFromUrl();
        //putHtmlInDB();
        return null;
    }
}
