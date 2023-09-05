package com.sts.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}