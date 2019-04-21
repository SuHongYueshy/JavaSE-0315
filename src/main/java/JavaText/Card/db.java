package JavaText.Card;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    private static final String URL = "jdbc:mysql:///?characterEncoding=utf8&useSSL=false";
    private static final String USER="root";
    private static final String PASSWORD="shy126726";
    //上面分别定义了URL(统一资源定位器),USER(用户名)，PASSWORD（密码)

    private static Connection conn=null;   //(定义一个空的Connection)
    static {
        //使用try-catch语句，抛出错误
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(URL, USER, PASSWORD);
            //使用你在头部定义的三个变量，分别确定连接数据库的位置，用户名，密码
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }

    public static void main(String[] args) {
        new Card_action();
    }
}