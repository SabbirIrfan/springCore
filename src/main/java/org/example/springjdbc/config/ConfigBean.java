package org.example.springjdbc.config;

import org.example.springjdbc.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "org.example.springjdbc.entity")
public class ConfigBean {


    @Bean(name = "dataSource")
    public DataSource getDataSource(){

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setPassword("");
        ds.setUsername("root");

        return  ds;
    }
//<bean class="org.springframework.jdbc.core.JdbcTemplate" name="jdbcTemplate" p:dataSource-ref="dataSource"/>
    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(getDataSource());

        return  jdbcTemplate;
    }

//    <bean class="org.example.springjdbc.entity.Person" name="personDao"  >
//        <property name="jdbcTemplate" ref="jdbcTemplate"/>
//
//    </bean>
    @Bean("personDao")
    public Person getPerson(){
         Person person = new Person();
         person.setJdbcTemplate(getJdbcTemplate());

         return person;
    }
}
