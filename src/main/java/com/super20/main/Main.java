package com.super20.main;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import com.super20.dao.DaoImpl;
import com.super20.entity.Department;
import com.super20.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Department d = new Department("Developer", "Mumbai",null);
		
		Employee e = new Employee("Chaitali","Kulkarni",BigDecimal.valueOf(35000.00), d);
		
		DaoImpl dao =new DaoImpl();
		
//		dao.addDepartment(d);
//		dao.addEmployee(e);
		
//		System.out.println("1");
//		List<Employee> employee = dao.getEmploye();
//		for (Employee em : employee ) {
//				System.out.println(em);
//				
//		}
		
		//Que-2
		
//		List<Employee> employee = dao.getSalary(BigDecimal.valueOf(20000.00));
//		for (Employee em : employee ) {
//				System.out.println(em);
//				
//		}
		
		//Que-3
//		List<Employee> lastName = dao.getAscOrderLastName();
//		for (Employee em : lastName ) {
//			System.out.println(em);
//			
//		}
		
		
		// Que-4
//		List<Department> list = dao.getDeptPagination();
		
		// Que -5
//		List<Employee> firstALastName = dao.getFirstALastName();
//		for (Employee em : firstALastName ) {
//			System.out.println(em);
//			
//		}
		
		//Que-6
//		Long countEmp = dao.getCountEmp();
//		System.out.println(countEmp);
		
		
		//Que-7
//		System.out.println("Max salary: "+dao.getMaxsalaryEmp());
		
		// Que-8
//		System.out.println("Sum of salary: "+ dao.getSumSalary());
		
		//Que-9
//		System.out.println("Average of Salary: "+ dao.getAvgSalary());
		
		//Que-10
//		System.out.println("Distinct count of Department: "+ dao.getDistinctCount());
		
		//Que-11
		List<Object> list = dao.get();
		for(Object em : list) {
			System.out.println(em.toString());
			
		}
		
	}

}
