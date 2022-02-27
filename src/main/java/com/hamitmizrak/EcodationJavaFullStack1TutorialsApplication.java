package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//security dahil etme
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
public class EcodationJavaFullStack1TutorialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcodationJavaFullStack1TutorialsApplication.class, args);
    }

}
