package module10;

public class Calculator {

    // Two add methods
    public int add(int a, int b){
       return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    //Subtract method
    public int subtract(int a, int b){
        return a - b;
    }

    //Divide method
    public int divide(int a, int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("Error: cannot divide by zero");
            return 0;
        }
    }

    //Multiply method
    public int multiply(int a, int b) throws InvalidInputException{
        if (a<0 || b < 0){
            throw new InvalidInputException("Negative numbers are not allowed");
        }
        return a * b;
    }
}
