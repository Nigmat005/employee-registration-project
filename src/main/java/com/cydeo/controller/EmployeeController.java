package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

//    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @GetMapping(value = "/register")
    public String registerEmployee(Model model){

        Employee employee=Employee.builder().build();
        model.addAttribute("employeeObj",employee);
        model.addAttribute("states", DataGenerator.getAllStates());
        return "employee/employee-create";
    }

    @PostMapping(value = "/list")
    public String listEmployee(@Valid @ModelAttribute("employeeObj") Employee employee,BindingResult bindingResult, Model model){
        // check error first
        if(bindingResult.hasErrors()){
            model.addAttribute("states", DataGenerator.getAllStates());
            return "employee/employee-create";
        }

        // store employee object everytime you call /register endpoint, otherwise get refreshed
        DataGenerator.saveEmployees(employee);

        model.addAttribute("employeeList",DataGenerator.readAllEmployees());
        return "/employee/employee-list";
    }
}
