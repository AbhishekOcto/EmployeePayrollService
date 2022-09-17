package com.bridgelabz.empPayroll;
/*
* @author - ABHISHEK
* since - 16.09.2022*/

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service Program");
        EmployeePayrollService employeeService = new EmployeePayrollService();
        employeeService.readEmployeeData();
        employeeService.writeEmployeeData();
    }
}
