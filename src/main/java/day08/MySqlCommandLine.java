
package day08;

import com.mysql.jdbc.Driver;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


/*
    create database ...;
    create table ...;
    insert into ...;
    update ...;
    delete ...;
    select ...;
    drop table ...;
    drop database ...;
 */

public class MySqlCommandLine {

    private static final String URL = "jdbc:mysql:///?user=root&password=system";
    private Connection connection;

    public Connection getConnection() { // singleton 单例模式
        if (connection == null) {
            try {
                new Driver();
                connection = DriverManager.getConnection(URL);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void update(String sql) {
        System.out.println("update: " + sql);
        // TODO: 2019/3/27
    }

    public void query(String sql) {
        System.out.println("query: " + sql);
        // TODO: 2019/3/27
    }

    public void dispatch(String sql) {
        if (sql.startsWith("select")) {
            query(sql);
        } else {
            update(sql);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input SQL statement: ");
        String sql = scanner.nextLine();
        MySqlCommandLine mySqlCommandLine = new MySqlCommandLine();
        mySqlCommandLine.dispatch(sql);
    }
}
