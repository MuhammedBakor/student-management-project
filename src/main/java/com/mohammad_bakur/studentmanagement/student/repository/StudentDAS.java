package com.mohammad_bakur.studentmanagement.student.repository;

import com.mohammad_bakur.studentmanagement.student.StudentDAO;
import com.mohammad_bakur.studentmanagement.student.models.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jpa")
public class StudentDAS implements StudentDAO {

    private final StudentRepository repository;

    public StudentDAS(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student insertStudent(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student s) {
        return null;
    }

    @Override
    public void removeStudent(Integer id) {
        repository.deleteById(id);
    }
}
