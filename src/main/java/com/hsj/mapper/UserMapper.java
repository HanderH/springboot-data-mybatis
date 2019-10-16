package com.hsj.mapper;

import com.hsj.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select id,name,gender,email,birth from employee")
    List<Employee> getEmployees();

    @Select("select id,name,gender,email,birth from employee where id = #{id}")
    Employee getEmployeeById(Integer id);

    @Insert("insert into employee(name,gender,email,birth) values(#{name},#{gender},#{email},#{birth})")
    void addEmp(Employee employee);

    @Update("update employee set name=#{name},gender=#{gender},email=#{email},birth=#{birth} where id=#{id}")
    void updateEmp(Employee employee);
    @Delete("delete from employee where id = #{id}")
    void deleteEmpById(Integer id);
}
