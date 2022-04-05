package com.studentCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentCrud.model.Student;
import com.studentCrud.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String getHomePage() {
		
		return "Home";
	}
	
	@GetMapping("/add")
	public String getAddForm() {
		
		
		return "AddStudent";
	}
	
	@PostMapping("/addStudent")
	public String addStudentData(@ModelAttribute Student student) {
		
		service.addStudent(student);
		return "studentList";
	}
	
	@GetMapping("/toList")
	public String getStudentList(Model model) {
		
		model.addAttribute("stdList", service.getAllStudent());
		return "studentList";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam int id) {
		
		service.deleteStudent(id);
		return "redirect:toList";
	}
	
	@GetMapping("/edit")
	public String getEditPage(@RequestParam int id, Model model) {
		
		model.addAttribute("stu_model", service.getStudentById(id));
		return "editStudent";
	}
	
	@PostMapping("/editStudent")
	public String editStudentInfo(@ModelAttribute Student std) {
		
		service.editStudent(std);
		return "redirect:toList";
	}
	
}
