package com.mongodb.mongodbemployee.mongodbemployee.repository;

import com.mongodb.mongodbemployee.mongodbemployee.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeEntityRepository extends MongoRepository<Employee,Integer> {

}
