package com.bl.employee;

import java.util.Random;

public class Method  {

    int empHours;

    int totalEmpHours = 0;

    CompanyInputs input = new CompanyInputs();

    public int companyA = input.setNumberOfWorkingDays(20);
    public int companyB = input.setNumberOfWorkingDays(25);
    public int companyC = input.setNumberOfWorkingDays(30);

    public void attendance() {

        int empCheck;

        Random rand = new Random();
        empCheck = rand.nextInt(3);
        switch (empCheck) {
            case 0:
                System.out.println("Employee Present(Full Time)");
                empHours = 8;
                break;
            case 1:
                System.out.println("Employee Present(Half Time)");
                empHours = 4;
                break;
            default:
                System.out.println("Employee Absent");
                empHours = 0;
        }
    }

    public void totalEmpHoursA() {

        int totalWorkingDaysA = 0;

        EmployeeWageUC8 emp = new EmployeeWageUC8();

        for (int i = 0; i < emp.companyA; i++) {

            totalWorkingDaysA++;

            attendance();
            totalEmpHours += empHours;
            System.out.println("Day: " + totalWorkingDaysA + " Emp Hrs: " + empHours);
        }

    }

    public void totalEmpHoursB() {

        int totalWorkingDaysB = 0;
        EmployeeWageUC8 emp = new EmployeeWageUC8();

        for (int i = 0; i < emp.companyB; i++) {

            totalWorkingDaysB++;

            attendance();

            totalEmpHours += empHours;
            System.out.println("Day: " + totalWorkingDaysB + " Emp Hrs: " + empHours);
        }
    }

    public void totalEmpHoursC() {

        int totalWorkingDaysC = 0;
        EmployeeWageUC8 emp = new EmployeeWageUC8();

        for (int i = 0; i < emp.companyC; i++) {

            totalWorkingDaysC++;

            attendance();

            totalEmpHours += empHours;
            System.out.println("Day: " + totalWorkingDaysC + " Emp Hrs: " + empHours);
        }
    }
}
