package com.company.Vers4.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Four_A {
    @Value("${prop.G}")
    private String one;

    public String getOne() {
        return one;
    }
}
