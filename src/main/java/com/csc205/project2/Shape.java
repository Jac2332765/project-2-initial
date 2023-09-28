package com.csc205.project2;

abstract class Shape implements ThreeDimensionalShape{
    protected String name;
    protected double sa;
    protected double v;
    public Shape() {
        name = "no name";
        sa = 0.0;
        v = 0.0;
    }
    public Shape(String Name, double surfaceArea, double v) {
        name = Name;
        sa = surfaceArea;
        v = v;

    }
}
