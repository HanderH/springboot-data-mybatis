package com.hsj.controller;

import com.hsj.entity.Employee;
import com.hsj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/emps")
    public String getEmployees(ModelMap map){

        List<Employee> employees =  userService.getEmployees();
        System.out.println(employees.size());

        map.put("emps",employees);
        return "list";
    }


   /* @RequestMapping("/emps")
    public List<Employee> getEmployees(){

        List<Employee> employees =  userService.getEmployees();
        System.out.println(employees.size());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("list");
        return employees;
    }*/


    @RequestMapping("/toAdd")
    public String toAddPage(){
        return "add";
    }

  /*  @RequestMapping("/addEmp")
    public String addEmp(Employee employee){

        System.out.println(employee);

        userService.addEmp(employee);
        return "redirect:/emps";
    }*/

    /*@RequestMapping("/addEmp")
    public String addEmp(Employee employee){

        System.out.println(employee);

        userService.addEmp(employee);
        return "redirect:/emps";
    }*/
    @ResponseBody
    @RequestMapping("/addEmp")
    public String addEmp(Employee employee){

        System.out.println(employee);

        userService.addEmp(employee);
        return "success";
    }

    /*@RequestMapping("/toEdit")
    public String toEditPage(Integer id,ModelMap map){

        System.out.println("id: "+id);
        Employee employee = userService.getEmployeeById(id);
        map.put("emp",employee);
        System.out.println(employee);
        return "edit";
    }*/
    @GetMapping("/toEdit")
    public String toEditPage(Integer id,ModelMap map){

        System.out.println("id: "+id);
        Employee employee = userService.getEmployeeById(id);
        map.put("emp",employee);
        System.out.println(employee);
        return "edit";
    }

    /*@RequestMapping("/updateEmp")
    public String updateEmp(Employee employee){
        System.out.println(employee);

        userService.updateEmp(employee);

        return "redirect:/emps";
    }*/

    @ResponseBody
    @RequestMapping("/updateEmp")
    public String updateEmp(Employee employee){
        System.out.println(employee);

        userService.updateEmp(employee);

        return "success";
    }

   /* @RequestMapping("/deleteEmp")
    public String deleteEmpById(Integer id){

        userService.deleteEmpById(id);

        return "redirect:/emps";
    }*/

    @RequestMapping("/deleteEmp")
    @ResponseBody
    public String deleteEmpById(Integer id){

        userService.deleteEmpById(id);

        return "success";
    }
}
