package ua.com.hrv;

public class Circle {

    private double radius;
    private double diameter;


    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double S() {
        return 3.14 * diameter * diameter / 4;
    }

    public double С() {
        return 2 * 3.14 * radius;
    }
}
