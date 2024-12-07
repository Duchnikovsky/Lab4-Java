package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "rectangles")
public class Rectangle extends Shape {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "width")
    private double width;

    @Column(name = "height")
    private double height;

    public Rectangle(double width, double height, int r, int g, int b, int a) {
        super(new Color(r,g,b, a));
        this.width = width;
        this.height = height;
    }
    public Rectangle() {
        super();
    }

    @Override
    public double getArea(){
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}