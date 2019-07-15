package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {

    private Police police;
    private Driver driver;

    @BeforeEach
    void setUp() {
        police = new Police();
        driver = new Driver(0);
    }

    @Test
    public void should_return_true_when_call_checkDriver_given_18_driver(){
        //given
        driver.setAge(18);
        //when
        Boolean result = police.checkDriverAgeValid(driver);
        //then
        Assertions.assertEquals(true,result);

    }

    @Test
    public void should_return_true_when_call_checkDriver_given_19_driver(){
        //given
        driver.setAge(19);
        //when
        Boolean result = police.checkDriverAgeValid(driver);
        //then
        Assertions.assertEquals(true,result);

    }

    @Test
    public void should_return_false_when_call_checkDriver_given_0_driver(){
        //given
        driver.setAge(0);
        //when
        Boolean result = police.checkDriverAgeValid(driver);
        //then
        Assertions.assertEquals(false,result);
    }

//    //Not unValid Comment
//    @Test
//    public void should_return_false_when_call_checkDriver_given_null_driver(){
//        //given
//        Police police = new Police();
//        //when
//        Boolean result = police.checkDriverAgeValid(null);
//        //then
//        Assertions.assertEquals(true,result);
//    }
}