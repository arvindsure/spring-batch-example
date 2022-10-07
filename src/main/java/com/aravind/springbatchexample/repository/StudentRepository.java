package com.aravind.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aravind.springbatchexample.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
