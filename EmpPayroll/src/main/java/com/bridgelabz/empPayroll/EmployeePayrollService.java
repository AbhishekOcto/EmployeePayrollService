package com.bridgelabz.empPayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    public void readEmployeeData() {
        EmployeePayrollData empData = new EmployeePayrollData();
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Please Enter Employee ID: ");
        empData.setId(consoleInput.nextInt());
        System.out.println("Please Enter Employee Name: ");
        empData.setName(consoleInput.next());
        System.out.println("Please Enter Salary of Employee: ");
        empData.setSalary(consoleInput.nextInt());
        employeePayrollDataList.add(empData);
    }

    public void writeEmployeeData(){
        System.out.println("Writing Employee Payroll Using Console \n"+employeePayrollDataList);
    }
}
