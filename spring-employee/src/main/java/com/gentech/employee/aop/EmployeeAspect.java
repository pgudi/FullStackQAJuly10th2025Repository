package com.gentech.employee.aop;

import com.gentech.employee.dto.EmployeeDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class EmployeeAspect {

    @Before(value = "execution(* com.gentech.employee.controller.EmployeeController.*(..))")
    public void beforeAdviceController(JoinPoint joinPoint)
    {
        System.out.println("The Execution of Method "+joinPoint.getSignature()+" has started "+new Date());
    }

    @After(value = "execution(* com.gentech.employee.controller.EmployeeController.*(..))")
    public void afterAdviceController(JoinPoint joinPoint)
    {
        System.out.println("The Execution of Method "+joinPoint.getSignature()+" has ended "+new Date());
    }

    @Before(value = "execution(* com.gentech.employee.serviceimpl.EmployeeServiceImpl.*(..))")
    public void beforeAdviceService(JoinPoint joinPoint) {
        System.out.println("The Execution of Business Logic in Method " + joinPoint.getSignature() + " has started " + new Date());
    }

    @After(value = "execution(* com.gentech.employee.serviceimpl.EmployeeServiceImpl.*(..))")
    public void afterAdviceService(JoinPoint joinPoint)
    {
        System.out.println("The Execution of Business Logic in Method "+joinPoint.getSignature()+" has ended "+new Date());
    }

    @AfterReturning(value = "execution(* com.gentech.employee.serviceimpl.EmployeeServiceImpl.createEmployee(..))", returning = "employeeDto")
    public void afterReturningAdviceService(JoinPoint joinPoint, EmployeeDto employeeDto)
    {
        System.out.println("The Create Employee Business Logic in Method "+joinPoint.getSignature()+" has executed successfully "+employeeDto.getEname());
    }

    @AfterThrowing(value = "execution(* com.gentech.employee.serviceimpl.EmployeeServiceImpl.createEmployee(..))", throwing = "exception")
    public void afterThrowingAdviceService(JoinPoint joinPoint, Exception exception)
    {
        System.out.println("The Create Employee Business Logic in Method "+joinPoint.getSignature()+" has provided Exception "+exception.getMessage());
    }
}
