package me.cam.geometricpoints;

public class Point {

    private int x;
    private int y;

    // constructor
    public Point( int x0, int y0 ) {
        x = x0;
        y = y0;
    }

    // shifts the point by the specified amount
    public void translate( int dx, int dy ) {
        x = x + dx;
        y = y + dy;
    }

    // calculates this point's distance from (0,0) via pythagorus theorem
    public double distanceFromOrigin() {
        double dist = Math.sqrt( x*x + y*y );
        return dist;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Point b) {
        // The difference of both points plugged into pythagoras' theorem wll give the distance between the points
        return Math.sqrt(Math.pow(b.x - this.x, 2) + Math.pow(b.y - this.y, 2));
    }
}
