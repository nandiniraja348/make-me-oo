package org.oop;

public class DirectionCalculator implements Calculator {

    @Override
    public double direction(Point from, Point to) {
        return Math.atan2(to.getyDistance(from), to.getxDistance(from));
    }

}
