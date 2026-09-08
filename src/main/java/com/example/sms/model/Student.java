package com.example.sms.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "students")
@Data
@NoArgsConstructor
public class Student {
    @Id
    private String id;
    private String name;
    @Indexed(unique = true)
    private String email;
    private String phoneNumber;
    private LocalDate dob;
    private Gender gender;
    private String department;
    private LocalDate enrollmentDate;
}
