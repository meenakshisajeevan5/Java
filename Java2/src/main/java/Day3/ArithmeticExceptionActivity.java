package Day3;

// Needs to be completed
public class ArithmeticExceptionActivity {
    public static void main(String[] args){
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10,0);

        obj.catchMe(10,2);
    }

    void catchMe(int num1, int num2) {
        // The following code results in an Exception.
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e){
            System.out.println("You cannot divide a number by zero.");
        }finally {
            System.out.println("Thank you for using this program.");
        }

    }
}