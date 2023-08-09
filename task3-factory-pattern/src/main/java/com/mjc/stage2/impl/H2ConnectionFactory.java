package com.mjc.stage2.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mjc.stage2.ConnectionFactory;

public class H2ConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        try (FileInputStream file = new FileInputStream("src/main/resources/h2database.properties");) {
            Properties props = new Properties();
            props.load(file);

            String driver = props.getProperty("jdbc_driver");
            String url = props.getProperty("db_url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            Class.forName(driver);

            return DriverManager.getConnection(url, user, password);
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}