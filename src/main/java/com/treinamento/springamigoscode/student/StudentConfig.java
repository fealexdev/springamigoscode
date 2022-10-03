package com.treinamento.springamigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student felipe = new Student(
                    "Felipe",
                    "fe.alexandrecampos@gmail.com",
                    LocalDate.of(1999, JANUARY, 22)
            );

            Student joao = new Student(
                    "Joao",
                    "joaoclaudio@gmail.com",
                    LocalDate.of(1999, JUNE, 3)
            );

            studentRepository.saveAll(List.of(felipe, joao));
        };
    }

}
