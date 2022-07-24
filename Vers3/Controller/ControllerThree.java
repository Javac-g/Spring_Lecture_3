package com.company.Vers3.Controller;

import com.company.Vers3.Services.Service_Three_A;
import com.company.Vers3.Services.Service_Three_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/Third")
public class ControllerThree {
    private Service_Three_A service_three_a;
    private Service_Three_B service_three_b;

    private final static Logger logger = LoggerFactory.getLogger(ControllerThree.class);

    protected Service_Three_A getService_three_a(){
        throw  new UnsupportedOperationException();
    }
    protected Service_Three_B getService_three_b(){
        throw  new UnsupportedOperationException();
    }
    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("https://192.168.0.104:8080/Third/S");
        logger.info("A: " + getService_three_a());
        logger.info("B: " + getService_three_b());
        return "\n" + getService_three_a().getOne() +"\n" + getService_three_b().getTwo();
    }
}
