import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads{
    Connection connection;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUsername(),
                    Config.getPassword()
            );
            System.out.println("Successfully connected to database");
        } catch (SQLException ex) {
            System.out.println("Connection to database failed");
            ex.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
//        try {
//            Statement statement = connection.createStatement();
//            String queryString = "SELECT * FROM quotes";
//            ResultSet results = statement.executeQuery(queryString);
//            if (results != null) {
//                System.out.println("Statement executed successfully");
//                while (results.next()) {
//                    System.out.print(results.getLong("id")+": ");
//                    System.out.print("\"" +results.getString("content") + "\"");
//                    System.out.println(" - "+results.getString("author_first_name") +
//                            " " + results.getString("author_last_name")+"\n");
//                }
//                System.out.println("No more results");
//            }
//            else
//                System.out.println("Statement exploded");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }

        return null;
    }

    @Override
    public Long insert(Ad ad) {
//        try {
//            Statement statement = connection.createStatement();
//            String queryString = "INSERT INTO quotes(author_first_name, author_last_name, content) " +
//                    "VALUES ('Master', 'Yoda', 'Do or do not. There is no try')";
//
//            statement.executeUpdate(queryString, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()) {
//                System.out.println("Inserted a new record! New id is: " + rs.getLong(1));
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }

        return null;
    }
}
