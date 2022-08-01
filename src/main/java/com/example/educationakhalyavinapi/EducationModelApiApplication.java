package com.example.educationakhalyavinapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class EducationModelApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationModelApiApplication.class, args);
    }
}
