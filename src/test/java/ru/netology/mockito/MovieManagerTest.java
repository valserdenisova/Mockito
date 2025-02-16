package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void shouldAddNewMovie() {
        manager.addNewMovie("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewMovies() {
        manager.addNewMovie("Movie 1");
        manager.addNewMovie("Movie 2");
        manager.addNewMovie("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        manager.addNewMovie("Movie 1");
        manager.addNewMovie("Movie 2");
        manager.addNewMovie("Movie 3");
        manager.addNewMovie("Movie 4");
        manager.addNewMovie("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
    }

    @Test
    public void shouldFindLast3() {
        manager.addNewMovie("Movie 1");
        manager.addNewMovie("Movie 2");
        manager.addNewMovie("Movie 3");

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
    }

    @Test
    public void shouldFindLast5IfMore() {
        manager.addNewMovie("Movie 1");
        manager.addNewMovie("Movie 2");
        manager.addNewMovie("Movie 3");
        manager.addNewMovie("Movie 4");
        manager.addNewMovie("Movie 5");
        manager.addNewMovie("Movie 6");


        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();
    }
}
