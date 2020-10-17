package org.oop;

public interface Calculator {

    default double distance(Point a, Point b) {
        return 0;
    }

    default double direction(Point a, Point b) {
        return 0;
    }
}
