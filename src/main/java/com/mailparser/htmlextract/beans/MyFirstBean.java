package com.mailparser.htmlextract.beans;


import javax.annotation.PostConstruct;

public class MyFirstBean {

    public MyFirstBean() {
        System.out.println("MyFirstBean created!");
    }

    @PostConstruct
    public void afterStart(){
//        while (true)
        {
            System.out.println("afterStart");
        }
    }
}
