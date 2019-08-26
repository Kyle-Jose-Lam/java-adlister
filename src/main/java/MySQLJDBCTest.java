import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MySQLJDBCTest {

    public static Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUsername(),
                Config.getPassword()
        );
        return connection;
    }

    public static void create(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String queryString = "INSERT INTO quotes(author_first_name, author_last_name, content) " +
                    "VALUES ('Master', 'Yoda', 'Do or do not. There is no try')," +
                    " ('Mister', 'Spock', 'Live long and prosper.');";

            statement.executeUpdate(queryString, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                System.out.println("Inserted a new record! New ids: " + rs.getLong(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void review(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String queryString = "SELECT * FROM quotes";
            ResultSet results = statement.executeQuery(queryString);
            if (results != null) {
                System.out.println("Statement executed successfully");
                while (results.next()) {
//                    System.out.println("id: "+results.getLong("id"));
                    System.out.print("\"" +results.getString("content") + "\"");
                    System.out.println(" - "+results.getString("author_first_name") +
                            " " + results.getString("author_last_name")+"\n");
                }
                System.out.println("No more results");
            }
            else
                System.out.println("Statement exploded");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void update(Connection connection, int id) {
        try {
            Statement statement = connection.createStatement();
            String queryString = "UPDATE quotes SET author_first_name = \"UPDATE\" WHERE id = " + id;

            statement.execute(queryString);
            System.out.println("Statement executed successfully");

        } catch (SQLException ex) {
            System.out.println("Statement exploded");
            ex.printStackTrace();
        }
    }
    public static void delete(Connection connection, int id) {
        try {
            Statement statement = connection.createStatement();
            String queryString = "DELETE FROM quotes WHERE id = " + id;

            statement.execute(queryString);
            System.out.println("Statement executed successfully");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Connection connection = connect();
            System.out.println("Connection Successful");

            create(connection);
            review(connection);
            update(connection, 12);
//            delete(connection, 11);
//            delete(connection, 10);
            review(connection);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
