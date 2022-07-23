package com.company.Vers2.Controllers;

import com.company.Vers2.Services.Service_Two_A;
import com.company.Vers2.Services.Service_Two_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Second")
public class ControllerTwo {
    private Service_Two_A service_two_a;
    private Service_Two_B service_two_b;
    private final static Logger logger = LoggerFactory.getLogger(ControllerTwo.class);


    @Lookup
    public Service_Two_A getService_two_a() {
        return null;
    }
    @Lookup
    public Service_Two_B getService_two_b() {
        return null;
    }
    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("https://192.168.0.104:8080/Second/S");
        logger.info("A: " + getService_two_a());
        logger.info("B: " + getService_two_b());
        return "\n"+getService_two_a().getTwo() + "\n"+getService_two_b().getOne();
    }
}
