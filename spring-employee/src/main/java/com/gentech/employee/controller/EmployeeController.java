package com.gentech.employee.controller;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(service.createEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> getSpecificEmployee(@PathVariable("id") Integer employeeId)
    {
        return new ResponseEntity<>(service.getEmployee(employeeId), HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees()
    {
        return new ResponseEntity<>(service.getAllEmployee(), HttpStatus.OK);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> modifyEmployee(@PathVariable Integer id,
                                                      @RequestBody EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(service.updateEmployee(id,employeeDto), HttpStatus.OK);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer id)
    {
        service.deleteEmployee(id);
        return  new ResponseEntity<>("The Employee with id "+id+" has deleted successfullly!!",HttpStatus.OK);
    }

    @GetMapping("/employees/filterbyjobname")
    public ResponseEntity<List<EmployeeDto>> getEmployeesByJobName(@RequestParam String jobname)
    {
        return new ResponseEntity<>(service.getAllEmployeeByjobName(jobname), HttpStatus.OK);
    }

    @GetMapping("/employees/filterbycityandstate")
    public ResponseEntity<List<EmployeeDto>> getEmployeesByCityAndState(@RequestParam String cityname,
                                                                        @RequestParam String statename)
    {
        return new ResponseEntity<>(service.getAllEmployeeByCityNameAndStateName(cityname,statename), HttpStatus.OK);
    }

    @GetMapping("/employees/filterbyemail")
    public ResponseEntity<List<EmployeeDto>> getEmployeesByEmailId(@RequestParam String email)
    {
        return new ResponseEntity<>(service.getAllEmployeeByEmailIdLike(email), HttpStatus.OK);
    }
}
