package me.cam.geometricpoints;

/**
 * Author: Cameron Janssen
 * Acknowledgements: None
 * Purpose: Adding methods and writing
 * test classes to test a given class
 */
public class TestPoint {
    public static void main(String[] args) {

        // Defining new Point objects
        Point p = new Point(17, 9);
        System.out.println("Point 1 is: " + p.toString());

        Point p2 = new Point(4, -1);
        System.out.println("Point 2 is:" + p2.toString());

        // Moving Point 1
        p.translate(3, 1);
        System.out.println("Point 1 is (moved to): " + p.toString());
        System.out.println("Point 1 is: " + p.distanceFromOrigin() + " from (0,0)");
        System.out.println("Point 1 is: " + p.distanceTo(p2) + " away from Point 2");
    }
}