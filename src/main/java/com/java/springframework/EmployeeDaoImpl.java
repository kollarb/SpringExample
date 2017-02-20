package com.java.springframework;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.springframework.models.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	
    private JdbcTemplate jdbcTemplate;
 
    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	public void addEmployee(Employee emp) {
		 String sql = "INSERT INTO EMPLOYEE(ID,FIRSTNAME, LASTNAME, SALARY) VALUES(?, ?, ?,?)";
	     int result=jdbcTemplate.update(
	                sql,
	                new Object[] { emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getSalary() });
	     
	     if(1 == result)
	            System.out.println("Player creation is SUCCESS");
	        else
	        	  System.out.println("Player creation is FAILURE");
	}

	public void getEmployee(int id) {
		// TODO Auto-generated method stub
		
	}
}
