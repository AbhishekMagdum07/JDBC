package com.example.bridgelabz.service;

import com.example.bridgelabz.model.Student;

import java.util.List;

public interface StudentService {
    
    Student getAll(int id);

    void saveData(Student student);
}
