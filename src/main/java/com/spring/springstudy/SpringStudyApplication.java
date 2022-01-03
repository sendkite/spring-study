package com.spring.springstudy;

import com.spring.springstudy.expert001_01.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudyApplication {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getTireBrand());
        SpringApplication.run(SpringStudyApplication.class, args);
    }

}
