package com.bl.employee;

public class EmployeeWageUC8 extends Method {

    CompanyInputs input = new CompanyInputs();

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageUC8 emp = new EmployeeWageUC8();

        emp.companyMonthlyWageA();
        System.out.println();
        emp.companyMonthlyWageB();
        System.out.println();
        emp.companyMonthlyWageC();

    }

    public void companyMonthlyWageA() {

        input.setWagePerHour(20);
        totalEmpHoursA();

        int monthlyWageA = totalEmpHours * input.getWagePerHour();

        System.out.println("Monthly Wage of the Employee of CompanyA is: " + monthlyWageA);

    }

    public void companyMonthlyWageB() {

        input.setWagePerHour(25);
        totalEmpHoursB();

        int monthlyWageB = totalEmpHours * input.getWagePerHour();

        System.out.println("Monthly Wage of the Employee of CompanyB is: " + monthlyWageB);

    }

    public void companyMonthlyWageC() {

        input.setWagePerHour(30);
        totalEmpHoursC();

        int monthlyWageC = totalEmpHours * input.getWagePerHour();

        System.out.println("Monthly Wage of the Employee of CompanyC is: " + monthlyWageC);

    }
}
