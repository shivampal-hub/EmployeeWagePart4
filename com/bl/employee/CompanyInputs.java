package com.bl.employee;

public class CompanyInputs {

    public int numberOfWorkingDays;
    public int wagePerHour;

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
        return numberOfWorkingDays;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;

    }
}
