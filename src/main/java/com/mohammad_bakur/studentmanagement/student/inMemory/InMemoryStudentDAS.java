package com.mohammad_bakur.studentmanagement.student.inMemory;

import com.mohammad_bakur.studentmanagement.student.models.Student;
import com.mohammad_bakur.studentmanagement.student.StudentDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentDAS implements StudentDAO {

    private final InMemoryStudentRepository repository;

    public InMemoryStudentDAS(InMemoryStudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public Student insertStudent(Student s) {
        return null;
    }

    @Override
    public List<Student> findAllStudents() {
        return List.of();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student s) {
        return null;
    }

    @Override
    public void removeStudent(Integer id) {

    }
}
