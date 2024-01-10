package org.example.springjdbc.entity;

import org.example.springjdbc.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Person implements PersonDao {
    private  int id;
    private String name;
    @Autowired
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

    @Override
    public int change(Person person) {
        String q= "UPDATE user SET name=? WHERE  id=?";

        return this.jdbcTemplate.update(q,person.getName(),person.getId());

    }

    @Override
    public Person getPerson(int personId) {

        String q = "SELECT * FROM user WHERE id=?";
        RowMapper<Person> rowMapper = new RowMapperImpl();

        Person person =  this.jdbcTemplate.queryForObject(q, rowMapper, personId);

        return person;

    }

    @Override
    public List<Person> getAllPerson() {
        String q = "SELECT * FROM user";
        List<Person> personList = this.jdbcTemplate.query(q,new RowMapperImpl());
        return personList;
    }
}
