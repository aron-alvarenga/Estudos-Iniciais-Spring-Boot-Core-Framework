package com.aronalvarenga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAppApplication {

    private DemoAppConfiguration demoAppConfiguration;

    @Autowired
    public DemoAppApplication(DemoAppConfiguration demoAppConfiguration) {
        this.demoAppConfiguration = demoAppConfiguration;
    }

    @Value("${app.message}")
    private String message;


    public static void main(String[] args) {SpringApplication.run(DemoAppApplication.class, args);}

    @GetMapping("/inicio")
    public String inicio() {
        return "Ola Spring Boot" + " ["+message+"]";
    }

    @GetMapping("/configuracao")
    public String config(){
        return demoAppConfiguration.getMessage();
    }
}
