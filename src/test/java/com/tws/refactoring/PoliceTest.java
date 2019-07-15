package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {

    @Test
    public void should_return_true_when_call_checkDriver_given_18_driver(){
        //given
        Driver driver = new Driver(18);
        Police police = new Police();
        //when
        Boolean result = police.checkDriverAgeValid(driver);
        //then
        Assertions.assertEquals(true,result);

    }

    @Test
    public void should_return_true_when_call_checkDriver_given_19_driver(){
        //given
        Driver driver = new Driver(19);
        Police police = new Police();
        //when
        Boolean result = police.checkDriverAgeValid(driver);
        //then
        Assertions.assertEquals(true,result);

    }

    @Test
    public void should_return_false_when_call_checkDriver_given_0_driver(){
        //given
        Driver driver = new Driver(0);
        Police police = new Police();
        //when
        Boolean result = police.checkDriverAgeValid(driver);
        //then
        Assertions.assertEquals(false,result);
    }

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