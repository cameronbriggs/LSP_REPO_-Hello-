/**
 * Renderer class for shapes.
 */
public class ShapeRenderer {

    private final ShapeFactory shapeFactory;

    public ShapeRenderer() {
        this.shapeFactory = ShapeFactory.getInstance();
    }

    /**
     * Renders a shape based on the given type.
     * @param shapeType the type of shape to render
     */
    public void renderShape(String shapeType) {
        try {
            Shape shape = shapeFactory.createShape(shapeType);
            shape.draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}
