package com.company.Vers2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class Service_Two_A {
    @Value("${prop.C}")
    private String two;

    public String getTwo() {
        return two;
    }

}
