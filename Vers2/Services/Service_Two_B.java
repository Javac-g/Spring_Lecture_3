package com.company.Vers2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class Service_Two_B {
    @Value("${prop.L1}")
    private String one;

    public String getOne() {
        return one;
    }


}
