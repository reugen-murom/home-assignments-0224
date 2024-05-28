package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Реализация {@link Greeting}.
 */
public class GreetingImpl implements Greeting {

    @Override
    public String getFirstName() {
        return "Evgeniy";
    }

    @Override
    public String getLastName() {
        return "Rumyantsev";
    }

    @Override
    public int getBirthYear() {
        return 1984;
    }

    @Override
    public Collection<String> getHobbies() {
        return List.of("Tennis", "Reading");
    }

    @Override
    public String getRepoUrl() {
        return "https://github.com/hbvit7zoom/home-assignments-0224";
    }

    @Override
    public String getPhone() {
        return "+79065602540";
    }

    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("Learn Spring", "Learn instruments");
    }
}
