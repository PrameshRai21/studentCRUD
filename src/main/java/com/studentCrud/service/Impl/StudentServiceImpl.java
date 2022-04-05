package com.studentCrud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentCrud.model.Student;
import com.studentCrud.repository.StudentRepository;
import com.studentCrud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void addStudent(Student student) {
		
		studentRepo.save(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		
		studentRepo.deleteById(id);
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentRepo.getById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepo.findAll();
	}

	@Override
	public void editStudent(Student student) {
		
		studentRepo.save(student);
		
	}

}
