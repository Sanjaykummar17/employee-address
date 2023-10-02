package com.employeeAddress.Service;

import com.employeeAddress.Model.Employee;
import com.employeeAddress.Repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public String addEmployee(List<Employee> addEmp) {
        iEmployeeRepo.saveAll(addEmp);
        return  "Employee Added Successfully!!";
    }

    public List<Employee> getAllEmp() {
        return iEmployeeRepo.findAll();
    }

    public Optional<Employee> getEmpById(Long id) {
        return iEmployeeRepo.findById(id);
    }

    public String updateFirstName(Long id, String fName) {
        Employee name = iEmployeeRepo.findById(id).get();
        name.setFirstName(fName);
        iEmployeeRepo.save(name);
            return "First Name updated Successfully!";
    }

    public String deleteEmp(Long id) {
        iEmployeeRepo.deleteById(id);
        return  " Employee Deleted Successfully! ";
    }
}
