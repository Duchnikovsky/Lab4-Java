package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Color {
    public int r;
    private int g;
    private int b;
    private int alpha;

    public Color(){
        this(0, 0, 0, 255);
    }

    public Color(int r, int g, int b, int alpha) {
        if (r < 0 || g < 0 || b < 0 || alpha < 0 || r > 255 || g > 255 || b
                > 255 || alpha > 255) {
            throw new IllegalArgumentException("Valid data provided");
        }
    }

    public Color(int r, int g, int b){
        this(r, g, b, 255);
    }

    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r = r;
    }
    public int getG(){
        return g;
    }
    public void setG(int g){
        this.g = g;
    }
    public int getB(){
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getAlpha(){
        return alpha;
    }
    public void setAlpha(int alpha){
        this.alpha = alpha;
    }
}