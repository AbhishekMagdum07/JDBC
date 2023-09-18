package com.example.bridgelabz.controller;

import com.example.bridgelabz.model.Student;
import com.example.bridgelabz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/post")
    public void saveData(@RequestBody Student student){
         studentService.saveData(student);
    }

    @GetMapping("/getall/{id}")
    Student getAll(@PathVariable int id){
        return studentService.getAll(id);
    }
}
