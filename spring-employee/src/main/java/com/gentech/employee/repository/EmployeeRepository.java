package com.gentech.employee.repository;

import com.gentech.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByJobName(String jobName);

    List<Employee> findByCityNameAndStateName(String cityName,String stateName);

    List<Employee> findByEmailIdContaining(String emailId);

    @Query("FROM Employee Where jobName=:jobName or cityName=:cityName")
    List<Employee> getEmployeesByJobNameOrCityName(@Param("jobName") String jobName, @Param("cityName") String cityName);

    @Transactional
    @Modifying
    @Query("Update Employee set stateName=:stateName Where id=:id")
    Integer updateEmployeeByStateName(@Param("stateName") String stateName, @Param("id") Integer id);
}
