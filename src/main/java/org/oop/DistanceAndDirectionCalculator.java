package org.oop;

public class DistanceAndDirectionCalculator {

    public static double distance(Point from, Point to) {
        return Math.sqrt(Math.pow(to.getxDistance(from), 2) + Math.pow(to.getyDistance(from), 2));
    }

    public static double direction(Point from, Point to) {
        return Math.atan2(to.getyDistance(from), to.getxDistance(from));
    }
}
