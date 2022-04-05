package com.studentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentCrud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
