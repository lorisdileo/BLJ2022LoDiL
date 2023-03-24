package ch.noseryoung.main;

import java.util.*;

public class TriangleManager {

    private ShapeSideCreator generator;
    private TriangleValidator triangleValidator;
    private ArrayList<Triangle> triangles;

    public TriangleManager(ShapeSideCreator generator) {
        this.generator = generator;
        triangleValidator = new TriangleValidator();
        triangles = new ArrayList<>();
    }

    /**
     * This method is the entry point for the triangle manager.
     * It creates at least one triangle with the <code>ShapeSideCreator</code> instance
     * and prints the triangle with its information.
     */
    public void run() {



        printWelcomeText();

        for (int i = 0; i < 5; i++) {
            Triangle triangle = generateTriangle();
            boolean isEquilateral = triangleValidator.isEquilateral(triangle);
            boolean isIsosceles = triangleValidator.isIsosceles(triangle);
            boolean isScalene = triangleValidator.isScalene(triangle);

            triangles.add(triangle);
            printTriangleInfo(triangle, isEquilateral, isIsosceles, isScalene);
        }
    }

    /**
     * This method calls an implementation from the <code>ShapeSideCreator</code> Interface
     * to get three sides for a new triangle.
     *
     * @return created triangle
     */
    private Triangle generateTriangle() {
        return new Triangle(generator.createSide(), generator.createSide(), generator.createSide());
    }

    /**
     * This Method prints out the Triangle Information with the result form the validation.
     *
     * @param t
     * @param isEquilateral
     * @param isIsoceles
     * @param isScalene
     */
    private void printTriangleInfo(Triangle t, boolean isEquilateral, boolean isIsoceles, boolean isScalene) {
        System.out.println("*********************************");
        System.out.println("Side A: " + t.getA());
        System.out.println("Side B: " + t.getB());
        System.out.println("Side C: " + t.getC());
        System.out.println();
        System.out.println("Triangle: " + t);
        System.out.println("Is Equilateral: " + isEquilateral);
        System.out.println("Is Isosceles: " + isIsoceles);
        System.out.println("Is Scalene: " + isScalene);
        System.out.println("*********************************");


    }

    /**
     * This method returns out all generated Triangles, which are sorted by side.
     * The Triangles are compared with its shortest side. The longest "shortest Side" is listed first.
     *
     * @return sorted triangle list
     */
    public List<Double> getAllTrianglesSortedByShortestSide() {
        double shortestSide = 0;
        List<Double> values = new ArrayList<>();
        for (Triangle tr : triangles) {
            if (tr.getA() < tr.getB() && tr.getA() < tr.getC()) {
                shortestSide = tr.getA();
            } else if (tr.getB() < tr.getA() && tr.getB() < tr.getC()) {
                shortestSide = tr.getB();
            } else {
                shortestSide = tr.getC();
            }
            values.add(shortestSide);
            Collections.sort(values);
        }
        return values;
    }

    /**
     * This method returns out all generated Triangles, which are sorted by side.
     * The Triangles are compared with its longest side. The longest "longest Side" is listed first.
     *
     * @return sorted triangle list
     */
    public List<Double> getAllTrianglesSortedByLongestSide() {
        double largestSide = 0;
        List<Double> values = new ArrayList<>();
        for (Triangle tr : triangles) {
            if (tr.getA() > tr.getB() && tr.getA() > tr.getC()) {
                largestSide = tr.getA();
            } else if (tr.getB() > tr.getA() && tr.getB() > tr.getC()) {
                largestSide = tr.getB();
            } else {
                largestSide = tr.getC();
            }
            values.add(largestSide);
            Collections.sort(values);
        }
        return values;
    }


    /**
     * This method prints a welcome text for the triangle manager.
     */
    private void printWelcomeText() {
        System.out.println("Welcome to the Triangle Manager");
    }
}
