package ch.noseryoung.main;

public class TriangleValidator {

    /**
     * Checks if the Triangle is equilateral or not.
     * Returns only true if all sides equal the same lengths.
     *
     * @param t triangle to be evaluated
     * @return true the triangle is equilateral , false if not
     */
    public boolean isEquilateral(Triangle t) {

        if (t.getA() <= 0 || t.getB() <= 0 || t.getC() <= 0) {
            return false;
        } else if ((t.getA() + t.getB() < t.getC()) && (t.getA() + t.getC() < t.getB()) || ((t.getB() + t.getA() < t.getC()) && (t.getB() + t.getC() < t.getA())|| (t.getC() + t.getA() < t.getB()) && (t.getC() + t.getB() < t.getA()))) {
            return false;
        } else {
            return t.getA() == t.getB() && t.getB() == t.getC();
        }
    }

    /**
     * Checks if the Triangle is equilateral or not.
     * Returns only true if two sides equal the same lengths.
     *
     * @param t triangle to be evaluated
     * @return true the triangle is equilateral , false if not
     */
    public boolean isIsosceles(Triangle t) {
        if (t.getA() <= 0 || t.getB() <= 0 || t.getC() <= 0) {
            return false;
        } else if ((t.getA() + t.getB() < t.getC()) && (t.getA() + t.getC() < t.getB()) || ((t.getB() + t.getA() < t.getC()) && (t.getB() + t.getC() < t.getA())|| (t.getC() + t.getA() < t.getB()) && (t.getC() + t.getB() < t.getA()))){
            return false;
        } else {
            return t.getA() == t.getB() && t.getA() != t.getC() || t.getA() != t.getB() && t.getA() == t.getC() || t.getB() == t.getA() && t.getB() != t.getC() || t.getB() != t.getA() && t.getB() == t.getC() || t.getC() == t.getA() && t.getC() != t.getB() || t.getC() != t.getA() && t.getC() == t.getB();
        }
    }

    /**
     * Checks if the Triangle is a valid triangle.
     *
     * @param t triangle to be evaluated
     * @return true the triangle is scalene, false if not
     */
    public boolean isScalene(Triangle t) {

        if (t.getA() <= 0 || t.getB() <= 0 || t.getC() <= 0) {
            return false;
        } else if ((t.getA() + t.getB() < t.getC()) && (t.getA() + t.getC() < t.getB()) || ((t.getB() + t.getA() < t.getC()) && (t.getB() + t.getC() < t.getA())|| (t.getC() + t.getA() < t.getB()) && (t.getC() + t.getB() < t.getA()))){
            return false;
        } else {
            return !isEquilateral(t) && !isIsosceles(t);
        }
    }

}
