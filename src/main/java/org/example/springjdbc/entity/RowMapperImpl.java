package org.example.springjdbc.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person =  new Person();

        person.setId(rs.getInt(1));
        person.setName(rs.getString(2));

        return person;

    }
}
