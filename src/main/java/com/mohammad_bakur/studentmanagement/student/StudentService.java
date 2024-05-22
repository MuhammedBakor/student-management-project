package com.mohammad_bakur.studentmanagement.student;

import com.mohammad_bakur.studentmanagement.student.models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDAO studentDao;

    public StudentService(@Qualifier("jpa") StudentDAO studentDao) {
        this.studentDao = studentDao;
    }

    public Student addUser(Student s) {
        return studentDao.insertStudent(s);
    }

    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }


    public Student findByEmail(String email) {
        return studentDao.findStudentByEmail(email);
    }

    public Student update(Student s) {
        return studentDao.updateStudent(s);
    }

    public void delete(Integer id) {
        studentDao.removeStudent(id);
    }

}
