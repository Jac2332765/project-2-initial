package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(1.0, 4.0);
        ThreeDimensionalShape Cone = new Cone(3.0, 2.0);
        ThreeDimensionalShape Torus = new Torus(27.0, 8.0);
        ThreeDimensionalShape Prism = new Prism(15.0, 21.0);



        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.add(Cone);
        shapes.add(Torus);
        shapes.add(Prism);

        shapes.forEach(System.out::println);
    }

}

