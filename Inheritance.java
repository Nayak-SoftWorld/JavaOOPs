class Shape { // Base or Parent Class
    String color;

    public void area() {
        System.out.println("Display Area..!");
    }
}

class Triangle extends Shape { // Single Level
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
};

// class EquilateralTriangle extends Triangel { // Multi Level
// public void area(int l, int h) {
// System.out.println((1 / 2) * l * h);
// }
// }

class Circul extends Shape { // Hierarchial Inheritance
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

class TwoEquilateralTriangle extends Triangle { // Hybride Inheritance
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
