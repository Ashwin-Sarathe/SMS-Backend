package com.example.sms.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
@Data
@NoArgsConstructor
public class Course {
    @Id
    private String id;
    private String name;
    @Indexed(unique = true)
    private String code;
    private int credits;
    private Department department;
}
