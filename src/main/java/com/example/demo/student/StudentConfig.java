package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                    Student Mariam = new Student(
                            "mariam",
                            "mariam@gmail.com",
                            LocalDate.of(2000, Month.MARCH, 21)
                    );
            Student Faisal = new Student(
                    "Faisal",
                    "Faisal@gmail.com",
                    LocalDate.of(1999, Month.AUGUST, 23)
            );
            repository.saveAll(List.of(Mariam, Faisal));
        };
    }
}
