import org.example.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle(3, 4, 5, 255, 0, 0, 0);
        assertEquals(6, triangle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5, 255, 0, 0, 0);
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    public void testGetColor() {
        Triangle triangle = new Triangle(3, 4, 5, 255, 0, 0, 0);
        assertNotNull(triangle.getColor());
    }
}