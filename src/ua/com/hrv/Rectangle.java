package ua.com.hrv;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 15.5;
        this.width = 11.9;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double rectan() {
        return length * width;
    }

    public double per() {
        return 2 * (length + width);
    }
}
