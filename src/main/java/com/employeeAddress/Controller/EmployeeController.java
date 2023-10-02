package com.employeeAddress.Controller;


import com.employeeAddress.Model.Employee;
import com.employeeAddress.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    GET /employees - get all employees
//    GET /employees/{id} - get an employee by id
//    POST /employees - create a new employee
//    PUT /employees/{id} - update an employee by id
//    DELETE /employees/{id} - delete an employee by id


    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody List<Employee> addEmp){
        return employeeService.addEmployee(addEmp);
    }

    @GetMapping("Employees")
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmp();
    }

    @GetMapping("employee/id/{id}")
    public Optional<Employee> getEmpById(@PathVariable Long id){
        return employeeService.getEmpById(id);
    }

    @PutMapping("updateFname/id/{id}")
    public String updateFirstName(@PathVariable Long id,  @RequestParam String fName){
        return employeeService.updateFirstName(id,fName);
    }

    @DeleteMapping("deleteEmployee/id/{id}")
    public String deleteEmp(@PathVariable Long id){
        return employeeService.deleteEmp(id);
    }

}
