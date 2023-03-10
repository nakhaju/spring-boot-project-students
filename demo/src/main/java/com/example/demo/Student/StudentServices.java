package com.example.demo.Student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentServices {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Nassor Juma",
                        "nakhaju@gmail.com",
                        LocalDate.of(1989, Month.JANUARY, 29),
                        21
                )
        );
    }

}
