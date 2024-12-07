import org.example.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShapeDAOTest {
    private ShapeDAO shapeDAO;

    @BeforeAll
    public void setup() {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-test.cfg.xml")
                .buildSessionFactory();
        shapeDAO = new ShapeDAO(sessionFactory);
    }

    @AfterAll
    public void tearDown() {
        shapeDAO.close();
    }

    @Test
    public void testSaveAndFindRectangle() {
        Rectangle rectangle = new Rectangle(10, 5, 255, 0, 0, 255);
        shapeDAO.save(rectangle);

        List<Rectangle> rectangles = shapeDAO.findAll(Rectangle.class);
        assertFalse(rectangles.isEmpty());
        assertEquals(10, rectangles.getFirst().getWidth());
        assertEquals(5, rectangles.getFirst().getHeight());
    }

    @Test
    public void testSaveAndFindTriangle() {
        Triangle triangle = new Triangle(3, 4, 5, 0, 255, 0, 255);
        shapeDAO.save(triangle);

        List<Triangle> triangles = shapeDAO.findAll(Triangle.class);
        assertFalse(triangles.isEmpty());
        assertEquals(3, triangles.getFirst().getSide1());
        assertEquals(4, triangles.getFirst().getSide2());
        assertEquals(5, triangles.getFirst().getSide3());
    }

    @Test
    public void testUpdateRectangle() {
        Rectangle rectangle = new Rectangle(15, 7, 0, 0, 255, 255);
        shapeDAO.save(rectangle);

        List<Rectangle> rectangles = shapeDAO.findAll(Rectangle.class);
        Rectangle savedRectangle = rectangles.getFirst();
        savedRectangle.setWidth(20);
        shapeDAO.update(savedRectangle);

        Rectangle updatedRectangle = shapeDAO.findById(savedRectangle.getId(), Rectangle.class);
        assertEquals(20, updatedRectangle.getWidth());
    }

    @Test
    public void testDeleteTriangle() {
        Triangle triangle = new Triangle(6, 8, 10, 255, 255, 0, 255);
        shapeDAO.save(triangle);

        List<Triangle> triangles = shapeDAO.findAll(Triangle.class);
        Triangle savedTriangle = triangles.getFirst();
        shapeDAO.delete(savedTriangle);

        List<Triangle> trianglesAfterDelete = shapeDAO.findAll(Triangle.class);
        assertTrue(trianglesAfterDelete.isEmpty());
    }
}
