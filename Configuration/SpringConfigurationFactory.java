package com.company.Configuration;

import com.company.MainVersion.Controller.Controller;
import com.company.MainVersion.Service.Service;
import com.company.Vers1.Controller.ControllerOne;
import com.company.Vers1.Services.Service_One_A;
import com.company.Vers3.Controller.ControllerThree;
import com.company.Vers3.Services.Service_Three_A;
import com.company.Vers3.Services.Service_Three_B;
import com.company.Vers4.Controller.ControllerFour;
import com.company.Vers4.Services.Service_Four_A;
import com.company.Vers4.Services.Service_Four_B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

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
    @Bean(name = "Service_Three_A")
    @Scope(value = "prototype")
    public Service_Three_A service_three_a(){
        return new Service_Three_A();
    }
    @Bean(name = "Service_Three_B")
    @Scope(value = "prototype")
    public Service_Three_B service_three_b(){
        return new Service_Three_B();
    }

    @Bean(name = "Service_Four_A")
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)//Use proxyMode
    public Service_Four_A service_four_a(){
        return new Service_Four_A();
    }
    @Bean(name = "Service_Four_B")
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Service_Four_B service_four_b(){
        return new Service_Four_B();
    }

    /////////////////////////////////////////  C-O-N-T-R-O-L-L-E-R-S   ///////////////////////////////////////////////
    @Bean(name = "Controller")  // Main Controller . Lazy to create new project.
    public Controller controllerBean(){

        return new Controller(serviceBean()); // Constructor binding
    }
    @Bean(name = "ControllerOne")
    @Scope(value = "prototype")
    public ControllerOne controllerOneBean(){
        ControllerOne controllerOne = new ControllerOne();
        controllerOne.setService_one_a(service_one_a()); //Method binding
        return controllerOne;
    }
    @Bean("ControllerThree")
    public ControllerThree controllerThree(){
        ControllerThree controllerThree = new ControllerThree(){ //Anonimous classes
            @Override
            protected Service_Three_A getService_three_a(){
                return  service_three_a();
            }

            @Override
            protected Service_Three_B getService_three_b(){
                return service_three_b();
            }
        };
        return controllerThree;

    }
    @Bean("ControllerFour")
    public ControllerFour controllerFour(){
        ControllerFour controllerFour = new ControllerFour();
        controllerFour.setService_four_a(service_four_a());
        controllerFour.setService_four_b(service_four_b());
        return controllerFour;
    }

}
