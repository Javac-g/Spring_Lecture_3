package com.company.Vers3.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Three_B {
    @Value("${prop.C1}")
    private String two;

    public String getTwo() {
        return two;
    }
}
