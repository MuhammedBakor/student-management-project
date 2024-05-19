package com.mohammad_bakur.studentmanagement.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Mohammad",
                        "Bakur", LocalDate.now(),
                        "moody@Gmail.com",
                        24),

                new Student(
                        "Ahmed",
                        "Bakur", LocalDate.now(),
                        "ahmed@Gmail.com",
                        22),

                new Student(
                        "Hamdan",
                        "Bakur", LocalDate.now(),
                        "hmdan@Gmail.com",
                        20)
        );
    }
}
