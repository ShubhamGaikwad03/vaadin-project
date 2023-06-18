package com.example.application.views.main;

import com.example.application.model.Movie;
import com.example.application.services.MovieService;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.io.IOException;
import java.util.List;

@PageTitle("Main")
@Route(value = "")
public class MainView extends VerticalLayout {

    private Button retrieveButton;
    private Button backButton;
    private Grid<Movie> movieGrid;

    public MainView() {
        setAlignItems(Alignment.CENTER); // Center the content vertically

        retrieveButton = new Button("Retrieve the Database");
        retrieveButton.addClickListener(e -> {
            try {
                String output = PythonExecutor.executePythonScript("src/main/java/com/example/application/views/main/python_script.py");
                Notification.show("Python script executed successfully in MainView");
                System.out.println("Python script executed successfully in MainView");
                System.out.println("Output:\n" + output);

                // Render the table with movie data
                List<Movie> movies = MovieService.getMoviesFromDatabase();
                renderMovieTable(movies);
                retrieveButton.setVisible(false);
                backButton.setVisible(true);
            } catch (IOException ex) {
                ex.printStackTrace();
                Notification.show("Python script execution failed");
                System.out.println("Python script execution failed");
            }
        });

        backButton = new Button("Back");
        backButton.setVisible(false);
        backButton.addClickListener(e -> {
            movieGrid.setVisible(false);
            backButton.setVisible(false);
            retrieveButton.setVisible(true);
        });

        add(retrieveButton);
        add(backButton);

        // Create an empty grid for movies
        movieGrid = new Grid<>(Movie.class);
        movieGrid.setVisible(false); // Initially hide the grid
        add(movieGrid);
    }

    private void renderMovieTable(List<Movie> movies) {
        movieGrid.setItems(movies);
        movieGrid.setVisible(true); // Show the grid
    }
}
