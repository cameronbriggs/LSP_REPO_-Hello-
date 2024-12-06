/**
 * Factory class for creating shapes.
 * Implements the Singleton pattern.
 */
public class ShapeFactory {

    private static ShapeFactory instance;

    private ShapeFactory() {}

    /**
     * Returns the singleton instance of the ShapeFactory.
     * @return the singleton instance
     */
    public static synchronized ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates and returns a shape based on the given shape type.
     * @param shapeType the type of shape
     * @return the corresponding shape object
     * @throws IllegalArgumentException if the shape type is unknown
     */
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            throw new IllegalArgumentException("Shape type cannot be null");
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
