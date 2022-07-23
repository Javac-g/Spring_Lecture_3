package com.company.MainVersion.Controller;

import com.company.MainVersion.Service.ResponseDTO;
import com.company.MainVersion.Service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/f",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO findData(@RequestParam Integer id){
        log.info("\nhttp://192.168.0.102:8080/Main/f?id=" + id);
        return service.read(id);
    }
    @PutMapping(value = "/u",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO updateData(@RequestParam Integer id, @RequestBody RequestDTO json){
        log.info("\nhttp://192.168.0.102:8080/Main/u?id=" + id);
        log.info("\nJSON: " + json);
        return service.update(id, json);
    }

    @DeleteMapping(value = "/d",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String deleteData(@RequestParam Integer id){

        if (id > 2){

            log.info("\nhttp://192.168.0.102:8080/Main/d -- DELETE A");

            return service.print("Was deleted person N: " + service.Delete_A(id));

        } else if (id <=2) {

            log.info("\nhttp://192.168.0.102:8080/Main/d -- DELETE B");

            return service.print("Was deleted person N: ") + service.Delete_B(id);
        }

        return "Nobody deleted!";
    }

}
