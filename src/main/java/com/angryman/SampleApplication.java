package com.angryman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {
    public static void main(final String[] args) {
        final SpringApplication springApplication = new SpringApplication();
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(SampleApplication.class, args);
    }
}
