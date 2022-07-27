package ru.netology.domain;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ManagerTest {

    @Test
    public void severalFilms() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String [] actual = manager.findAll();
        String [] expected = { "film1", "film2", "film3" };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilms() {
        Manager manager = new Manager(9);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");

        String [] actual = manager.findLast();
        String [] expected = {
                "film15",
                "film14",
                "film13",
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",


        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void noMoviesAdded() {

        Manager manager = new Manager();
        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneFilmAdded() {

        Manager manager = new Manager();
        manager.addFilm("film1");

        String[] actual = manager.findAll();
        String [] expected = { "film1" };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsLessThanTheLimit() {
        Manager manager = new Manager(5);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");


        String [] actual = manager.findLast();
        String [] expected = {
                "film4",
                "film3",
                "film2",
                "film1"
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void moreFilmsThanLimit() {
        Manager manager = new Manager(3);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");


        String [] actual = manager.findLast();
        String [] expected = {
                "film4",
                "film3",
                "film2"
        };

        assertArrayEquals(expected, actual);
    }

}
