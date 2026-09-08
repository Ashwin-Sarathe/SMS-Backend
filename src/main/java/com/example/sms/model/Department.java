package com.example.sms.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "departments")
@Data
@NoArgsConstructor
public class Department {
    @Id
    private String id;
    private String name;
    private String description;
}
