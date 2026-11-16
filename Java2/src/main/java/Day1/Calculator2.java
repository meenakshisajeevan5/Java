package Day1;

public class Calculator2 {

    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";
    // Default constructor
    public Calculator2() {
    }

    // Parameterized constructor accepting calculatorType
    public Calculator2(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Getter for calculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    // Setter for calculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    public int add(int x, int y) {
       int sum = x + y;
       return sum;
}

// Subtract (Handles absolute or conditional difference)
   public int subtract(int x, int y) {
    int diff = 0;
    if (x > y) {
        diff = x - y;
    } else {
        diff = y - x;
    }
    return diff;
}

public int multiply(int[] numbers) {
    int temp = 1;
    for (int i = 0; i < numbers.length; i++) {
        temp = temp * numbers[i];
    }
    return temp;
}

public int divide(int x, int y) {
    int divValue = 0;
    if (y != 0) {
        divValue = x / y;
    } else {
        System.out.println("Cannot divide by zero");
    }
    return divValue;
}
}