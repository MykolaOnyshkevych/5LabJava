package ua.lviv.iot.gym;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.gym.dataaccess", "ua.lviv.iot.gym.business",
       "ua.lviv.iot.gym.controller" })
@EnableJpaRepositories("ua.lviv.iot.gym.dataaccess")
public class RestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}