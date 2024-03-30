package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

//    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @GetMapping(value = "/register")
    public String registerEmployee(){
        return "employee/employee-create";
    }
}
