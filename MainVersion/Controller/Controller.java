package com.company.MainVersion.Controller;

import com.company.MainVersion.Service.ResponseDTO;
import com.company.MainVersion.Service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Main")
public class Controller {
    private final static Logger log = LoggerFactory.getLogger(Controller.class);
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }
    @PostMapping(value = "/a",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO addData(@RequestBody RequestDTO user){
        log.info("\nhttp://192.168.0.102:8080/Main/a");
        log.info("Created: " + user);
        return service.create(user);
    }

}
