package ru.sberbank.jd.lesson02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тест на {@link NodImpl}.
 */
class NodImplTest {

    private final NodImpl underTest = new NodImpl();

    @Test
    void calculateSuccess() {
        assertEquals(4, underTest.calculate(24, 28));
        assertEquals(1, underTest.calculate(1, 28));
        assertEquals(7, underTest.calculate(49, 700));
        assertEquals(233, underTest.calculate(0, 233));
        assertEquals(1, underTest.calculate(2, Integer.MAX_VALUE));
        assertEquals(21, underTest.calculate(1071, 462));
    }

    @Test
    void calculateNegative() {
        assertThrows(IllegalArgumentException.class, () -> underTest.calculate(-24, 28));
    }

    @Test
    void calculateZero() {
        assertThrows(IllegalArgumentException.class, () -> underTest.calculate(0, 0));
    }
}
