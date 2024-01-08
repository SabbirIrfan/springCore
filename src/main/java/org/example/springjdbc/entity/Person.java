package org.example.springjdbc.entity;

import org.example.springjdbc.dao.PersonDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class Person implements PersonDao {
    private  int id;
    private String name;

    private JdbcTemplate jdbcTemplate;

    public Person(){
        super();
    }
    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Person person) {
        String q = "INSERT INTO user (id, name) values(?,?)";

        return this.jdbcTemplate.update(q,person.getId(),person.getName());

    }
}
