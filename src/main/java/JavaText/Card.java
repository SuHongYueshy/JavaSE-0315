/*
package JavaText;

import java.sql.*;
import java.util.Scanner;

public class Card {
    private static final String URL = "jdbc:mysql:///?user=root&password=system";
    private static Connection connection;
    private static Scanner scanner;

    public Card() throws SQLException {
        this.connection = DriverManager.getConnection(URL);
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) throws SQLException {
        Card cardManagement = new Card();
        System.out.println("input name:");
        String name = scanner.nextLine();

        System.out.println("input password:");
        String password = scanner.nextLine();

        String sql = "select * from db.card where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (!resultSet.next()) {
            System.out.println("user not exist.");
        } else {
            String sql2 = "select * from db.card where name = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("password is invalid.");
            } else {
                System.out.println("login successful.");
                System.out.println("1-charge; 2-buy");
                int item = scanner.nextInt();

                if (item == 1) {
                    System.out.println("input charge amount: ");
                    double amount = scanner.nextDouble();

                    String sql3 = "update db.card set money = money + ?, balance = balance - ? where name = ?";
                    preparedStatement = connection.prepareStatement(sql3);
                    preparedStatement.setDouble(1, amount);
                    preparedStatement.setDouble(2, amount);
                    preparedStatement.setString(3, name);

                    preparedStatement.executeUpdate();
                    System.out.println("Charge successful.");
                }

                if (item == 2) {
                    System.out.println("1-pencil; 2-notebook; 3-pen");
                    int product = scanner.nextInt();

                    double money = 0;
                    switch (product) {
                        case 1:
                            money = 1;
                            break;
                        case 2:
                            money = 2;
                            break;
                        case 3:
                            money = 2.5;
                            break;
                        default:
                            System.out.println("error...");
                            System.exit(0);
                            break;                                         
                    }

                    String sql4 = "update db.card set money = money - ? where name = ?";
                    preparedStatement = connection.prepareStatement(sql4);
                    preparedStatement.setDouble(1, money);
                    preparedStatement.setString(2, name);
                    preparedStatement.executeUpdate();
                    System.out.println("buy successful.");
                }
            }
        }
    }
}
*/
