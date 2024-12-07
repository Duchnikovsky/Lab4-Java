import org.example.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(20, 5, 255, 0, 150, 0);
        assertEquals(100, rectangle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(20, 5, 255, 0, 150, 0);
        assertEquals(50, rectangle.getPerimeter());
    }

    @Test
    public void testGetColor() {
        Rectangle rectangle = new Rectangle(20, 5, 255, 0, 150, 0);
        assertNotNull(rectangle.getColor());
    }
}