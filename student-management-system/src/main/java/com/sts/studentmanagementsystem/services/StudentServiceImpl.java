package com.sts.studentmanagementsystem.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sts.studentmanagementsystem.entity.Student;
import com.sts.studentmanagementsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

		@Autowired
		StudentRepository studentRepository;
	

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}
}
