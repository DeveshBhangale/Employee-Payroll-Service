package com.bridgelabz.employeepayrollservice;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollServiceTest {
	   @Test
	    public void givenEmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
	        EmployeePayroll[] arrayOfEmps= {
	                new EmployeePayroll(1,"jeff Bezos",100000),
	                new EmployeePayroll(2,"Bill Gates",200000),
	                new EmployeePayroll(3,"Mark Zuckerberg",300000)
	        };
	        EmployeePayrollService employeePayrollService;
	        employeePayrollService=new EmployeePayrollService(Arrays.asList(arrayOfEmps));
	        employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
	        employeePayrollService.printData(IOService.FILE_IO);
	        long entries=employeePayrollService.countEntries(IOService.FILE_IO);
	        Assert.assertEquals(3, entries);

	    }
}
