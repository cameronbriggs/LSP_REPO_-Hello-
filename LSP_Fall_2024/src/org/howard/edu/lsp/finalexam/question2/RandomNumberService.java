/**
 * Singleton service that provides random number generation using different strategies.
 */
public class RandomNumberService {

    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    /**
     * Private constructor to enforce singleton pattern.
     */
    private RandomNumberService() {}

    /**
     * Returns the singleton instance of RandomNumberService.
     * @return the singleton instance
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy to be used for random number generation.
     * @param strategy the random number strategy
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the current strategy.
     * @return a random positive integer
     * @throws IllegalStateException if no strategy is set
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Random number strategy is not set.");
        }
        return strategy.generateRandomNumber();
    }
}
