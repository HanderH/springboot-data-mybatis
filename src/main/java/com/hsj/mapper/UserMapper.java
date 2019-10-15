package com.hsj.mapper;

import com.hsj.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<Employee> getEmployees();

    Employee getEmployeeById(Integer id);

    void addEmp(Employee employee);

    void updateEmp(Employee employee);

    void deleteEmpById(Integer id);
}
