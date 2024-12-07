package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    public static void describe(Shape shape){
        logger.info("Shape color: " + shape.getColor());
        logger.info("Shape area: " + shape.getArea());
        logger.info("Shape perimeter: " + shape.getPerimeter());
        shape.getColorDescription();
    }

    public static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);
}