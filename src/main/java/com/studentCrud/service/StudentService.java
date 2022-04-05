package com.studentCrud.service;

import java.util.List;

import com.studentCrud.model.Student;

public interface StudentService {
		
	void addStudent(Student student);
	
	void deleteStudent(int id);
	
	Student getStudentById(int id);
	
	List<Student> getAllStudent();
	
	void editStudent(Student student);
	
}
