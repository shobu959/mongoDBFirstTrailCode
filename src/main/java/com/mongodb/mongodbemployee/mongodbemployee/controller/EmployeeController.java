package com.mongodb.mongodbemployee.mongodbemployee.controller;


import com.mongodb.mongodbemployee.mongodbemployee.entity.Employee;
import com.mongodb.mongodbemployee.mongodbemployee.repository.EmployeeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class EmployeeController {

    @Autowired
    private EmployeeEntityRepository employeeEntityRepository ;

    @GetMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
        Employee emp = this.employeeEntityRepository.save(employee);
        return ResponseEntity.ok(emp);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getEmployee(){
        return ResponseEntity.ok(this.employeeEntityRepository.findAll());
    }

}
