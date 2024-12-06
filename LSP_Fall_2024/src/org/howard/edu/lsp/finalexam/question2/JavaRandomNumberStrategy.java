import java.util.Random;

/**
 * Implementation of RandomNumberStrategy using Java's built-in Random class.
 */
public class JavaRandomNumberStrategy implements RandomNumberStrategy {

    private Random random = new Random();

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensures positive integers
    }
}
