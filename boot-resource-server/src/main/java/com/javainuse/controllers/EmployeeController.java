package com.javainuse.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.javainuse.model.Employee;

@Controller
public class EmployeeController {

        @RequestMapping(value = "/user/getEmployeesList", produces = "application/json")
    @ResponseBody
    public List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee();
        emp.setEmpId("emp1");
        emp.setEmpName("Masum Islam");
        employees.add(emp);
        emp.setEmpId("emp2");
        emp.setEmpName("Mahi Islam");
        employees.add(emp);
        return employees;

    }

}