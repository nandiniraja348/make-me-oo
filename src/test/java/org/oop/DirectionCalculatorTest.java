package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DirectionCalculatorTest {
    Calculator directionCalculator = new DirectionCalculator();
    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        Assertions.assertEquals(0, directionCalculator.direction(origin, point1));
        Assertions.assertEquals(0, directionCalculator.direction(origin, point2));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        Assertions.assertEquals(Math.PI, directionCalculator.direction(origin, point1));
        Assertions.assertEquals(Math.PI, directionCalculator.direction(origin, point2));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        Assertions.assertEquals(Math.PI / 2, directionCalculator.direction(origin, point2));
        Assertions.assertEquals(Math.PI / 2, directionCalculator.direction(origin, point1));
    }
}
