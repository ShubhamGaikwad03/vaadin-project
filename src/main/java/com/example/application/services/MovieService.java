package com.example.application.services;

import com.example.application.model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    // Retrieve movie data from the database
    public static List<Movie> getMoviesFromDatabase() {
        List<Movie> movies = new ArrayList<>();

        try {
            // Establish a connection to the MySQL database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/petrabyte_one", "root", "gotCompany@01");

            // Create a statement to execute SQL queries
            Statement statement = connection.createStatement();

            // Execute the SELECT query to retrieve movie data
            String query = "SELECT * FROM movies";
            ResultSet resultSet = statement.executeQuery(query);

            // Iterate over the result set and create Movie objects
            while (resultSet.next()) {
                String film = resultSet.getString("Film");
                String genre = resultSet.getString("Genre");
                String leadStudio = resultSet.getString("Lead_Studio");
                int audienceScore = resultSet.getInt("Audience_Score");
                float profitability = resultSet.getFloat("Profitability");
                int rottenTomatoes = resultSet.getInt("Rotten_Tomatoes");
                String worldwideGross = resultSet.getString("Worldwide_Gross");
                int year = resultSet.getInt("Year");

                Movie movie = new Movie(film, genre, leadStudio, audienceScore, profitability, rottenTomatoes, worldwideGross, year);
                movies.add(movie);
            }

            // Close the statement and connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movies;
    }
}
