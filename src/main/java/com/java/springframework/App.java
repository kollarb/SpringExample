package com.java.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.springframework.models.Employee;
import com.java.springframework.models.HelloWorld;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
    	HelloWorld hw= (HelloWorld) context.getBean("hello");
    	hw.print();
    	
    	Employee emp= new Employee(1,"Bharath","Kollareddy",6000.00);
    	EmployeeDao empDao= (EmployeeDao) context.getBean("employeeDao");
    	empDao.addEmployee(emp);
    }
}
