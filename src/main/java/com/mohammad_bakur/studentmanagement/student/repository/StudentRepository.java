package com.mohammad_bakur.studentmanagement.student.repository;

import com.mohammad_bakur.studentmanagement.student.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findStudentByEmail(String email);

}
