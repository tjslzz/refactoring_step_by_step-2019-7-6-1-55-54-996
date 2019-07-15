package com.tws.refactoring;

public class Police {
    public boolean checkDriverAgeValid(Driver driver) {
        if(driver.getAge() >= 18) return true;
        else return false;
    }
}
