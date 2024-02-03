package com.greatlearning.student.studentmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.student.studentmgmt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
