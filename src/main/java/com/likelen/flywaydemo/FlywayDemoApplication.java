package com.likelen.flywaydemo;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class FlywayDemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(FlywayDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        MysqlDataSource d= new MysqlDataSource();
        d.setUrl("jdbc:mysql://localhost:3307/cms?autoReconnect=True");
        d.setUser("cms");
        d.setPassword("cms");

        Flyway flyway = Flyway.configure().dataSource(d)
                .load();
        flyway.migrate();
    }
}
