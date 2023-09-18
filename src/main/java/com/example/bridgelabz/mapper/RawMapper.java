package com.example.bridgelabz.mapper;

import com.example.bridgelabz.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RawMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setFirstName(rs.getString("firstName"));
        student.setLastName(rs.getString("lastName"));
        student.setAge(rs.getInt("age"));
        // Set other properties
        return student;
    }
}
