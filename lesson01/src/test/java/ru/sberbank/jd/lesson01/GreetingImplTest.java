package ru.sberbank.jd.lesson01;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тест на {@link GreetingImpl}.
 */
class GreetingImplTest {

    private final GreetingImpl underTest = new GreetingImpl();

    @Test
    void getFirstName() {
        assertEquals("Evgeniy", underTest.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Rumyantsev", underTest.getLastName());
    }

    @Test
    void getBirthYear() {
        assertEquals(1984, underTest.getBirthYear());
    }

    @Test
    void getHobbies() {
        assertEquals(List.of("Tennis", "Reading"), underTest.getHobbies());
    }

    @Test
    void getRepoUrl() {
        assertEquals("https://github.com/hbvit7zoom/home-assignments-0224", underTest.getRepoUrl());
    }

    @Test
    void getPhone() {
        assertEquals("+79065602540", underTest.getPhone());
    }

    @Test
    void getCourseExpectations() {
        assertEquals(List.of("Learn Spring", "Learn instruments"), underTest.getCourseExpectations());
    }
}
