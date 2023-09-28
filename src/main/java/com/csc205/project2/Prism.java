package com.csc205.project2;

//GENERATED CODE WITH CHAT GPT
public class Prism extends Shape {

    private double baseArea;  // Area of the prism's base
    private double height;

    public Prism() {
        super();
        this.baseArea = 0.0;
        this.height = 0.0;
    }

    public Prism(double baseArea, double height) {
        super();
        this.baseArea = baseArea;
        this.height = height;
    }

    public double getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        double lateralSurfaceArea = 2 * baseArea + 2 * Math.PI * (baseArea / (2 * Math.PI)) * height;
        return lateralSurfaceArea + 2 * baseArea;
    }

    @Override
    public double volume() {
        return baseArea * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Prism {");
        sb.append("base area=").append(baseArea);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
