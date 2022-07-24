package com.company.Vers1.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class Service_One_B {
    private String one;
    private String two;

    @Autowired
    public Service_One_B(@Value("${prop.KeyTwo}") String one, @Value("${prop.KeyFour}") String two) {
        this.one = one;
        this.two = two;
    }

    public String getOne() {
        return one;
    }



    public String getTwo() {
        return two;
    }


}
