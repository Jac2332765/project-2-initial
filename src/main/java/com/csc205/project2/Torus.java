package com.csc205.project2;

public class Torus extends Shape {

    private double majorRadius; // Major radius (distance from the center of the tube to the center of the torus)
    private double minorRadius; // Minor radius (radius of the tube)

    public Torus() {
        super();
        this.majorRadius = 0.0;
        this.minorRadius = 0.0;
    }

    public Torus(double majorRadius, double minorRadius) {
        super();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = 4.0 * Math.PI * Math.pow(majorRadius, 2) * minorRadius;
        return surfaceArea;
    }

    @Override
    public double volume() {
        double volume = 2.0 * Math.PI * Math.pow(minorRadius, 2) * Math.pow(majorRadius, 2);
        return volume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Torus {");
        sb.append("major radius=").append(majorRadius);
        sb.append(", minor radius=").append(minorRadius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}