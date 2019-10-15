package com.hsj.service.impl;

import com.hsj.entity.Employee;
import com.hsj.mapper.UserMapper;
import com.hsj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<Employee> getEmployees() {

        List<Employee> employees = userMapper.getEmployees();

        return employees;

    }

    @Override
    public void addEmp(Employee employee) {

        userMapper.addEmp(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employee = userMapper.getEmployeeById(id);

        return employee;
    }

    @Override
    public void updateEmp(Employee employee) {
        userMapper.updateEmp(employee);
    }

    @Override
    public void deleteEmpById(Integer id) {
        userMapper.deleteEmpById(id);
    }
}
