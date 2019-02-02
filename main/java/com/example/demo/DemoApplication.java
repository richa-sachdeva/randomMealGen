package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        JdbcDataSource ds = new JdbcDataSource();
//        ds.setURL("jdbc:h2:~/test");
//        ds.setUser("sa");
//        ds.setPassword("sa");
//        try {
//            Connection conn = ds.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        SpringApplication.run(DemoApplication.class, args);
    }
}
