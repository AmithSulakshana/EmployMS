package com.example.EmployMS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Employ")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employ {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int empId;

    @Column(name = "empName")
    private String empName;

    @Column(name="empAddress")
    private String empAddress;

    @Column(name = "empMNumber")
    private String empMNumber;
    
}
