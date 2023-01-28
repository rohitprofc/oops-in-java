package Exer_4;

public class AbsClass {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        tr.noOfSides();
        Trapezoid tz = new Trapezoid();
        tz.noOfSides();
        Hexagon hx = new Hexagon();
        hx.noOfSides();
    }
}

abstract class Shape {
    abstract void noOfSides();
}

class Trapezoid extends Shape {
    void noOfSides() {
        System.out.println("Trapezoid has four sides");
    }
}

class Triangle extends Shape {
    void noOfSides() {
        System.out.println("Triangle has three sides");
    }
}

class Hexagon extends Shape {
    void noOfSides() {
        System.out.println("Hexagon has six sides");
    }
}
/*
 * Output:-
 * Triangle has three sides
 * Trapezoid has four sides
 * Hexagon has six sides
 */
