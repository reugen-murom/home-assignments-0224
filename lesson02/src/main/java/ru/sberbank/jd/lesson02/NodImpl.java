package ru.sberbank.jd.lesson02;

/**
 * Реализация {@link Nod}.
 */
public class NodImpl implements Nod {

    @Override
    public int calculate(int first, int second) {
        if (first < 0 || second < 0) {
            throw new IllegalArgumentException("Arguments cannot be negative numbers");
        }
        if (first == 0 && second == 0) {
            throw new IllegalArgumentException("Both arguments cannot be equal to zero");
        }
        return gcd(Math.max(first, second), Math.min(first, second));
    }

    private int gcd(int bigger, int smaller) {
        if (smaller == 0) {
            return bigger;
        }
        return gcd(smaller, bigger % smaller);
    }
}
