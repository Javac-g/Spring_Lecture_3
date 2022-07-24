package com.company.Vers4.Controller;

import com.company.Vers4.Services.Service_Four_A;
import com.company.Vers4.Services.Service_Four_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Four")
public class ControllerFour {

    private final static Logger logger = LoggerFactory.getLogger(ControllerFour.class);
    private Service_Four_A service_four_a;
    private Service_Four_B service_four_b;

    public void setService_four_a(Service_Four_A service_four_a) {
        this.service_four_a = service_four_a;
    }

    public void setService_four_b(Service_Four_B service_four_b) {
        this.service_four_b = service_four_b;
    }
    @RequestMapping(value = "/S", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE) //@GetMapping alternative
    @ResponseBody
    public String service(){
        logger.info("http://192.168.0.104:8080/Four/S");
        logger.info("A: " + service_four_a);
        logger.info("B: " + service_four_b);
        return "\n" + service_four_a.getOne() + "\n" + service_four_b.getOne();
    }

}
