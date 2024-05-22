package com.mohammad_bakur.studentmanagement.student;

import com.mohammad_bakur.studentmanagement.student.models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.addUser(student);
    }

    @GetMapping("{email}")
    public Student findStudentByEmail(
            @PathVariable("email") String email){
        return service.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        service.delete(id);
    }
}
