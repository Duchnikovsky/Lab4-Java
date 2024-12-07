import org.example.Color;
import org.example.Shape;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testGetColor() {
        Shape shape = new Shape(new Color(255, 255, 255));
        assertNotNull(shape.getColor());
    }

    @Test
    public void testGetColorDescription() {
        Shape shape = new Shape(new Color(255, 0, 0));
        shape.getColorDescription();
    }
}