package dev.danvega;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Subscribers {
    private List<String> subscribers = new ArrayList<>();

    public List<String> handleRequest() {
        String jdbcURL = "jdbc:postgresql://erick.cuhqyoeg679n.us-east-1.rds.amazonaws.com:5432/erick";

        try(Connection conn = DriverManager.getConnection(jdbcURL, "postgress", "postgress")) {
            if(!conn.isValid(0)) {
                System.out.println("Unable to connect to: " + jdbcURL);
                System.exit(0);
            }
            PreparedStatement selectStatement = conn.prepareStatement("select * from subscribers");
            ResultSet rs = selectStatement.executeQuery();

            while (rs.next()) {
                String email = rs.getString("email");
                System.out.println(email);
                subscribers.add(email);
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return subscribers;
    }
}
