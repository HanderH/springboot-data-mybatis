package com.hsj.service;

import com.hsj.entity.Employee;

import java.util.List;

public  interface  UserService {


    public List<Employee> getEmployees();

    void addEmp(Employee employee);

    Employee getEmployeeById(Integer id);

    void updateEmp(Employee employee);

    void deleteEmpById(Integer id);
}
