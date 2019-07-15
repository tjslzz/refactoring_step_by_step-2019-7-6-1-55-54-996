package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    private Driver driver;

    @BeforeEach
    void setUp() { driver = new Driver(); }

    @Test
    public void should_return_true_when_call_checkDriver_given_18_driver(){
        //given
        driver.setAge(18);
        //when
        Boolean result = driver.isLegalAge();
        //then
        Assertions.assertEquals(true,result);

    }

    @Test
    public void should_return_true_when_call_checkDriver_given_19_driver(){
        //given
        driver.setAge(19);
        //when
        Boolean result = driver.isLegalAge();
        //then
        Assertions.assertEquals(true,result);

    }

    @Test
    public void should_return_false_when_call_checkDriver_given_0_driver(){
        //given
        driver.setAge(0);
        //when
        Boolean result = driver.isLegalAge();
        //then
        Assertions.assertEquals(false,result);
    }
}