package com.example.EmployMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployMS.entity.Employ;

public interface EmployRepository extends JpaRepository<Employ,Integer> {
    
}
