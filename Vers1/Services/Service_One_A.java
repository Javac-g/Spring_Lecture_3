package com.company.Vers1.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_One_A {
    @Value("${prop.A}")
    private String one;
    @Value("${prop.B}")
    private String two;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }
}
