package com.example.bridgelabz.repository;

import com.example.bridgelabz.config.DataSourceConfig;
import com.example.bridgelabz.mapper.RawMapper;
import com.example.bridgelabz.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public StudentRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(Student student) {
        String sql = "INSERT INTO STUDENT (id, firstName, lastName, age) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, student.getId(), student.getFirstName(), student.getLastName(), student.getAge());
    }

    public Student read(int id) {
        String sql = "SELECT * FROM STUDENT WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RawMapper());
    }

//    public void update(Student student) {
//        String sql = "UPDATE STUDENT SET firstName = ?, lastName = ?, age = ? WHERE id = ?";
//        jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getAge(), student.getId());
//    }
//
//    public void delete(int id) {
//        String sql = "DELETE FROM STUDENT WHERE id = ?";
//        jdbcTemplate.update(sql, id);
//    }
}
