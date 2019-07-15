package com.tws.refactoring;

public class Judge {

    public CriminalResponsibility checkCriminalResponsibility(Driver driver) {
        if (driver.getAge() < 14) {
            return CriminalResponsibility.NONE;
        } else if (driver.getAge() >= 14 && driver.getAge() < 16) {
            return CriminalResponsibility.RELATIVE;
        } else {
            return CriminalResponsibility.FULL;
        }
    }

    public enum CriminalResponsibility {
        NONE, FULL, RELATIVE
    }

}
