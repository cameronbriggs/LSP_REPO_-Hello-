/**
 * Client program that demonstrates the use of RandomNumberService.
 */
public class RandomNumberClient {

    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's built-in random number generator
        service.setStrategy(new JavaRandomNumberStrategy());
        System.out.println("Random number (Java strategy): " + service.generateRandomNumber());

        // Use custom random number generator
        service.setStrategy(new CustomRandomNumberStrategy());
        System.out.println("Random number (Custom strategy): " + service.generateRandomNumber());
    }
}
