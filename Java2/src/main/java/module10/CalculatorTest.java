package module10;
 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    // 4 TESTS FOR ADD
    @Test
    void addIntPositive(){
        assertEquals(8, calc.add(5,3));
    }
    @Test
    void addIntNegative(){
        assertEquals(-2, calc.add(-5, 3));
    }
    @Test
    void addDoublePositive(){
        assertEquals(5.5, calc.add(2.5, 3.0), 0.001);
    }
    @Test
    void addDoubleNegative(){
        assertEquals(-1.0, calc.add(-3.5, 2.5), 0.001);
    }
    //TEST FOR SUBTRACT
    @Test
    void subtractPositiveResult(){
        assertEquals(2, calc.subtract(5,3));
    }
    @Test
    void subtractNegativeResult(){
        assertEquals(-2, calc.subtract(3,5));
    }
    // TEST FOR DIVIDE
    @Test
    void divideNormal(){
        assertEquals(5, calc.divide(10, 2));
    }
    @Test
    void divideByZero(){
        assertEquals(0, calc.divide(10, 0));
    }
    //TEST FOR MULTIPLY
    @Test
    void multiplyNormal(){
        try{
            assertEquals(12, calc.multiply(3,4));
        }catch (InvalidInputException e){
            fail("Should not throw exception for valid input");
        }
    }
    @Test
    void multiplyInvalidInput(){
        try{
            calc.multiply(-3,4);
            fail("Expected InvalidException");
        }catch (InvalidInputException e){
            assertEquals("Negative numbers are not allowed", e.getMessage());
        }

    }
    @Test
    void multiplySecondNumberNegative() {
        try {
            calc.multiply(3, -4);
            fail("Expected InvalidInputException");
        } catch (InvalidInputException e) {
            assertEquals("Negative numbers are not allowed", e.getMessage());
        }
    }

}
