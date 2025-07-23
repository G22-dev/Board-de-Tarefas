package br.com.board.persistence.config;

import static lombok.AccessLevel.PRIVATE;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = PRIVATE)
public class ConfigConnection {

    public static Connection getConnection() throws SQLException {
        var url ="jdbc:mysql://localhost/mysql_board";
        var user ="root";
        var password ="root";
        var connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }
}
