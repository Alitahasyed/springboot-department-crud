package com.crud.crudforlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test-db")
    public String testDbConnection() {
        try {
            // Try a simple SQL query
            String result = jdbcTemplate.queryForObject("SELECT version()", String.class);
            return "✅ Database connected successfully!<br>PostgreSQL version: " + result;
        } catch (Exception e) {
            e.printStackTrace();
            return "❌ Database connection failed: " + e.getMessage();
        }
    }
}
