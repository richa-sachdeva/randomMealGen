package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MealDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Meal> getAllMeals() {
        return jdbcTemplate.query("Select * from Meal", new BeanPropertyRowMapper<>(Meal.class));
    }

    public Meal findById(long id) {
        return jdbcTemplate.queryForObject("select * from meal where id=?", new Object[] { id },
            new BeanPropertyRowMapper<>(Meal.class));
    }
}
