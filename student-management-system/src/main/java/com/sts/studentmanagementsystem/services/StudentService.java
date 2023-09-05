package com.sts.studentmanagementsystem.services;

import java.util.List; 
import com.sts.studentmanagementsystem.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
