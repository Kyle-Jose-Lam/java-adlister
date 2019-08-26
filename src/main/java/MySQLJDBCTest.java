import com.mysql.cj.jdbc.Driver;

import java.sql.*;

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

    public static void main(String[] args) {
        try {
            Connection connection = connect();
            System.out.println("Connection Successful");
            Statement statement = connection.createStatement();
//            String queryString = "SELECT * FROM quotes";
//            String queryString = "UPDATE quotes SET author_first_name = \"Mister\" WHERE id = 6";
//            String queryString = "DELETE FROM quotes WHERE id = 6";
            String queryString = "SELECT * FROM quotes";
            ResultSet results = statement.executeQuery(queryString);
            if (results != null) {
                System.out.println("Statement executed successfully");
                while (results.next()) {
//                    System.out.println("id: "+results.getLong("id"));
                    System.out.println("\"" +results.getString("content") + "\"");
                    System.out.println("- "+results.getString("author_first_name") + " " + results.getString("author_last_name")+"\n");
                }
                System.out.println("No more results");
            }
            else
                System.out.println("Statement exploded");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
