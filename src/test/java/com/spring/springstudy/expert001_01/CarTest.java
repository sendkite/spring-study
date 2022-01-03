package com.spring.springstudy.expert001_01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void getTireBrand() {
       Car car = new Car();
       assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
    }
}