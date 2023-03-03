package com.example.EmployMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployMS.entity.Employ;
import com.example.EmployMS.repo.EmployRepository;

@Service
public class EmployService {
    
    @Autowired
    private EmployRepository employRepository;

    public List<Employ> getAll(){
        return employRepository.findAll();
    }

    public Employ saveEmploy(Employ employ){
        return employRepository.save(employ);
    }

    public Employ updateEmploy(Employ employ){
        if(employRepository.existsById(employ.getEmpId())){
            return employRepository.save(employ);
        }
        else{
            return null;
        }
    }

    public Employ searchEmploy(int empId){
        if(employRepository.existsById(empId)){
            Employ em=employRepository.findById(empId).orElse(null);
            return em;
        }
        else{
            return null;
        }

    }

    public Employ deleteEmploy(int empId){
        if(employRepository.existsById(empId)){
            employRepository.deleteById(empId);
            return null;
        }
        else{
            return null;
        }
    }

    
}
