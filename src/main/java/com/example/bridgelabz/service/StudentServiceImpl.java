package com.example.bridgelabz.service;

import com.example.bridgelabz.model.Student;
import com.example.bridgelabz.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student getAll(int id) {
        return studentRepository.read(id);
    }

    @Override
    public void saveData(Student student) {
         studentRepository.create(student);
    }
}
