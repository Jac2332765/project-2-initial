package com.csc205.project2;


// GENERATED CODE WITH CHAT GPT

public class Cylinder extends Shape {

    private double r;
    private double h;

    public Cylinder() {
        super();
        this.r = 0.0;
        this.h = 0.0;

    }

    public Cylinder(double radius, double height) {
        r = radius;
        h = height;
    }

    public void setRadius(double radius) {
        r = radius;
    }
    public void setHeight(double height) {
        h = height;
    }
    public double getR() {
        return r;
    }
    public double getH() {
        return h;
    }

    @Override
    public double surfaceArea() {
        return  (double) ((((2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2))) * 100) / 100);
    }

    @Override
    public double volume() {
        return (double) ((Math.PI * Math.pow(r, 2) * h) * 100) / 100;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(h);
        sb.append(", radius=").append(r);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

}
