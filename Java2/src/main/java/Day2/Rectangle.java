package Day2;

public class Rectangle extends Shape {

    @Override
    public double calculateArea(double length,double breadth,double radius){
        return length * breadth;
    }
    @Override
    public double calculatePerimeter(double length,double breadth,double radius){
        return 2 * (length + breadth);
    }
}



