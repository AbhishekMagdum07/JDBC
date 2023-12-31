package com.example.bridgelabz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
}
