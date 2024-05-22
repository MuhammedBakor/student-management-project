package com.mohammad_bakur.studentmanagement.student;

import com.mohammad_bakur.studentmanagement.student.models.Student;

import java.util.List;


public interface StudentDAO {

    Student insertStudent(Student s);
    List<Student> findAllStudents();
    Student findStudentByEmail(String email);
    Student updateStudent(Student s);
    void removeStudent(Integer id);
}
