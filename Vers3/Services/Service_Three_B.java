package com.company.Vers3.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Three_B {
    @Value("${prop.F}")
    private String two;

    public String getTwo() {
        return two;
    }
}
