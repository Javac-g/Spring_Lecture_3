package com.company.Configuration;

import com.company.MainVersion.Controller.Controller;
import com.company.MainVersion.Service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean(name = "Service") // Main Service
    public Service serviceBean(){
        return new Service();
    }

    @Bean(name = "Controller")  // Main Controller . Lazy to create new project.
    public Controller controllerBean(){

        return new Controller(serviceBean());
    }

}
