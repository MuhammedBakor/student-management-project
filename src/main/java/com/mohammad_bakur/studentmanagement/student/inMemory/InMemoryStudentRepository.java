package com.mohammad_bakur.studentmanagement.student.inMemory;

import com.mohammad_bakur.studentmanagement.student.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository("inMemory")
public class InMemoryStudentRepository {

    private final List<Student> STUDENT = new ArrayList<>();

    public Student save(Student s) {
        STUDENT.add(s);
        return s;
    }

    public List<Student> findAllStudents() {
        return STUDENT;
    }


    public Student findByEmail(String email) {
        Student ss = null;
        for (var s: STUDENT){
            if(s.getEmail().equals(email))
              return  ss= s;
        }
       return ss;
        /*return STUDENT.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .or(null);*/
    }


    public Student update(Student s) {
       var studentIndex = IntStream.range(0, STUDENT.size())
               .filter(index -> STUDENT.get(index).getEmail().equals(s.getEmail()))
               .findFirst().orElse(-1);

       if (studentIndex > -1){
           STUDENT.set(studentIndex, s);
           return s;
       }
        return null;
    }


    public void delete(String email) {
        Student studen = findByEmail(email);
        if(studen != null){
            STUDENT.remove(studen);
        }
    }
}
