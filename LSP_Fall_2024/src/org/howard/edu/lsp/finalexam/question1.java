import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    // Tests for factorial method
    @Test
    void testFactorialOfZero() {
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, 
                () -> mathUtils.factorial(-1));
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    // Tests for isPrime method
    @Test
    void testPrimeNumber() {
        assertTrue(mathUtils.isPrime(7), "7 should be a prime number");
    }

    @Test
    void testNonPrimeNumber() {
        assertFalse(mathUtils.isPrime(10), "10 is not a prime number");
    }

    @Test
    void testPrimeNumberEdgeCase() {
        assertFalse(mathUtils.isPrime(1), "1 is not a prime number");
    }

    // Tests for gcd method
    @Test
    void testGCDOfTwoNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    void testGCDWhenOneNumberIsZero() {
        assertEquals(8, mathUtils.gcd(0, 8), "GCD of 0 and 8 should be 8");
    }

    @Test
    void testGCDWhenBothNumbersAreZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, 
                () -> mathUtils.gcd(0, 0));
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }
}
