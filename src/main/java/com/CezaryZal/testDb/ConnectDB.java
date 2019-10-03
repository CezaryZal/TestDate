package com.CezaryZal.testDb;


import java.sql.*;

public class ConnectDB {
    public static void main(String[] args) {

        final String JDB_URL = "jdbc:mysql://localhost:3306/test_date?useSSL=false&serverTimezone=UTC";
//        final String JDB_URL = "jdbc:mysql://localhost:3306/test_date?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        final String USENAME = "hbstudent";
        final String PASSWORD = "HBstudent!123";

        try (Connection connection = DriverManager.getConnection(JDB_URL, USENAME, PASSWORD)) {

            System.out.println("Test connect");

            PreparedStatement stat = connection.prepareStatement("SELECT * FROM comment WHERE id=3");

            ResultSet resultSet = stat.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("nr_token"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
