package org.oop;

public class Point {
    private double x;
    private double y;

    double getyDistance(Point from) {
        return this.y - from.y;
    }

    double getxDistance(Point from) {
        return this.x - from.x;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
