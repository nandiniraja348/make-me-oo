package org.oop;

public class DistanceCalculator implements Calculator {

    @Override
    public double distance(Point from, Point to) {
        return Math.sqrt(Math.pow(to.getxDistance(from), 2) + Math.pow(to.getyDistance(from), 2));
    }

}
