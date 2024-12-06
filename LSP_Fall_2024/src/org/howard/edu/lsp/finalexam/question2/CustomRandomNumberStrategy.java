/**
 * Implementation of RandomNumberStrategy using a custom random number algorithm.
 * This uses a simple Linear Congruential Generator (LCG) algorithm.
 */
public class CustomRandomNumberStrategy implements RandomNumberStrategy {

    private long seed = System.currentTimeMillis();
    private static final long MULTIPLIER = 6364136223846793005L;
    private static final long INCREMENT = 1L;
    private static final long MODULUS = (long) Math.pow(2, 31);

    @Override
    public int generateRandomNumber() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return (int) (seed & Integer.MAX_VALUE); // Ensures positive integers
    }
}
