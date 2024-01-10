package org.example.springjdbc.dao;

import org.example.springjdbc.entity.Person;

import java.util.List;

public interface PersonDao {
    public  int insert(Person person);
    public int change(Person person);

    public  Person getPerson(int studentId);

    public List<Person> getAllPerson();

}
