package com.csc205.project2;


// USED CHAT GPT TO GENERATE THIS CODE
public class Cube extends Shape {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double sideLength) {
        super();
        this.width = sideLength;
    }

    public double getSideLength() {
        return width;
    }

    public void setSideLength(double sideLength) {
        this.width = sideLength;
    }

    public double surfaceArea() {
        return 6.0 * Math.pow(width, 2);
    }

    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}