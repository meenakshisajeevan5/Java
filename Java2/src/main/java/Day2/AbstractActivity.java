package Day2;

public class AbstractActivity {
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        System.out.println("Rectangle color: " +rectangle.getColor()) ;

        System.out.println("Rectangle area: " + rectangle.calculateArea(2,4,0));
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter(2,4,0));

        Circle circle = new Circle();
        circle.setColor("Pink");
        System.out.println("Circle color: " + circle.getColor());

        System.out.println(("Circle area: ") + circle.calculateArea(0,0,5));
        System.out.println("Circle perimeter: " + circle.calculatePerimeter(0,0,5));
    }
}
