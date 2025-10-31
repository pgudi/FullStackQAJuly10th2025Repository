package com.gentech.employee.service;

import com.gentech.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployee(Integer id);

    List<EmployeeDto> getAllEmployee();

    List<EmployeeDto> getAllEmployee(int pageNumber, int pageSize);

    List<EmployeeDto> getAllEmployee(String columnName);

    EmployeeDto updateEmployee(Integer id, EmployeeDto employeeDto);

    void deleteEmployee(Integer employeeId);

    List<EmployeeDto> getAllEmployeeByjobName(String jobName);

    List<EmployeeDto> getAllEmployeeByCityNameAndStateName(String cityName, String stateName);

    List<EmployeeDto> getAllEmployeeByEmailIdLike(String emailId);

    List<EmployeeDto> getAllEmployeeByJobNameOrCityName(String jobName, String cityName);

    Integer updateEmployeeByState(String stateName, Integer id);
}
