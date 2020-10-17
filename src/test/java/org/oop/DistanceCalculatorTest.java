package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceCalculatorTest {
    Calculator distanceCalculator = new DistanceCalculator();
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        Assertions.assertEquals(0, distanceCalculator.distance(origin, origin));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);


        Assertions.assertEquals(1, distanceCalculator.distance(origin, point1));
        Assertions.assertEquals(1, distanceCalculator.distance(origin, point2));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        Assertions.assertEquals(2, distanceCalculator.distance(point1, point2));
    }


}
