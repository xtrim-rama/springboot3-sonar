package com.bintybyte.sonarqubedemo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {

    public String getMessage(){
        String str = "Hello World";
        Object obj = getObject();
        System.out.println(obj.toString());
        return  str;
    }
    private Object getObject(){
        return null;
    }
}
