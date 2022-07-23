package com.company.Configuration;

import com.company.MainVersion.Controller.Controller;
import com.company.MainVersion.Service.Service;
import com.company.Vers1.Controller.ControllerOne;
import com.company.Vers1.Services.Service_One_A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfigurationFactory {

    /////////////////////////////////////////  B-E-A-N-S   ///////////////////////////////////////////////

    @Bean(name = "Service") // Main Service
    public Service serviceBean(){
        return new Service();
    }
    @Bean(name = "Service_One_A")
    @Scope(value = "prototype")
    public Service_One_A service_one_a(){
        return new Service_One_A();
    }
    /////////////////////////////////////////  C-O-N-T-R-O-L-L-E-R-S   ///////////////////////////////////////////////
    @Bean(name = "Controller")  // Main Controller . Lazy to create new project.
    public Controller controllerBean(){

        return new Controller(serviceBean());
    }
    @Bean(name = "ControllerOne")
    public ControllerOne controllerOneBean(){
        ControllerOne controllerOne = new ControllerOne();
        controllerOne.setService_one_a(service_one_a());
        return controllerOne;
    }

}
