package com.gentech.employee.serviceimpl;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.entity.Employee;
import com.gentech.employee.exception.ResourceNotFoundException;
import com.gentech.employee.mapper.EmployeeMapper;
import com.gentech.employee.repository.EmployeeRepository;
import com.gentech.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=repository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployee(Integer id) {
        Employee employee=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Employee id "+id+" has not found!!!"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {

        return repository.findAll().stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> getAllEmployee(String columnName) {
        Sort sort=Sort.by(Sort.Direction.ASC, columnName);
        return repository.findAll(sort).stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> getAllEmployee(int pageNumber,int pageSize) {
        Pageable pageable= PageRequest.of(pageNumber,pageSize);
        return repository.findAll(pageable).stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Integer id, EmployeeDto employeeDto) {
        Employee employee=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Employee id "+id+" has not found!!!"));
        employee.setId(id);
        employee.setEname(employeeDto.getEname());
        employee.setEmailId(employeeDto.getEmailId());
        employee.setJobName(employeeDto.getJobName());
        employee.setSalary(employeeDto.getSalary());
        employee.setCityName(employeeDto.getCityName());
        employee.setStateName(employeeDto.getStateName());

        Employee saveEmployee=repository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(saveEmployee);
    }

    @Override
    public void deleteEmployee(Integer employeeId) {
        Employee employee=repository.findById(employeeId).orElseThrow(() ->
                new ResourceNotFoundException("The Employee id "+employeeId+" has not found!!!"));

        repository.delete(employee);

    }

    @Override
    public List<EmployeeDto> getAllEmployeeByjobName(String jobName) {
        return repository.findByJobName(jobName).stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(Collectors.toList());

    }

    @Override
    public List<EmployeeDto> getAllEmployeeByCityNameAndStateName(String cityName, String stateName) {
        return repository.findByCityNameAndStateName(cityName,stateName).stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> getAllEmployeeByEmailIdLike(String emailId) {
        return repository.findByEmailIdContaining(emailId).stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> getAllEmployeeByJobNameOrCityName(String jobName, String cityName) {
        return repository.getEmployeesByJobNameOrCityName(jobName,cityName).stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(Collectors.toList());
    }

    @Override
    public Integer updateEmployeeByState(String stateName, Integer id) {
        return repository.updateEmployeeByStateName(stateName,id);
    }


}
