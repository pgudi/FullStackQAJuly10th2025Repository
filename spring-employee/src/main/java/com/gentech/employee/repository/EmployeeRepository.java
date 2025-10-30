package com.gentech.employee.repository;

import com.gentech.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByJobName(String jobName);

    List<Employee> findByCityNameAndStateName(String cityName,String stateName);

    List<Employee> findByEmailIdContaining(String emailId);

}
