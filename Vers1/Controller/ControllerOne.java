package com.company.Vers1.Controller;

import com.company.Vers1.Services.Service_One_A;
import com.company.Vers1.Services.Service_One_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/First")
public class ControllerOne {

    private Service_One_A service_one_a;

    @Autowired
    private Service_One_B service_one_b;

    Logger logger = LoggerFactory.getLogger(ControllerOne.class);



    public void setService_one_a(Service_One_A service_one_a) {
        this.service_one_a = service_one_a;
    }

    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        return "\n" +  service_one_a.getOne() + "\n" + service_one_a.getTwo() + "\n" + service_one_b.getOne() + "\n" + service_one_b.getTwo();
    }
}
