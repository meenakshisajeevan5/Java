package Day2;

public abstract class Shape {
    public String color;

    public Shape() {
    }

    public abstract double calculateArea(double length, double breadth, double radius);

    public abstract double calculatePerimeter(double length, double breadth, double radius);

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}


