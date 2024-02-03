package com.greatlearning.student.studentmgmt.service;

import java.util.List;

import com.greatlearning.student.studentmgmt.entity.Student;

public interface StudentService {

	List<Student> getAll();

	void create(Student student);

	void update(Student student);

	void deleteById(int studId);

	Student getById(int studId);
}
