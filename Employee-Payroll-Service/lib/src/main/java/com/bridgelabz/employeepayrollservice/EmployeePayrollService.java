package com.bridgelabz.employeepayrollservice;

import java.io.File;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	

    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
    private static List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService() {}

    public EmployeePayrollService (List<EmployeePayroll>
                                           employeePayrollList) {

    }
    	
    public static void main(String[] args) {

        employeePayrollList = new ArrayList<>();

        EmployeePayrollService employeePayrollService = new EmployeePayrollService (employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService. readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();


    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {

        System.out.println("Enter Employee ID: ");
        int id= consoleInputReader.nextInt();

        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();

        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();

        employeePayrollList.add(new EmployeePayroll(id, name, salary));

    }

    private void writeEmployeePayrollData() {

        System.out.println("\nwriting Employee Payroll Roaster to Console\n" + employeePayrollList);

    }

}
