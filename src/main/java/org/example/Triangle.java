package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "triangles")
public class Triangle extends Shape{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="side1")
    private double side1;

    @Column(name="side2")
    private double side2;

    @Column(name="side3")
    private double side3;

    public Triangle(double side1, double side2, double side3, int r, int g, int b, int a) {
        super(new Color(r,g,b,a));
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle() {
        super();
    }
    @Override
    public double getArea(){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    @Override
    public double getPerimeter() {
        return (double) (side1 + side2 + side3);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
}