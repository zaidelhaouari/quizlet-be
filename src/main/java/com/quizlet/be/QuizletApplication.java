package com.quizlet.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.quizlet.be.repositories")
//@EntityScan(basePackages = "com.quizlet.be.entities")
public class QuizletApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizletApplication.class, args);
    }

}