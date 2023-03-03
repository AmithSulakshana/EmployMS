package com.example.EmployMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployMS.entity.Employ;
import com.example.EmployMS.service.EmployService;

@RestController
@RequestMapping("api/v1/employs")
public class EmployController {
    
    @Autowired
    private EmployService employService;
    
    @GetMapping("/get")
    public List<Employ> getAllEmploys(){
        return employService.getAll();
    } 
    
    @PostMapping("/save")
    public Employ createEmploy(@RequestBody Employ employ){
        return employService.saveEmploy(employ);
    }
    
    @PutMapping("/update")
    public Employ updateEmploy(@RequestBody Employ employ){
        return employService.updateEmploy(employ);
    }
    
    @GetMapping("/searchEmploy/{empId}")
    public Employ searchEmploy(@PathVariable int empId){
        return employService.searchEmploy(empId);

    }
    
    @DeleteMapping("/deleteEmploy/{empId}")
    public Employ deleteEmploy(@PathVariable int empId){
        return employService.deleteEmploy(empId);

    }
}
