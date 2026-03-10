package com.busanit501.ljj980413springbootorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Ljj980413SpringBootOrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ljj980413SpringBootOrmApplication.class, args);
    }

}
